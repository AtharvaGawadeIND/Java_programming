import java.util.Scanner;
import java.io.*;

public class program61_5
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = sobj.nextLine();

        File fobj = new File(fileName);

        long fileSize = fobj.length();      
        long halfSize = fileSize / 2;       

        FileInputStream fiobj = new FileInputStream(fileName);

        FileOutputStream foobj1 = new FileOutputStream("First.txt");


        
        FileOutputStream foobj2 = new FileOutputStream("Second.txt");

        int data = 0;
        long count = 0;

        while((data = fiobj.read()) != -1 && count < halfSize)
        {
            foobj1.write(data);
            count++;
        }

        while((data = fiobj.read()) != -1)
        {
            foobj2.write(data);
        }

              System.out.println("File split successfully into two halves");
    }
}

/*
Enter file name : Marvellous.txt
File split successfully into two halves

*/