

import java.util.Scanner;
import java.io.*;

public class program60_4
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String dirName = sobj.nextLine();


        String extension = sobj.nextLine();

        File fobj = new File(dirName);
        File fArr[] = fobj.listFiles();

        for(int i = 0; i < fArr.length; i++)
        {
            if(fArr[i].isFile())

            {
                if(fArr[i].getName().endsWith(extension))
                {


                    System.out.println(fArr[i].getName());
                }
            }
   
   
        }
    }
}
