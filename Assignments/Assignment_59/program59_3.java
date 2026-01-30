import java.util.Scanner;
import java.util.*;
import java.io.*;

public class program59_3
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



            for(int i = 0 ; i<fArr.length; i++)
            {
                if(fArr[i].isDirectory() == true)
                {
                    System.out.println("The name of the Directory is  : "+fArr[i].getName());
                }
            }
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
//  Demo
//  Folder is present
//  The number of files and Directory present in the folder are :5
//  It is a regular file with name is : c.txt
//  It is a regular file with name is : a.txt
//  It is a regular file with name is : d.txt
//  It is a regular file with name is : b.txt
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
