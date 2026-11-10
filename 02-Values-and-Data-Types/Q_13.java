/*
 * ====================================================================
 *   Program  : Q_13
 *   Chapter  : 02 - Values and Data Types
 *   Title    : Uppercase to Lowercase using ASCII Arithmetic
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a character. If it is an uppercase
 *   letter, convert it to lowercase by adding 32 to its ASCII code
 *   (without using any library method) and display it. Otherwise
 *   display "Not an uppercase letter".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_13
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        if (ch >= 'A' && ch <= 'Z')
        {
            char lower = (char) (ch + 32);
            System.out.println("Lowercase: " + lower);
        }
        else
        {
            System.out.println("Not an uppercase letter");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | ch                   | char      | to store the entered character |
 * | lower                | char      | to store the lowercase letter  |
 * +----------------------+-----------+--------------------------------+
 */
