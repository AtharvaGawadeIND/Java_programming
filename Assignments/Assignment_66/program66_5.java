import java.util.Scanner;

class program66_4
{
    public static int nibbleBit(int no)
    {
     int mask = 0xF000000F;   
        return no ^ mask;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number ");
        int no = sc.nextInt();


        System.out.println("Modified number: " + nibbleBit(no));
        System.out.printf("Modified number : 0x%X%n", nibbleBit(no));

        sc.close();
    }
}

/*
Sample Input :
Enter number 305419896

Output 
Modified number: -499886473
Modified number : 0xE2345677




*/
