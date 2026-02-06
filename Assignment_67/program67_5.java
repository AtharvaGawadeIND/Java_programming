import java.util.Scanner;

class Program67_5
{
    static int toggleBitRange(int ino, int istart, int iend)
    {
        int imask = 0;

        for (int i = istart; i <= iend; i++)
        {
            imask = imask | (1 << (i - 1));
        }

        return ino ^ imask;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();

        System.out.print("Enter start position: ");
        int start = sc.nextInt();

        System.out.print("Enter end position: ");
        int end = sc.nextInt();

        int result = toggleBitRange(no, start, end);

        System.out.println("Updated number: " + result);
        sc.close();
    }
}

/*

Sample Input :
Enter number: 897
Enter start position: 9

Output:
Enter end position: 13
Updated number: 7297



*/