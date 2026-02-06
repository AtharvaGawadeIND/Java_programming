import java.util.Scanner;

class Program67_2
{
    static void commonBits(int ino1, int ino2)
    {
        int common = ino1 & ino2;
        int ipos = 1;

        while (common != 0)
        {
            if ((common & 1) == 1)
                System.out.print(ipos + " ");

            common = common >> 1;
            ipos++;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int no1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int no2 = sc.nextInt();

        commonBits(no1, no2);
        sc.close();
    }
}
