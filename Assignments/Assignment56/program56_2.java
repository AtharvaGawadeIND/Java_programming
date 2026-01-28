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
//  Function Name   : openFile, readFile
//  Description     : It is used to open a file and display its contents on the screen.
//  Input           : String 
//  Output          : void 
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
            File file = new File(fileName);
            return new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error : File not found");
            return null;
        }
    }

    void readFile(Scanner fileScanner)
    {
        System.out.println("------ The file Contents are -----\n");
        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class program56_2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Logic obj = new Logic();

        System.out.print("Enter the filename : ");
        String fname = input.nextLine();

        Scanner fobj = obj.openFile(fname);

        if (fobj != null)
        {
            System.out.println("File opened successfully");
            obj.readFile(fobj);
            fobj.close();
        }

        input.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input:
//  Enter the filename : LB.txt
//  Output:
//  File opened successfully
// ------ The file Contents are -----
//
//  HI there I am Atharva Vinod Gawade
//
////////////////////////////////////////////////////////////////////////////////////////////////////
