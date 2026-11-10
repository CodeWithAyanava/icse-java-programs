/*
 * ====================================================================
 *   Program  : Q_343
 *   Chapter  : 15 - String Handling
 *   Title    : Pangram Check
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] A Pangram is a sentence that contains every letter of
 *   the English alphabet at least once, e.g. "The quick brown fox
 *   jumps over the lazy dog". Write a program to accept a sentence
 *   and check whether it is a pangram. If it is not, display the
 *   missing letters.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_343
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().toUpperCase();
        String missing = "";

        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            if (s.indexOf(ch) == -1)
                missing = missing + ch + " ";
        }
        if (missing.length() == 0)
            System.out.println("Pangram");
        else
            System.out.println("Not a Pangram. Missing letters: " + missing.trim());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | s                    | String    | to store the sentence in uppercase |
 * | missing              | String    | to store the missing letters       |
 * | ch                   | char      | to act as the letter being checked |
 * +----------------------+-----------+------------------------------------+
 */
