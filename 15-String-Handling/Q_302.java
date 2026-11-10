/*
 * ====================================================================
 *   Program  : Q_302
 *   Chapter  : 15 - String Handling
 *   Title    : Palindrome Word
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a word and check whether it is a
 *   Palindrome word or not, ignoring the case of the letters. A
 *   Palindrome word reads the same from left to right and from right
 *   to left.
 *
 *   Example: MADAM, Level, NOON are Palindrome words.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_302
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        String rev = "";

        for (int i = w.length() - 1; i >= 0; i--)
            rev = rev + w.charAt(i);

        if (rev.equalsIgnoreCase(w))
            System.out.println("Palindrome Word");
        else
            System.out.println("Not a Palindrome Word");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | w                    | String    | to store the word          |
 * | rev                  | String    | to store the reversed word |
 * | i                    | int       | to act as the index        |
 * +----------------------+-----------+----------------------------+
 */
