/*
 * ====================================================================
 *   Program  : Q_335
 *   Chapter  : 15 - String Handling
 *   Title    : Number in Words, Digit by Digit
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a non-negative integer, convert it
 *   into a String using String.valueOf(), and display each digit in
 *   words using a switch statement.
 *
 *   Example: 4052 -> FOUR ZERO FIVE TWO
 * ====================================================================
 */

import java.util.Scanner;

public class Q_335
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        if (n < 0)
        {
            System.out.println("Invalid input");
            return;
        }
        String s = String.valueOf(n);
        String res = "";

        for (int i = 0; i < s.length(); i++)
        {
            switch (s.charAt(i))
            {
                case '0': res = res + "ZERO "; break;
                case '1': res = res + "ONE "; break;
                case '2': res = res + "TWO "; break;
                case '3': res = res + "THREE "; break;
                case '4': res = res + "FOUR "; break;
                case '5': res = res + "FIVE "; break;
                case '6': res = res + "SIX "; break;
                case '7': res = res + "SEVEN "; break;
                case '8': res = res + "EIGHT "; break;
                default:  res = res + "NINE ";
            }
        }
        System.out.println(res.trim());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | n                    | long      | to store the number             |
 * | s                    | String    | to store the number as a string |
 * | res                  | String    | to store the words              |
 * | i                    | int       | to act as the index             |
 * +----------------------+-----------+---------------------------------+
 */
