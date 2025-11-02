package Assignment_16;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : reverseNumber
//  Description     : It is used to calculate and print the reverse of a given integer.
//  Input           : Integer (num)
//  Output          : void (prints the reversed number to the console)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void reverseNumber(int num)
    {
        int rev = 0;
        int original = num; // Storing original for documentation purposes

        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reversed number is: " + rev);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question4 {

    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.reverseNumber(12345);
    }
    
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   12345   Output  :   Reversed number is: 54321
//  Input   :   900     Output  :   Reversed number is: 9
//  Input   :   7       Output  :   Reversed number is: 7
//
///////////////////////////////////////////////////////////////////////////////////////////////////