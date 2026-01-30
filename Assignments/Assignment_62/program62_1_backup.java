import java.util.Scanner;
import java.io.*;

public class program62_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(fileName);

        int count = 0;
        while(fiobj.read() != -1)
        {
            count++;
        }

        System.out.println("Total bytes read : " + count);
    }
}

//////////////////////////////////////////////////////////
 /*

 program61_1.java

Total bytes read : 508

*/