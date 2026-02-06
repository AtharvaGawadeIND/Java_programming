import java.util.Scanner;

class program66_3
{
    public static int chkBit(int no, int pos)
    {
     int mask = 1 ;
     
     mask = mask<< (pos - 1);
        return no | mask;
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

Sample Output
Enter postion 3
Modified number: 14


*/
