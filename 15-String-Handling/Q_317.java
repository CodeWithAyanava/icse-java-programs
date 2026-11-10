/*
 * ====================================================================
 *   Program  : Q_317
 *   Chapter  : 15 - String Handling
 *   Title    : Special Word or Palindrome Word
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A Special word is a word that begins and ends with the same
 *   letter. A Palindrome word reads the same backwards (every
 *   palindrome is also special). Write a program to accept a word
 *   and display "Palindrome Word" if it is a palindrome, "Special
 *   Word" if it is special but not a palindrome, and "Neither
 *   special nor palindrome" otherwise. Ignore the case of letters.
 *
 *   Example: EXISTENCE -> Special Word, COMIC -> Special Word,
 *   MALAYALAM -> Palindrome Word
 * ====================================================================
 */

import java.util.Scanner;

public class Q_317
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next().toUpperCase();
        String rev = "";
        for (int i = w.length() - 1; i >= 0; i--)
            rev = rev + w.charAt(i);

        if (rev.equals(w))
            System.out.println("Palindrome Word");
        else if (w.charAt(0) == w.charAt(w.length() - 1))
            System.out.println("Special Word");
        else
            System.out.println("Neither special nor palindrome");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | w                    | String    | to store the word in uppercase |
 * | rev                  | String    | to store the reversed word     |
 * | i                    | int       | to act as the index            |
 * +----------------------+-----------+--------------------------------+
 */
