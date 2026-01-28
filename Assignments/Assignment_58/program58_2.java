import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class program58_2
{
    public static void dictOperation(String dirPath)
    {
        File dobj = new File(dirPath);

        // Check if path exists
        if (!dobj.exists())
        {
            System.out.println("Path does not exist");
            return;
        }

        // Check if it is a directory
        if (dobj.isDirectory()== false)
        {
            System.out.println("Given path is not a directory");
            return;
        }

        File files[] = dobj.listFiles();

        try
        {
            // Create new file Marvellous.txt
            FileWriter fw = new FileWriter("Marvellous.txt");

            System.out.println("\n--- Regular Files in Directory ---");

            for (int i = 0; i < files.length; i++)
            {
                // PART-1: Display only regular files
                if (files[i].isFile())
                {
                    System.out.println(files[i].getName());
                }

               
                fw.write(files[i].getName() + "\n");
            }

            fw.close();
            System.out.println("\nFile names written successfully into Marvellous.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error while writing to file");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = input.nextLine();

        dictOperation(path);

        input.close();
    }
}
