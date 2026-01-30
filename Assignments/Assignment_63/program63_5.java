import java.io.*;

public class program63_5
{
    public static void main(String[] args) throws Exception
    {
        FileInputStream fiobj = new FileInputStream("Combined.bin");
        FileOutputStream foobj = new FileOutputStream("First1KB.bin");

        byte buffer[] = new byte[1024];
        int bytesRead = fiobj.read(buffer);

        if(bytesRead > 0)
        {
            foobj.write(buffer, 0, bytesRead);
        }

        System.out.println("First 1 KB copied into first1Kb.bin");
    }
}
/////////////////////////////////////////////////////////////////////////
/// 
/// First 1 KB copied into first1Kb.bin
/// 
/////////////////////////////////////////////////////////////////////////