/*
 * ====================================================================
 *   Program  : Q_6
 *   Chapter  : 02 - Values and Data Types
 *   Title    : ASCII Code of an Entered Character
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a character from the user and display
 *   its ASCII (Unicode) code.
 *
 *   Example: Input: A    Output: ASCII code of A = 65
 * ====================================================================
 */

import java.util.Scanner;

public class Q_6
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        int code = (int) ch;
        System.out.println("ASCII code of " + ch + " = " + code);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | ch                   | char      | to store the entered character |
 * | code                 | int       | to store the ascii code        |
 * +----------------------+-----------+--------------------------------+
 */
