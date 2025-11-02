////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_20;
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : checkPerfect
//  Description     : It is used to check if a given number is a Perfect Number (sum of its proper positive divisors equals the number itself).
//  Input           : Integer (num)
//  Output          : Boolean (true if perfect, false otherwise)
//  Author          : Atharva Vinod Gawade
//  Date            : 30/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    boolean checkPerfect(int num)
    {
        int sum = 0;
        for(int i = 1; i <= num / 2; i++)
        {
            if(num % i == 0)
                sum += i;
        }
        return sum == num;
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        int num = 6;
        boolean ans = obj.checkPerfect(num);

        if(ans)
            System.out.println(num + " is a Perfect number");
        else
            System.out.println(num + " is not a Perfect number");
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   6       Output  :   6 is a Perfect number
//  Input   :   28      Output  :   28 is a Perfect number
//  Input   :   10      Output  :   10 is not a Perfect number
//  Input   :   1       Output  :   1 is not a Perfect number
//
////////////////////////////////////////////////////////////////////////////////////////////////////