package Assignment16;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : countDigits
//  Description     : It is used to count and print the number of digits in a given integer.
//  Input           : Integer (num)
//  Output          : void (prints the digit count to the console)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void countDigits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num = num / 10;
            count++;
        }
        System.out.println("Total digits: " + count);
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function 
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question5 {


    class Logic
{
    void countDigits(int num)
    {
        int count = 0;
        while(num != 0)
        {
            num = num/10;
            count++;
        }
        System.out.println("Total digits: " + count);
    }
}
    
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases for the intended function (assuming a main method calls obj.countDigits(12345))
//
//  Input   :   12345   Output  :   Total digits: 5
//  Input   :   500     Output  :   Total digits: 3
//  Input   :   7       Output  :   Total digits: 1
//
