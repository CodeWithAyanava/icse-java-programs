/*
 * ====================================================================
 *   Program  : Q_249
 *   Chapter  : 12 - Library Classes
 *   Title    : Password Strength Checker
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a password and check its
 *   strength using the methods of the Character class. Award one
 *   point each for: length of at least 8, at least one uppercase
 *   letter, at least one lowercase letter, at least one digit, and
 *   at least one special character (not a letter, digit or space).
 *   Display "Strong" for 5 points, "Medium" for 3 or 4 points and
 *   "Weak" otherwise, along with suggestions for every missing
 *   condition. A password containing a space is "Invalid".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_249
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String p = sc.nextLine();
        boolean up = false, low = false, dig = false, spl = false, space = false;

        for (int i = 0; i < p.length(); i++)
        {
            char ch = p.charAt(i);
            if (Character.isUpperCase(ch))
                up = true;
            else if (Character.isLowerCase(ch))
                low = true;
            else if (Character.isDigit(ch))
                dig = true;
            else if (Character.isWhitespace(ch))
                space = true;
            else
                spl = true;
        }

        if (space || p.length() == 0)
        {
            System.out.println("Invalid");
        }
        else
        {
            int points = 0;
            if (p.length() >= 8) points++; else System.out.println("- use at least 8 characters");
            if (up) points++; else System.out.println("- add an uppercase letter");
            if (low) points++; else System.out.println("- add a lowercase letter");
            if (dig) points++; else System.out.println("- add a digit");
            if (spl) points++; else System.out.println("- add a special character");

            if (points == 5)
                System.out.println("Strong");
            else if (points >= 3)
                System.out.println("Medium");
            else
                System.out.println("Weak");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | p                    | String    | to store the password         |
 * | up                   | boolean   | to record an uppercase letter |
 * | low                  | boolean   | to record a lowercase letter  |
 * | dig                  | boolean   | to record a digit             |
 * | spl                  | boolean   | to record a special character |
 * | space                | boolean   | to record a space             |
 * | i                    | int       | to act as the index           |
 * | ch                   | char      | to store each character       |
 * | points               | int       | to store the strength points  |
 * +----------------------+-----------+-------------------------------+
 */
