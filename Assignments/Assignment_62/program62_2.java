import java.util.Scanner;
import java.io.*;

public class program62_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter number of bytes : ");
        int N = sobj.nextInt();

        FileInputStream fiobj = new FileInputStream(src);
        FileOutputStream foobj1 = new FileOutputStream("LB.txt");

        int data = 0, count = 0;

        while((data = fiobj.read()) != -1 && count < N)
        {
            foobj1.write(data);
            count++;
        }

        System.out.println("First N bytes copied successfully");
    }
}


///////////////////////////////////////////////////////////////
/// 
/*
Enter source file name : program62_1.java
Enter number of bytes : 50
First N bytes copied successfully
*/