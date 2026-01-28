import java.util.Scanner;
import java.io.File;

public class program57_2
{
    public static void checkRegularFile(String fileName)
    {
        File fobj = new File(fileName);

        // Check if path exists
        if (fobj.exists() == false)
        {
            System.out.println("File does not exist");
            return;
        }

        if (fobj.isFile())
        {
            System.out.println("It is a regular file");
        }
        else
        {
            System.out.println("It is not a regular file");
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter file name: ");
        String fname = input.nextLine();

        checkRegularFile(fname);

        input.close();
    }
}
