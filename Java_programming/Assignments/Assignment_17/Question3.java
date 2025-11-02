package Assignment_17;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : findMax
//  Description     : It is used to compare two numbers and print the greater one or if they are equal.
//  Input           : Integer (a), Integer (b)
//  Output          : void (prints the comparison result)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    void findMax(int a, int b)
    {
        if(a > b)
            System.out.println(a + " is greater than " + b);
        else if(b > a)
            System.out.println(b + " is greater than " + a);
        else
            System.out.println("Both numbers are equal");
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Question3
{
    public static void main(String args[])
    {
        Logic obj = new Logic();
        obj.findMax(20, 15);
    }
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   20, 15  Output  :   20 is greater than 15
//  Input   :   15, 20  Output  :   20 is greater than 15
//  Input   :   10, 10  Output  :   Both numbers are equal
//
///////////////////////////////////////////////////////////////////////////////////////////////////