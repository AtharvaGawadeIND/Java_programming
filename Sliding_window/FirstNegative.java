
//vQuestion 2 — First Negative Number in Every Window of Size K
import java.util.*;

public class FirstNegative {

  public static void firstNegative(int[] arr , int k)

  {int left = 0;

    Deque<Integer> deque = new LinkedList<>();

  for(int right = 0 ; right < arr.length ; right ++)
  {
    // if the element is negative add it to the queue the   index of the element

    if(arr[right]<0)
    {
      deque.addLast(right);
    }

    if(right - left + 1 == k ) // this makes sure that the window size is always threee
    {
      while(deque.isEmpty() == false && deque.peekFirst() <left)
      {
          deque.removeFirst();
      }
    }

    // the above loops checks if the list is empty or if the list is not empty this checks the index of the window element fits the index of bounds of the window if not it is removed

    // the next function finally prints the empty first negative element  of each window 

    if(deque.isEmpty() == false)
    {
        System.out.println(arr[deque.peekFirst()]+ " ");

    }

    else 
    {
      System.out.println(" 0");
    }

    left ++;

    
  }


}

 public static void main(String A[])
  {
    int [] arr = {12 , -1 , -7 , 8 ,-15 , 30 , 16 ,28};

    int k = 3;

    firstNegative(arr , k);
  }
}
