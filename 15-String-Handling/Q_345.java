/*
 * ====================================================================
 *   Program  : Q_345
 *   Chapter  : 15 - String Handling
 *   Title    : Words that Come First and Last Alphabetically
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and find the word that
 *   comes first and the word that comes last in alphabetical
 *   (dictionary) order, using compareToIgnoreCase().
 *
 *   Example: "India is my country" -> First: country, Last: my
 * ====================================================================
 */

import java.util.Scanner;

public class Q_345
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        String w = "", first = "", last = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else if (w.length() > 0)
            {
                if (first.length() == 0 || w.compareToIgnoreCase(first) < 0)
                    first = w;
                if (last.length() == 0 || w.compareToIgnoreCase(last) > 0)
                    last = w;
                w = "";
            }
        }
        if (first.length() == 0)
        {
            System.out.println("No words entered");
        }
        else
        {
            System.out.println("First alphabetically: " + first);
            System.out.println("Last alphabetically : " + last);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                  |
 * +----------------------+-----------+----------------------------------------+
 * | s                    | String    | to store the sentence                  |
 * | w                    | String    | to build each word                     |
 * | first                | String    | to store the first word alphabetically |
 * | last                 | String    | to store the last word alphabetically  |
 * | i                    | int       | to act as the index                    |
 * | ch                   | char      | to store each character                |
 * +----------------------+-----------+----------------------------------------+
 */
