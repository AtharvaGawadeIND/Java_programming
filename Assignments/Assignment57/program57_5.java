import java.util.Scanner;
import java.io.File;

public class program57_5
{
    public static void DictDisplay(String dirPath)
    {
        File dobj = new File(dirPath);

        if (dobj.exists() == false)
        {
            System.out.println("Path does not exist");
            return;
        }

        if (!dobj.isDirectory())
        {
            System.out.println("Given path is not a directory");
            return;
        }

        File files[] = dobj.listFiles();

        System.out.println("\n--- Files and their Sizes ---");
        for (int i = 0; i < files.length; i++)
        {
            if (files[i].isFile())
            {
                System.out.println(files[i].getName() + "  :  " + files[i].length() + " bytes");
            }
        }
    }

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter directory path: ");
        String path = input.nextLine();

        DictDisplay(path);

        input.close();
    }
}
