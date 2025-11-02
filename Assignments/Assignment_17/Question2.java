package Assignment17;

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Function Name   : checkPalindrome
//  Description     : It is used to check if a number is a Palindrome (reads the same forwards and backwards).
//  Input           : Integer (num)
//  Output          : Boolean (true if Palindrome, false otherwise)
//  Author          : Atharva Vinod Gawade
//  Date            : 29/10/2025
//
////////////////////////////////////////////////////////////////////////////////////////////////////
class Logic
{
    boolean checkPalindrome(int num)
    {
        int original = num;
        int rev = 0;

        while(num != 0)
        {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }

        boolean flag = false;
        if(original == rev)
            flag = true;

        return flag;
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Entry point function for the application
//
////////////////////////////////////////////////////////////////////////////////////////////////////
public class Question2 {

    public static void main(String args[])
    {
        Logic obj = new Logic();
        int number = 121;

        boolean flag = obj.checkPalindrome(number);

        if(flag == true)
            System.out.println(number + " is a Palindrome number");
        else
            System.out.println(number + " is not a Palindrome number");
    }
    
}
////////////////////////////////////////////////////////////////////////////////////////////////////
//
//  Testcases handled successfully by the application
//
//  Input   :   121     Output  :   121 is a Palindrome number
//  Input   :   1234    Output  :   1234 is not a Palindrome number
//  Input   :   4554    Output  :   4554 is a Palindrome number
//
///////////////////////////////////////////////////////////////////////////////////////////////////