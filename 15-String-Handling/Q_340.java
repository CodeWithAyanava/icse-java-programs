/*
 * ====================================================================
 *   Program  : Q_340
 *   Chapter  : 15 - String Handling
 *   Title    : Words of a Sentence in Alphabetical Order
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence, store its words in a
 *   String array (first count the words, then extract them), arrange
 *   the words in alphabetical order (ignoring case) using bubble
 *   sort, and display them as a sentence.
 *
 *   Example: "the quick brown fox" -> "brown fox quick the"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_340
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";

        int n = 0;
        for (int i = 0; i < s.length() - 1; i++)
        {
            if (s.charAt(i) != ' ' && s.charAt(i + 1) == ' ')
                n++;
        }

        String words[] = new String[n];
        String w = "";
        int k = 0;
        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else if (w.length() > 0)
            {
                words[k++] = w;
                w = "";
            }
        }

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (words[j].compareToIgnoreCase(words[j + 1]) > 0)
                {
                    String t = words[j];
                    words[j] = words[j + 1];
                    words[j + 1] = t;
                }
            }
        }

        String res = "";
        for (int i = 0; i < n; i++)
            res = res + words[i] + " ";
        System.out.println(res.trim());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | s                    | String    | to store the sentence          |
 * | n                    | int       | to store the number of words   |
 * | i                    | int       | to act as the index            |
 * | words                | String[]  | to store the words             |
 * | w                    | String    | to build each word             |
 * | k                    | int       | to count the words stored      |
 * | ch                   | char      | to store each character        |
 * | j                    | int       | to act as the comparison index |
 * | t                    | String    | to hold a word while swapping  |
 * | res                  | String    | to store the sorted sentence   |
 * +----------------------+-----------+--------------------------------+
 */
