import java.util.Scanner;
import java.io.File;

public class program57_3
{
    
    public static void createDirectory(String dirName)
    {
        File dobj = new File(dirName);

        
        if (dobj.exists())
        {
            System.out.println("Directory already exists");
            return;
        }

        
        if (dobj.mkdir())
        {
            System.out.println("Directory created successfully\n");
        }
        else
        {
            System.out.println("Unable to create directory");
        }
    }

    // Main method
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory name: ");
        String dirName = input.nextLine();

        createDirectory(dirName);

        input.close();
    }
}
