/*
 * ====================================================================
 *   Program  : Q_315
 *   Chapter  : 15 - String Handling
 *   Title    : Frequency of Each Letter
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display the frequency
 *   of each letter of the alphabet present in it, ignoring case
 *   (letters that do not occur are not displayed).
 *
 *   Example: "Hello" -> E 1, H 1, L 2, O 1
 * ====================================================================
 */

import java.util.Scanner;

public class Q_315
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().toUpperCase();

        System.out.println("Letter\tFrequency");
        for (char ch = 'A'; ch <= 'Z'; ch++)
        {
            int f = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == ch)
                    f++;
            }
            if (f > 0)
                System.out.println(ch + "\t" + f);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | s                    | String    | to store the sentence in uppercase |
 * | ch                   | char      | to act as the letter being counted |
 * | f                    | int       | to store the frequency             |
 * | i                    | int       | to act as the index                |
 * +----------------------+-----------+------------------------------------+
 */
