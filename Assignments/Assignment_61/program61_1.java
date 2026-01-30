import java.util.Scanner;
import java.io.*;

public class program61_1
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        FileInputStream fiobj = new FileInputStream(src);
        FileOutputStream foobj = new FileOutputStream(dest);

        int data = 0;

        while((data = fiobj.read()) != -1)
        {
            foobj.write(data); 
            System.out.println((char)data);
        }


        System.out.println("File copied successfully");
    }
}

//////////////////////////////////////////////////////////////////////
/*

Enter source file name : Marvellous.txt
Enter destination file name : ppa.txt
J
a
y
 
G
a
n
e
s
h
.
.
File copied successfully
 */