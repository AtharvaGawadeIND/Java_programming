import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class program56_3
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

    public static void readFile(Scanner fileScanner)
    {
        System.out.println("------ The file Contents are -----\n");
        while (fileScanner.hasNextLine())
        {
            String line = fileScanner.nextLine();
            System.out.println(line);
        }
    }

    public static void appendFile(String fileName, String data)
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
        String fname = input.nextLine();

        Scanner fobj = openFile(fname);

        if (fobj != null)
        {
            System.out.println("File opened successfully\n");

            // READ FILE
            readFile(fobj);
            fobj.close();

            // APPEND DATA
            System.out.print("Enter data to append at the end:\n ");
            String data = input.nextLine();
            appendFile(fname, data);

            System.out.println("Data appended successfully\n");
        }

        input.close();
    }
}
