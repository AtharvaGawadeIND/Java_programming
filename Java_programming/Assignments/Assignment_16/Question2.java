package Assignment_16;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : checkEvenodd
//  Description     : It is used to check if a number is even or odd and print the result.
//  Input           : Integer (inum)
//  Output          : void (prints the result to the console)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic 
{
    void checkEvenodd(int inum)
    {
        if (inum % 2 == 0)
        {
            System.out.println(inum + " is even");
        }
        else 
        {
            System.out.println(inum + " is odd");
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question2 {

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkEvenodd(7);
        // Additional test case
        // obj.checkEvenodd(10);
    }
    
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   7       Output  :   7 is odd
//  Input   :   10      Output  :   10 is even
//
///////////////////////////////////////////////////////////////////////////////////////////////////