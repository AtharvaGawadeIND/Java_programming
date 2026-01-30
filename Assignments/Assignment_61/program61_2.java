import java.util.Scanner;
import java.io.*;

public class program61_2
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

        byte buffer[] = new byte[1024];   
        int bytesRead = 0;

        System.out.println("\nContents of source file:\n");

        while((bytesRead = fiobj.read(buffer)) != -1)
        {
            foobj.write(buffer, 0, bytesRead);  
            System.out.print(new String(buffer, 0, bytesRead)); 
        }

     

        System.out.println("\n\nFile copied successfully");
    }
}

/////////////////////////////////////////////////////////////
/*
Enter source file name : Marvellous.txt
Enter destination file name : ppa.txt

Contents of source file:

Jay Ganesh..

File copied successfully
 */