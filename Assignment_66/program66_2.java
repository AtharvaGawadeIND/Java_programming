import java.util.Scanner;

class program66_2
{
    public static int chkBit(int no, int pos)
    {
    int mask = 0x1 ;
    mask = mask<< (pos - 1);

        return no & ~mask;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int no = sc.nextInt();

         System.out.print("Enter postion ");
        int pos = sc.nextInt();

        System.out.println("Modified number: " + chkBit(no, pos));

        sc.close();
    }
}

/*

Sample Input 
Enter number 10
Enter postion 2

Output 
Modified number: 8


*/
