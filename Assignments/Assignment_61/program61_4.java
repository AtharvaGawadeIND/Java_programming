import java.util.Scanner;
import java.io.*;

public class program61_4
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter first input file name : ");
        String file1 = sobj.nextLine();

        System.out.print("Enter second input file name : ");
        String file2 = sobj.nextLine();

        System.out.print("Enter output file name : ");
        String outFile = sobj.nextLine();

        FileInputStream fiobj1 = new FileInputStream(file1);
        FileInputStream fiobj2 = new FileInputStream(file2);
        FileOutputStream foobj = new FileOutputStream(outFile);

        byte buffer[] = new byte[1024];
        int bytesRead = 0;

        
        while((bytesRead = fiobj1.read(buffer)) != -1)
        {
            foobj.write(buffer, 0, bytesRead);
        }

        
        while((bytesRead = fiobj2.read(buffer)) != -1)
        {
            foobj.write(buffer, 0, bytesRead);
        }
;

        System.out.println("Files merged successfully");
    }
}

/////////////////////////////////////////////////////////
/*

Enter first input file name : Marvellous.txt
Enter second input file name : ppa.txt
Enter output file name : LB.txt
Files merged successfully

*/

