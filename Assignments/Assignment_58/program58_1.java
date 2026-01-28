import java.util.Scanner;
import java.io.File;

public class program58_1
{
    public static void RegularFile(String dirPath)
    {
        File dobj = new File(dirPath);

        //filter
        if (!dobj.exists())
        {
            System.out.println("Path does not exist\n");
            return;
        }

        
        if (dobj.isDirectory()== false)
        {
            System.out.println("Given path is not a directory\n");
            return;
        }

        File files[] = dobj.listFiles();

        System.out.println("\n--- Regular Files in Directory ---");
            for(int i = 0; i < files.length; i++)
        {
            // PART 1: Regular file check
            if (files[i].isFile())
            {
                System.out.println( files[i].getName() + "  :  " + files[i].length() + " bytes"
                );
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = input.nextLine();

        RegularFile(path);

        input.close();
    }
}
