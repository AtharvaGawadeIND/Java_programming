import java.util.Scanner;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class program57_4
{
    
    public static long Checksum(String fileName)
    {
        long checksum = 0;

        try
        {
            FileInputStream fobj= new FileInputStream(fileName);
            int data;

            while ((data = fobj.read()) != -1)
            {
                checksum = checksum + data;
            }

            fobj.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File not found");
            return -1;
        }
        catch (IOException e)
        {
            System.out.println("Error while reading file");
            return -1;
        }

        return checksum;
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fname = input.nextLine();

        long result = Checksum(fname);

        if (result != -1)
        {
            System.out.println("Checksum of file is: " + result);
        }

        input.close();
    }
}
