/*
 * ====================================================================
 *   Program  : Q_319
 *   Chapter  : 15 - String Handling
 *   Title    : Frequency of a Given Word in a Sentence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and a word, and count how
 *   many times the word occurs in the sentence as a complete word
 *   (ignoring case).
 *
 *   Example: Sentence: "the quick fox and THE lazy dog near the
 *   theatre", Word: the -> Frequency = 3 (theatre is not counted)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_319
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        System.out.print("Enter the word: ");
        String key = sc.next();
        String w = "";
        int freq = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else if (w.length() > 0)
            {
                if (w.equalsIgnoreCase(key))
                    freq++;
                w = "";
            }
        }
        System.out.println("Frequency = " + freq);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | s                    | String    | to store the sentence      |
 * | key                  | String    | to store the word to count |
 * | w                    | String    | to build each word         |
 * | freq                 | int       | to count the occurrences   |
 * | i                    | int       | to act as the index        |
 * | ch                   | char      | to store each character    |
 * +----------------------+-----------+----------------------------+
 */
