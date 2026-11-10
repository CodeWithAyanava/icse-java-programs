/*
 * ====================================================================
 *   Program  : Q_311
 *   Chapter  : 15 - String Handling
 *   Title    : Longest Word in a Sentence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display the longest
 *   word in it along with its length. If two or more words have the
 *   same greatest length, display the first one. Extra spaces must
 *   be handled correctly.
 *
 *   Example: "Tata Steel is in Jamshedpur" -> Longest word:
 *   Jamshedpur (10 letters)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_311
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        String w = "", longest = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else
            {
                if (w.length() > longest.length())
                    longest = w;
                w = "";
            }
        }
        if (longest.length() == 0)
            System.out.println("No words entered");
        else
            System.out.println("Longest word: " + longest + " (" + longest.length() + " letters)");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | s                    | String    | to store the sentence     |
 * | w                    | String    | to build each word        |
 * | longest              | String    | to store the longest word |
 * | i                    | int       | to act as the index       |
 * | ch                   | char      | to store each character   |
 * +----------------------+-----------+---------------------------+
 */
