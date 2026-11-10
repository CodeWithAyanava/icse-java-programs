/*
 * ====================================================================
 *   Program  : Q_245
 *   Chapter  : 12 - Library Classes
 *   Title    : Build a Number from the Digits in a String
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a string such as "Price: Rs 4,550
 *   only" and form a number from all the digits in it, in the order
 *   in which they appear (here 4550), using Character.isDigit().
 *   Display the number and the number increased by 10% to show that
 *   it is a real number and not a string. Display "No digits found"
 *   if there are none, and "Number too large" if there are more than
 *   18 digits.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_245
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        long num = 0;
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
            {
                num = num * 10 + (ch - '0');
                count++;
                if (count > 18)
                    break;
            }
        }

        if (count == 0)
            System.out.println("No digits found");
        else if (count > 18)
            System.out.println("Number too large");
        else
        {
            System.out.println("Number formed = " + num);
            System.out.println("After 10% increase = " + (num * 1.1));
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | s                    | String    | to store the string        |
 * | num                  | long      | to store the number formed |
 * | count                | int       | to count the digits        |
 * | i                    | int       | to act as the index        |
 * | ch                   | char      | to store each character    |
 * +----------------------+-----------+----------------------------+
 */
