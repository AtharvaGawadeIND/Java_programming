import java.util.Scanner;
import java.util.*;
import java.io.*;

public class program59_5
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
                System.out.println("Filename is :" + fArr[i].getName() + 
                "|| Absolute path of the file present is : " + 
                fArr[i].getAbsolutePath() + "\n");
            }

           // System.out.println("The total number of files present is :"+ fcount);
            //System.out.println("The total number of folder present is :"+ dcount);
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
/*Folder is present

The number of files and Directory present in the folder are :5
Filename is :c.txt|| Absolute path of the file present is : /home/atharva-gawade/Desktop/LB_self/GitHub_Uploading /Assignment_59/Demo/c.txt

Filename is :a.txt|| Absolute path of the file present is : /home/atharva-gawade/Desktop/LB_self/GitHub_Uploading /Assignment_59/Demo/a.txt

Filename is :Marvellous|| Absolute path of the file present is : /home/atharva-gawade/Desktop/LB_self/GitHub_Uploading /Assignment_59/Demo/Marvellous

Filename is :d.txt|| Absolute path of the file present is : /home/atharva-gawade/Desktop/LB_self/GitHub_Uploading /Assignment_59/Demo/d.txt

Filename is :b.txt|| Absolute path of the file present is : /home/atharva-gawade/Desktop/LB_self/GitHub_Uploading /Assignment_59/Demo/b.txt

The total number of files present is :0
The total number of folder present is :0
*/
//
//////////////////////////////////////////////////////////////////////////////////////////////////////////
