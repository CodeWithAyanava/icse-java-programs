/*
 * ====================================================================
 *   Program  : Q_336
 *   Chapter  : 15 - String Handling
 *   Title    : Characters at Alternate Positions
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a word and form two new words: one
 *   from the characters at odd positions (1st, 3rd, 5th, ...) and
 *   another from the characters at even positions (2nd, 4th, ...).
 *
 *   Example: COMPUTER -> odd positions: CMUE, even positions: OPTR
 * ====================================================================
 */

import java.util.Scanner;

public class Q_336
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        String odd = "", even = "";

        for (int i = 0; i < w.length(); i++)
        {
            if (i % 2 == 0)
                odd = odd + w.charAt(i);
            else
                even = even + w.charAt(i);
        }
        System.out.println("Odd positions : " + odd);
        System.out.println("Even positions: " + even);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | w                    | String    | to store the word                     |
 * | odd                  | String    | to store characters at odd positions  |
 * | even                 | String    | to store characters at even positions |
 * | i                    | int       | to act as the index                   |
 * +----------------------+-----------+---------------------------------------+
 */
