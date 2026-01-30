import java.util.Scanner;
import java.io.*;

public class program63_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source file name : ");
        String src = sobj.nextLine();

        System.out.print("Enter destination file name : ");
        String dest = sobj.nextLine();

        long start, end;

        FileInputStream fiobj1 = new FileInputStream(src);
        FileOutputStream foobj1 = new FileOutputStream(dest);

        start = System.currentTimeMillis();
        int data = 0;
        while((data = fiobj1.read()) != -1)
        {
            foobj1.write(data);
        }
        end = System.currentTimeMillis();

        System.out.println("Time required using bufferedClass is : " + (end - start) + " ms");

        
        FileInputStream fiobj2 = new FileInputStream(src);
        BufferedInputStream biobj = new BufferedInputStream(fiobj2);

        FileOutputStream foobj2 = new FileOutputStream(dest);
        BufferedOutputStream boobj = new BufferedOutputStream(foobj2);

        start = System.currentTimeMillis();
        while((data = biobj.read()) != -1)
        {
            boobj.write(data);
        }
        boobj.flush();
        end = System.currentTimeMillis();

        System.out.println("Time required using bufferedClass is : " + (end - start) + " ms");
    }
}

/////////////////////////////////////////////////////////////////////////
/*
Enter source file name : ppa.txt
Enter destination file name : lb.txt
Time required using bufferedClass is : 13 ms
Time required using bufferedClass is : 1 ms
*/