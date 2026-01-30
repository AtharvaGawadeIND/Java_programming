import java.util.Scanner;
import java.util.*;
import java.io.*;

public class program60_1
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

            int TotalSize = 0;

            for(int i = 0 ; i<fArr.length; i++)
            {
                if(fArr[i].isFile())
                {
                    TotalSize +=  fArr[i].length();
                }
            }

        System.out.println("Total file size present in the Directory is :"+ TotalSize);
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
//  Folder is present
//
//  The number of files present in the folder are :5
//  Total file size present in the Directory is :103

//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
