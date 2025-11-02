package Assignment16;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : findFactorial
//  Description     : It is used to calculate the factorial of a given non-negative integer.
//  Input           : Integer (num)
//  Output          : void (prints the result to the console)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void findFactorial(int num)
    {
        int fact = 1;
        for(int i = 1; i <= num; i++)
        {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num + " is " + fact);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question3 {
    
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findFactorial(5);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   5       Output  :   Factorial of 5 is 120 (5 * 4 * 3 * 2 * 1 = 120)
//  Input   :   0       Output  :   Factorial of 0 is 1
//  Input   :   4       Output  :   Factorial of 4 is 24
//
