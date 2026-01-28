import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class program56_1
{

    public static Scanner openFile(String fileName)
    {
        try
        {
            File fobj = new File(fileName);
            return new Scanner(fobj);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error: File not found");
            return null;
        }
    }

    // Main method (entry point)
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the filename: ");
        String name = input.nextLine();

        Scanner fobj = openFile(name);

        if (fobj != null)
        {
            System.out.println("File opened successfully");
            fobj.close();
        }

        input.close();
    }
}
