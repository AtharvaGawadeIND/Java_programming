////////////////////////////////////////////////////////////////////////////////////////////////////
//  
//  Required Header files
//
//////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Logic
//  Function Name   : openFile
//  Description     : It is used to open a file whose name is provided by the user.
//  Input           : String (fileName)
//  Output          : Scanner object (if file exists)
//  Author          : Atharva Vinod Gawade
//  Date            : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    Scanner openFile(String fileName)
    {
        try
        {
            File fobj = new File(fileName);
            return new Scanner(fobj);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error : File not found");
            return null;
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class program56_1
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Logic obj = new Logic();

        System.out.print("Enter the filename : ");
        String name = input.nextLine();

        Scanner fobj = obj.openFile(name);

        if (fobj != null)
        {
            System.out.println("File opened successfully");
            fobj.close();
        }

        input.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   : Enter the filename : Demo.txt
//  Output  : Error : File not found
//
//  Input   : Enter the filename : Logic.class
//  Output  : File opened successfully
//
////////////////////////////////////////////////////////////////////////////////////////////////////
