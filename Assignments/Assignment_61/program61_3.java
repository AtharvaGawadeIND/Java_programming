import java.util.Scanner;
import java.io.*;

public class program61_3
{
    public static void main(String[] args) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.print("Enter file name : ");
        String fileName = sobj.nextLine();

        System.out.print("Enter string to append : ");
        String str = sobj.nextLine();

        // true → append mode
        FileOutputStream fout = new FileOutputStream(fileName, true);

        byte bArr[] = str.getBytes();   // convert string to bytes

        fout.write(bArr);

        fout.close();

        System.out.println("String appended successfully");
    }
}

/////////////////////////////////////////////////////////////////////////
/*
    Enter file name : Marvellous
    Enter string to append : currently solving java
    String appended successfully
 */