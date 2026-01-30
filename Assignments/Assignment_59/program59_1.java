import java.util.Scanner;
import java.util.*;
import java.io.*;

public class program59_1
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

            for(int i = 0 ; i<fArr.length; i++)
            {
                System.out.println("File name is : "+fArr[i].getName());
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
//  Folder is present
//
//  The number of files present in the folder are :4
//    File name is : c.txt
//    File name is : a.txt
//    File name is : d.txt
//    File name is : b.txt
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
