import java.util.Scanner;
import java.io.*;

public class program60_2
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);
        String dirName = sobj.nextLine();

        File fobj = new File(dirName);
        File fArr[] = fobj.listFiles();

        long maxSize = 0;
        int maxIndex = -1;

        for(int i = 0; i < fArr.length; i++)
        {
            if(fArr[i].isFile())
            {
                if(fArr[i].length() > maxSize)
                {
                    maxSize = fArr[i].length();
                    maxIndex = i;
                }
            }
        }

        System.out.println("Largest file is : " + fArr[maxIndex].getName());
    }
}

///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input :
//   Demo
//
//  Output:
//  Largest file is : d.txt
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
