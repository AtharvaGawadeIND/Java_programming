////////////////////////////////////////////////////////////////////////////////////////////////////
//  
//  Required Header files
//
///////////////////////////////////////////////////////////////////////////////////////////////////


import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Class Name      : Logic
//  Function Name   : openFile, readFile, appendFile
//  Description     : It is used to open a file, read its contents and append new data at the end.
//  Input           : String , String 
//  Output          : void (prints file contents)
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

    void appendFile(String fileName, String data)
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
public class program56_3
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
            System.out.println("File opened successfully\n");

            // Read file
            obj.readFile(fobj);
            fobj.close();

            System.out.print("Enter data to append at the end :\n");
            String data = input.nextLine();
            obj.appendFile(fname, data);

            System.out.println("Data appended successfully\n");
        }

        input.close();
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input :
//  Enter the filename : LB.txt
//File opened successfully
//
//------ The file Contents are -----

//  HI there I am Atharva Vinod Gawade
//  Enter data to append at the end :
//  Studying at Marvellous
//  Data appended successfully
//
//  ------ The file Contents are -----
//
//  HI there I am Atharva Vinod GawadeStudying at Marvellous
//  
////////////////////////////////////////////////////////////////////////////////////////////////////
