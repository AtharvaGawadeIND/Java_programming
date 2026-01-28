import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;

public class program58_5
{
    public static void writeFileXX(String dirPath)
    {
        File dobj = new File(dirPath);

        
        if (!dobj.exists())
        {
            System.out.println("Path does not exist");
            return;
        }

        // Check if it is a directory
        if (!dobj.isDirectory())
        {
            System.out.println("Given path is not a directory");
            return;
        }

        File files[] = dobj.listFiles();

        try
        {
            // Create new file Marvellous.txt
            FileWriter fw = new FileWriter("Marvellous.txt");

            for (int i = 0; i < files.length; i++)
            {
                if (files[i].isFile())
                {
                    // Write file name and size
                    fw.write("File Name : " + files[i].getName() + "\n");
                    fw.write("File Size : " + files[i].length() + " bytes\n");
                    fw.write("----------------------------------\n");

                    // Write file data
                    FileInputStream fin = new FileInputStream(files[i]);
                    int data;

                    while ((data = fin.read()) != -1)
                    {
                        fw.write(data);
                    }

                    fw.write("\n\n"); // space between files
                    fin.close();
                }
            }

            fw.close();
            System.out.println("File data written successfully into Marvellous.txt");
        }
        catch (IOException e)
        {
            System.out.println("Error while processing files");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = input.nextLine();

        writeFileXX(path);

        input.close();
    }
}
