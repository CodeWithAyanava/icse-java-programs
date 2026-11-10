/*
 * ====================================================================
 *   Program  : Q_326
 *   Chapter  : 15 - String Handling
 *   Title    : Count the Words Beginning with a Vowel
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display the words that
 *   begin with a vowel and their count (ignoring case).
 *
 *   Example: "An apple a day keeps illness away" -> An apple a
 *   illness away, count = 5
 * ====================================================================
 */

import java.util.Scanner;

public class Q_326
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        String w = "";
        int count = 0;

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else if (w.length() > 0)
            {
                char f = Character.toUpperCase(w.charAt(0));
                if (f == 'A' || f == 'E' || f == 'I' || f == 'O' || f == 'U')
                {
                    System.out.print(w + " ");
                    count++;
                }
                w = "";
            }
        }
        System.out.println();
        System.out.println("Count = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | s                    | String    | to store the sentence               |
 * | w                    | String    | to build each word                  |
 * | count                | int       | to count the words                  |
 * | i                    | int       | to act as the index                 |
 * | ch                   | char      | to store each character             |
 * | f                    | char      | to store the first letter of a word |
 * +----------------------+-----------+-------------------------------------+
 */
