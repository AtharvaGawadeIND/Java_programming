import java.util.Scanner;
import java.io.*;

public class program63_3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter source directory : ");
        String srcDir = sobj.nextLine();

        System.out.print("Enter destination directory : ");
        String destDir = sobj.nextLine();

        File srcObj = new File(srcDir);
        File destObj = new File(destDir);

        if(destObj.exists())
        {
            destObj.mkdir();
        }

        File fArr[] = srcObj.listFiles();

        for(int i = 0; i < fArr.length; i++)
        {
            if(fArr[i].isFile())
            {
                FileInputStream fiobj = new FileInputStream(fArr[i]);
                FileOutputStream foobj = new FileOutputStream(destDir + "/" + fArr[i].getName());

                int data = 0;
                while((data = fiobj.read()) != -1)
                {
                    foobj.write(data);
                }
            }
        }

        System.out.println("All files copied successfully");
    }
}

///////////////////////////////////////////////////////////////////////////
/*
Enter source directory : src
Enter destination directory : Dest

All files copied successfully

*/