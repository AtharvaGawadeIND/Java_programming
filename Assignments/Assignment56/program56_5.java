import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class program56_5
{
    public static void DictDisplay(String dirPath)
    {
        
            File dobj = new File(dirPath);
            

            //fitler :

            if(dobj.exists()== false)
            {
                System.out.println("Path does not exists");
                return;
            }


            if(dobj.isDirectory()== false)
            {
                System.out.println("Given path is not a directory ");
                return;
            }
        }
        
            
 
    
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the directorypath: ");
        String path = input.nextLine();

        DictDisplay(path);

        input.close();
    }
}
