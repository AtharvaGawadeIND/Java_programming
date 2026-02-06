import java.util.Scanner;

class Program67_1
{
    static int Countone(int ino)
    {
        int icount = 0;

        while (ino != 0)
        {
            if ((ino & 1) == 1)
                icount++;

            ino = ino >> 1;
        }
        return icount;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();

        System.out.println("Count of ON bits: " + Countone(no));
        sc.close();
    }
}

/*

Input :
Enter number: 11

Output:
Count of ON bits: 3

*/