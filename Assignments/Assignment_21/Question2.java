////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment21;
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : countEvenOddRange
//  Description     : It is used to count how many even and odd numbers are present between 1 and N
//  Input           : Integer
//  Output          : Integer array
//  Author          : Atharva Vinod Gawade
//  Date            : 01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    int[] countEvenOddRange(int n)
    {
        int even = 0, odd = 0;
        for(int i = 1; i <= n; i++)
        {
            if(i % 2 == 0)
                even++;
            else
                odd++;
        }
        return new int[]{even, odd};
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question2
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int n = 50;
        int result[] = obj.countEvenOddRange(n);
        System.out.println("Even numbers: " + result[0]);
        System.out.println("Odd numbers: " + result[1]);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   10      Output  :   Even numbers: 5     Odd numbers: 5
//  Input   :   7       Output  :   Even numbers: 3     Odd numbers: 4
//  Input   :   1       Output  :   Even numbers: 0     Odd numbers: 1
//  Input   :   50      Output  :   Even numbers: 25    Odd numbers: 25
//
////////////////////////////////////////////////////////////////////////////////////////////////////
