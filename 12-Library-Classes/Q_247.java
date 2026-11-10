/*
 * ====================================================================
 *   Program  : Q_247
 *   Chapter  : 12 - Library Classes
 *   Title    : Validate a 10-Digit Mobile Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a mobile number as a string and check
 *   whether it is a valid Indian mobile number: it must have exactly
 *   10 characters, all of them digits, and must begin with 6, 7, 8
 *   or 9. If valid, convert it to a long using Long.parseLong() and
 *   display "Valid mobile number" and the number; otherwise display
 *   "Invalid mobile number". Leading and trailing spaces must be
 *   ignored.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_247
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a mobile number: ");
        String s = sc.nextLine().trim();
        boolean valid = s.length() == 10;

        for (int i = 0; i < s.length() && valid; i++)
        {
            if (!Character.isDigit(s.charAt(i)))
                valid = false;
        }
        if (valid)
        {
            char first = s.charAt(0);
            if (first < '6')
                valid = false;
        }

        if (valid)
        {
            long num = Long.parseLong(s);
            System.out.println("Valid mobile number");
            System.out.println("As a long: " + num);
        }
        else
        {
            System.out.println("Invalid mobile number");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | s                    | String    | to store the number entered   |
 * | valid                | boolean   | to record whether it is valid |
 * | i                    | int       | to act as the index           |
 * | first                | char      | to store the first digit      |
 * | num                  | long      | to store the number as a long |
 * +----------------------+-----------+-------------------------------+
 */
