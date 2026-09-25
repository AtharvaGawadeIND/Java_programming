#!/usr/bin/env bash

set -u

repo="$(cd "$(dirname "${BASH_SOURCE[0]}")/.." && pwd)"
source_dir="$repo/Sliding_window"

snapshot() {
  while IFS= read -r -d '' file; do
    relative_path="${file#"$source_dir"/}"
    printf '%s ' "$relative_path"
    sha256sum "$file"
  done < <(find "$source_dir" -type f -print0 | sort -z)
}

commit_message() {
  first_status="$(git -C "$repo" diff --cached --name-status -- Sliding_window | head -n 1)"
  first_path="${first_status#*$'\t'}"
  file_name="$(basename "$first_path")"
  topic="${file_name%.*}"

  if grep -RqiE 'first[[:space:]_-]*negative|negative.*window' "$source_dir"; then
    topic="first negative number in window"
  elif grep -RqiE 'max[[:space:]_-]*sum|maximum.*sum' "$source_dir"; then
    topic="maximum sum sliding window"
  else
    topic="$(printf '%s' "$topic" | sed -E 's/([a-z0-9])([A-Z])/\1 \2/g; s/[_-]+/ /g') solution"
  fi

  case "${first_status%%$'\t'*}" in
    A) printf 'Add %s' "$topic" ;;
    D) printf 'Delete %s' "$topic" ;;
    *) printf 'Update %s' "$topic" ;;
  esac
}

last_snapshot="$(snapshot)"
pending_snapshot=""
changed_at=0
pending_push=0

while true; do
  current_snapshot="$(snapshot)"

  if [[ "$current_snapshot" != "$last_snapshot" ]]; then
    last_snapshot="$current_snapshot"
    pending_snapshot="$current_snapshot"
    changed_at="$(date +%s)"
  fi

  if [[ -n "$pending_snapshot" && "$current_snapshot" == "$pending_snapshot" ]] && (( $(date +%s) - changed_at >= 4 )); then
    git -C "$repo" add -A -- Sliding_window

    if ! git -C "$repo" diff --cached --quiet -- Sliding_window; then
      git -C "$repo" commit -m "$(commit_message)"
      pending_push=1
    fi

    pending_snapshot=""
  fi

  if [[ "$pending_push" -eq 1 ]] && git -C "$repo" push origin main; then
    pending_push=0
  fi

  sleep 2
done