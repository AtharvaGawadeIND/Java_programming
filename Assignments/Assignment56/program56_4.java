import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class program56_4
{
    public static boolean createFile(String fileName)
    {
        try
        {
            File fobj = new File(fileName);
            

            if(fobj.exists())
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
            System.out.println("Error: File not found");
            return false;
        }
    }

    public static void readFile(Scanner fileScanner)
    {
        System.out.println("------ The file Contents are -----\n");
        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
    }

    public static void createFile(String fileName, String data)
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

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String name = input.nextLine();

        boolean fRet = false;

        fRet = createFile(name);

        if (fRet != false)
        {
            System.out.println("file created Sucessfully");

        }

        else
            {   
                System.out.println("file already exists");

            }
        input.close();
    }
}
