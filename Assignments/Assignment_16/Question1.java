package Assignment_16;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : calculateSum
//  Description     : It is used to calculate the sum of all integers from 0 up to n (inclusive).
//  Input           : Integer (n)
//  Output          : void (prints the result to the console)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{

    void calculateSum(int n )

    {

        int isum = 0 ;

        for(int i = 0 ; i<=n ; i++)
        {
            isum = isum + i ;
        }

        // Print the result after the loop completes
        System.out.println("The sum of numbers up to " + n + " is " + isum);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Question1 
{

    public static void main(String args[])
    {

        Logic obj = new Logic();
        obj.calculateSum(10);

    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   10      Output  :   The sum of numbers up to 10 is 55 (0+1+..+10 = 55)
//  Input   :   5       Output  :   The sum of numbers up to 5 is 15
//  Input   :   0       Output  :   The sum of numbers up to 0 is 0
//
