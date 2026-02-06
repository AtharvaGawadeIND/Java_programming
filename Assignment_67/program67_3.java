import java.util.Scanner;

class Program67_3
{
    static boolean chkBit(int ino)
    {
        int imask = (1 << 8) | (1 << 11);   
        return (ino & imask) != 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int no = sc.nextInt();

        if (chkBit(no))
            System.out.println("TRUE");
        else
            System.out.println("FALSE");

        sc.close();
    }
}
