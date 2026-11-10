/*
 * ====================================================================
 *   Program  : Q_303
 *   Chapter  : 15 - String Handling
 *   Title    : Pig Latin
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a word and convert it into Pig Latin.
 *   To translate a word into Pig Latin, convert it to uppercase,
 *   move all the letters before the first vowel to the end of the
 *   word, and add "AY" at the end. If the word has no vowel, simply
 *   add "AY".
 *
 *   Example: TROUBLE -> OUBLETRAY, KING -> INGKAY, apple -> APPLEAY,
 *   RHYTHM -> RHYTHMAY
 * ====================================================================
 */

import java.util.Scanner;

public class Q_303
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next().toUpperCase();
        int pos = -1;

        for (int i = 0; i < w.length(); i++)
        {
            char ch = w.charAt(i);
            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
            {
                pos = i;
                break;
            }
        }

        String pig;
        if (pos == -1)
            pig = w + "AY";
        else
            pig = w.substring(pos) + w.substring(0, pos) + "AY";
        System.out.println("Pig Latin: " + pig);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | w                    | String    | to store the word in uppercase        |
 * | pos                  | int       | to store the index of the first vowel |
 * | i                    | int       | to act as the index                   |
 * | ch                   | char      | to store each character               |
 * | pig                  | String    | to store the pig latin word           |
 * +----------------------+-----------+---------------------------------------+
 */
