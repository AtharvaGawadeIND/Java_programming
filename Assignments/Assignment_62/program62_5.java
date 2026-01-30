import java.util.Scanner;
import java.io.*;

public class program62_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        try
        {
            System.out.print("Enter file name : ");
            String fileName = sobj.nextLine();

            FileInputStream fiobj = new FileInputStream(fileName);

            int data = 0;
            while((data = fiobj.read()) != -1)
            {
                System.out.print((char)data);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("File not found");
        }
        catch(IOException e)
        {
            System.out.println("I/O error");
        }
        catch(Exception e)
        {
            System.out.println("Error exceptiom");
        }
    }
}

/*
Enter file name : lb.txt
File not found
*/
