////////////////////////////////////////////////////////////////////////////////////////////////////
//  
//  Required Header files
//
///////////////////////////////////////////////////////////////////////////////////////////////////

import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Logic
//  Function Name   : createFile
//  Description     : It is used to create a new file if it does not already exist.
//  Input           : String 
//  Output          : boolean (true if file created, false if already exists)
//  Author          : Atharva Vinod Gawade
//  Date            : 28/01/2026
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    boolean createFile(String fileName)
    {
        try
        {
            File fobj = new File(fileName);

            if (fobj.exists())
            {
                return false;
            }
            else
            {
                fobj.createNewFile();
                return true;
            }
        }
        catch (IOException e)
        {
            System.out.println("Error while creating file");
            return false;
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

    void createFile(String fileName, String data)
    {
        try
        {
            FileWriter fw = new FileWriter(fileName, true); // append mode
            fw.write(data + "\n");
            fw.close();
        }
        catch (IOException e)
        {
            System.out.println("Error while writing to file");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class program56_4
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Logic obj = new Logic();

        System.out.print("Enter the filename : ");
        String name = input.nextLine();

        boolean fRet = obj.createFile(name);

        if (fRet != false)
        {
            System.out.println("File created successfully");
        }
        else
        {
            System.out.println("File already exists");
        }

        input.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  INPUT : Enter the filename : LB.txt
//  Ouptupt :
//  File already exists
//
////////////////////////////////////////////////////////////////////////////////////////////////////
