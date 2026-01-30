import java.util.Scanner;
import java.util.*;
import java.io.*;

public class program59_4
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

            System.out.println("The number of files and Directory present in the folder are :" + fArr.length);

            int dcount = 0 ;
            int fcount = 0;

            for(int i = 0 ; i<fArr.length; i++)
            {
                if(fArr[i].isDirectory() == true)
                {
                   dcount++;
                }

                else if(fArr[i].isFile() == true)
                {
                    fcount++;
                }

            }

            System.out.println("The total number of files present is :"+ fcount);
            System.out.println("The total number of folder present is :"+ dcount);
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
//  The number of files and Directory present in the folder are :5
//  The total number of files present is :4
//  The total number of folder present is :1
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
