////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_18;
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : sumEvenOddDigits
//  Description     : It is used to calculate the sum of even and odd digits from a given number
//  Input           : Integer
//  Output          : Void
//  Author          : Atharva Vinod Gawade
//  Date            : 01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void sumEvenOddDigits(int num)
    {
        int evenSum = 0, oddSum = 0;

        while(num != 0)
        {
            int digit = num % 10;

            if(digit % 2 == 0)
                evenSum = evenSum + digit;
            else
                oddSum = oddSum + digit;

            num = num / 10;
        }

        System.out.println("Sum of even digits = " + evenSum);
        System.out.println("Sum of odd digits = " + oddSum);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question4
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.sumEvenOddDigits(123456);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   123456      Output  :   Sum of even digits = 12     Sum of odd digits = 9
//  Input   :   987654321   Output  :   Sum of even digits = 20     Sum of odd digits = 25
//  Input   :   2468        Output  :   Sum of even digits = 20     Sum of odd digits = 0
//  Input   :   1357        Output  :   Sum of even digits = 0      Sum of odd digits = 16
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////
