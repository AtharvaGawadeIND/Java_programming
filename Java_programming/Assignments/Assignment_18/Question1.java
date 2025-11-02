////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Required Packages
//
////////////////////////////////////////////////////////////////////////////////////////////////////
package Assignment_18;
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : checkPrime
//  Description     : It is used to check whether a given number is prime or not
//  Input           : Integer
//  Output          : Void
//  Author          : Atharva Vinod Gawade
//  Date            : 01/11/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////

class Logic
{
    void checkPrime(int num)
    {
        if(num <= 1)
        {
            System.out.println(num + " is not a prime number");
            return;
        }

        boolean isPrime = true;

        for(int i = 2; i <= num / 2; i++)
        {
            if(num % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if(isPrime)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question1
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.checkPrime(11);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   11      Output  :   11 is a prime number
//  Input   :   12      Output  :   12 is not a prime number
//  Input   :   1       Output  :   1 is not a prime number
//  Input   :   17      Output  :   17 is a prime number
//  Input   :   25      Output  :   25 is not a prime number
//
//
////////////////////////////////////////////////////////////////////////////////////////////////////
