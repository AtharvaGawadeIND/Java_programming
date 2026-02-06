import java.util.Scanner;

class program66_1
{
    public static boolean chkBit(int no, int pos)
    {
        int mask = 0x1;
        mask = mask << (pos - 1);
        return (no & mask) == mask;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int no = sc.nextInt();

         System.out.print("Enter postion ");
        int pos = sc.nextInt();

        if (chkBit(no, pos))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        sc.close();
    }
}


/*
sample Input :

Enter number 10
Enter postion 2

Output :
TRUE


*/