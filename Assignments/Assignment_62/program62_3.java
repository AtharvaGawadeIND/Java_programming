import java.util.Scanner;
import java.io.*;

public class program62_3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = sobj.nextLine();

        System.out.print("Enter number of bytes : ");
        int bytes = sobj.nextInt();

        File fobj = new File(fileName);
        long fileSize = fobj.length();

        FileInputStream fiobj = new FileInputStream(fileName);
        FileOutputStream foobj1 = new FileOutputStream("ppa.txt");

        fiobj.skip(fileSize - bytes);

        int data = 0;
        while((data = fiobj.read()) != -1)
        {
            foobj1.write(data);
        }

        System.out.println("Last N bytes copied successfully");
    }
}
/////////////////////////////////////////////////////////////////
/*
Enter file name : LB.txt
Enter number of bytes : 50
Last N bytes copied successfully

*/
