import java.util.Scanner;
import java.io.*;

public class program62_4
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = sobj.nextLine();

        File fobj = new File(fileName);

        String backupName = fobj.getName().replace(".", "_backup.");

        FileInputStream fiobj = new FileInputStream(fileName);
        FileOutputStream foobj1 = new FileOutputStream(backupName);

        int data = 0;
        while((data = fiobj.read()) != -1)
        {
            foobj1.write(data);
        }

        System.out.println("Backup created : " + backupName);
    }


}


/*
Enter file name : program62_1.java
Backup created : program62_1_backup.java
*/
