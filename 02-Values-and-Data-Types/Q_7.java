/*
 * ====================================================================
 *   Program  : Q_7
 *   Chapter  : 02 - Values and Data Types
 *   Title    : Character for an Entered ASCII Code
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept an ASCII code (0 to 127) and display
 *   the character it represents. If the code is outside this range,
 *   display "Invalid ASCII code".
 *
 *   Example: Input: 97    Output: Character = a
 * ====================================================================
 */

import java.util.Scanner;

public class Q_7
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an ASCII code (0-127): ");
        int code = sc.nextInt();
        if (code >= 0 && code <= 127)
        {
            char ch = (char) code;
            System.out.println("Character = " + ch);
        }
        else
        {
            System.out.println("Invalid ASCII code");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | code                 | int       | to store the entered ascii code      |
 * | ch                   | char      | to store the corresponding character |
 * +----------------------+-----------+--------------------------------------+
 */
