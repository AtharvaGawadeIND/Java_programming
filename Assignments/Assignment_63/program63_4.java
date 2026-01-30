import java.util.Scanner;
import java.io.*;

public class program63_4
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter directory name : ");
        String dirName = sobj.nextLine();

        File dobj = new File(dirName);
        File fArr[] = dobj.listFiles();

        FileOutputStream foobj = new FileOutputStream("Combined.bin");

        for(int i = 0; i < fArr.length; i++)
        {
            if(fArr[i].isFile())
            {
                FileInputStream fiobj = new FileInputStream(fArr[i]);

                int data = 0;
                while((data = fiobj.read()) != -1)
                {
                    foobj.write(data);
                }
            }
        }

        System.out.println("Combined.bin created successfully");
    }
}
/////////////////////////////////////////////////////////////////////////
/*
Enter directory name : Dest
Combined.bin created successfully
*/