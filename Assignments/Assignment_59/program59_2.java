import java.util.Scanner;
import java.util.*;
import java.io.*;

public class program59_2
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
                if(fArr[i].isFile() == true)
                {
                    System.out.println("The name of file Present is : "+fArr[i].getName());
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
//  Output :
//      Folder is present
/* 
        The number of files and Directory present in the folder are :5
        The name of file Present is : c.txt
        The name of file Present is : a.txt
        The name of file Present is : d.txt
        The name of file Present is : b.txt

*/
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
