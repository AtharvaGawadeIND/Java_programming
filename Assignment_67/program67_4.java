import java.util.Scanner;

class Program67_4
{
    static boolean chkBit(int ino, int ipos1, int ipos2)
    {
        int mask = (1 << (ipos1 - 1)) | (1 << (ipos2 - 1));
        return (ino & mask) != 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();

        System.out.print("Enter position 1: ");
        int pos1 = sc.nextInt();

        System.out.print("Enter position 2: ");
        int pos2 = sc.nextInt();

        if (chkBit(no, pos1, pos2))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        sc.close();
    }
}

/*

Sample Input :
Enter number: 10
Enter position 1: 2
Enter position 2: 7

Output :
TRUE



*/
