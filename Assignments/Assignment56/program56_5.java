////////////////////////////////////////////////////////////////////////////////////////////////////
//  
//  Required Header files
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Logic
//  Function Name   : DictDisplay
//  Description     : It is used to check whether the given path exists and whether it is a directory.
//  Input           : String (dirPath)
//  Output          : void 
//  Author          : Atharva Vinod Gawade
//  Date            : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void DictDisplay(String dirPath)
    {
        File dobj = new File(dirPath);

        if (dobj.exists() == false)
        {
            System.out.println("Path does not exists");
            return;
        }
     
        if (dobj.isDirectory() == false)
        {
            System.out.println("Given path is not a directory");
            return;
        }

            System.out.println("Path is a valid Directory");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class program56_5
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Logic obj = new Logic();

        System.out.print("Enter the directory path : ");
        String path = input.nextLine();

        obj.DictDisplay(path);

        input.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input :
//  Enter the directory path : C:\Users\gawad\OneDrive\Desktop\LB\Assignment57
//  Output :
//  Path is a valid Directory
//
////////////////////////////////////////////////////////////////////////////////////////////////////
