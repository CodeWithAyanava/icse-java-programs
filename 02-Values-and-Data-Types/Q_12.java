/*
 * ====================================================================
 *   Program  : Q_12
 *   Chapter  : 02 - Values and Data Types
 *   Title    : Next and Previous Character
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a character and display the character
 *   that comes just before it and just after it in the Unicode
 *   (ASCII) sequence.
 *
 *   Example: Input: M    Output: Previous: L   Next: N
 * ====================================================================
 */

import java.util.Scanner;

public class Q_12
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        char prev = (char) (ch - 1);
        char next = (char) (ch + 1);
        System.out.println("Previous: " + prev + "   Next: " + next);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | ch                   | char      | to store the entered character  |
 * | prev                 | char      | to store the previous character |
 * | next                 | char      | to store the next character     |
 * +----------------------+-----------+---------------------------------+
 */
