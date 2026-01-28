import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class program57_1
{

    public static void copyFile(String sourceFile, String destFile)
    {
        try
        {
            File src = new File(sourceFile);
            Scanner reader = new Scanner(src);

            FileWriter writer = new FileWriter(destFile);

            while (reader.hasNextLine())
            {
                String line = reader.nextLine();
                writer.write(line + "\n");
            }

            reader.close();
            writer.close();

            System.out.println("Data copied successfully");
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Source file not found");
        }
        catch (IOException e)
        {
            System.out.println("Error while writing to file");
        }
    }

    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String file1 = input.nextLine();

        System.out.print("Enter destination file name: ");
        String file2 = input.nextLine();

        copyFile(file1, file2);

        input.close();
    }
}
