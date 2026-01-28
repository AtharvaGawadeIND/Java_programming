import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class program56_2
{

    public static Scanner openFile(String fileName)
    {
        try
        {
            File file = new File(fileName);
            return new Scanner(file);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found");
            return null;
        }
    }

    public static void readFile(Scanner fileName)
    {
        System.out.println("------ The file Contents are -----\n");
        while(fileName.hasNextLine())
        {
            String Line = fileName.nextLine();
            System.out.println(Line);
        }
    }

    // Main method (entry point)
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String fname = input.nextLine();

        Scanner fobj = openFile(fname);

        if (fobj != null)
        {
            System.out.println("File opened successfully");
            readFile(fobj);
            fobj.close();
        }

        input.close();
    }
}
