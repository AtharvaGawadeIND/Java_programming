import java.util.Scanner;
import java.io.File;

public class program60_5
{
    public static void main(String[] args)
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("directory path : ");
        String path = sobj.nextLine();

        File fobj = new File(path);

        if(fobj.exists())
        {
            System.out.println("Path exists");

            if(fobj.isFile())
            {
                System.out.println("It is a regular file");
            }
            else if(fobj.isDirectory())
            {
                System.out.println("It is a directory");
            }
        }
        else
        {
            System.out.println("Path does not exist");
        }
    }
}

//////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Input :
//   Demo
//  .txt
//
//  Output:
//  c.txt
//  a.txt
//  d.txt
//  b.txtes present in the folder are :5
//  Total file size present in the Directory is :103

//
//////////////////////////////////////////////////////////////////////////////////////////////////////////

