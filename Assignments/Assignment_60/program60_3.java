import java.util.*;
import java.io.*;

public class program60_3
{
    
    public static void main(String[] args) throws Exception

    {
        Scanner sobj = new Scanner(System.in);
        String FolderName = sobj.nextLine();

        File fobj = new File(FolderName);

        if(fobj.exists()  && fobj.isDirectory())
        {
            System.out.println("Folder is present\n");

            File fArr[] = fobj.listFiles();

            System.out.println("The number of files present in the folder are :" + fArr.length);

           // long TotalSize = 0;
            long minSize = 0;
            int minIndex = -1;

            minSize = fArr[0].length();

            for(int i = 0 ; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    long FileSize = fArr[i].length();

                    if(FileSize<minSize)
                    {
                        minSize = FileSize;
                        minIndex = i;
                    }
                }
            }

        System.out.println("Smallest file is "+fArr[minIndex].getName());
        }

        else
        {
            System.out.println("Folder is not present\n");
        }


    }
    
}
///////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input :
//   Demo
//
//  Output:
//  The number of files present in the folder are :5
//  Smallest file is a.txt


//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
