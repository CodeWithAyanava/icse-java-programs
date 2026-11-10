/*
 * ====================================================================
 *   Program  : Q_244
 *   Chapter  : 12 - Library Classes
 *   Title    : Sum of the Digits Present in an Alphanumeric String
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an alphanumeric string and find the
 *   sum of all the digits present in it, using Character.isDigit().
 *   Also display the count of digits.
 *
 *   Example: "Room 4B, Floor 12" -> digits 4, 1, 2 -> Sum = 7
 * ====================================================================
 */

import java.util.Scanner;

public class Q_244
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();
        int sum = 0, count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isDigit(ch))
            {
                sum = sum + (ch - '0');
                count++;
            }
        }
        System.out.println("Number of digits = " + count);
        System.out.println("Sum of digits    = " + sum);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | s                    | String    | to store the string        |
 * | sum                  | int       | to store the sum of digits |
 * | count                | int       | to count the digits        |
 * | i                    | int       | to act as the index        |
 * | ch                   | char      | to store each character    |
 * +----------------------+-----------+----------------------------+
 */
