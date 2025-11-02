package Assignment17;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : printTable
//  Description     : It is used to print the multiplication table for the given number from 1 to 10.
//  Input           : Integer (num)
//  Output          : void (prints the table to the console)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void printTable(int num)
    {
        for(int i = 1; i <= 10; i++)
        {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Question5
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.printTable(5);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   5
//  Output  :   5 x 1 = 5
//              5 x 2 = 10
//              5 x 3 = 15
//              5 x 4 = 20
//              5 x 5 = 25
//              5 x 6 = 30
//              5 x 7 = 35
//              5 x 8 = 40
//              5 x 9 = 45
//              5 x 10 = 50
//
///////////////////////////////////////////////////////////////////////////////////////////////////