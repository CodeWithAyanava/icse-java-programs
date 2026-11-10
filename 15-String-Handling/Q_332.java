/*
 * ====================================================================
 *   Program  : Q_332
 *   Chapter  : 15 - String Handling
 *   Title    : Swap the First and Last Letters of Each Word
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and interchange the first
 *   and the last letters of each word (single-letter words remain
 *   unchanged). Display the new sentence with single spaces between
 *   words.
 *
 *   Example: "Mumbai is a great city" -> "iumbaM si a treag yitc"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_332
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        String res = "", w = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = w + ch;
            }
            else if (w.length() > 0)
            {
                int n = w.length();
                if (n > 1)
                    w = w.charAt(n - 1) + w.substring(1, n - 1) + w.charAt(0);
                res = res + w + " ";
                w = "";
            }
        }
        System.out.println(res.trim());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | s                    | String    | to store the sentence         |
 * | res                  | String    | to store the new sentence     |
 * | w                    | String    | to build each word            |
 * | i                    | int       | to act as the index           |
 * | ch                   | char      | to store each character       |
 * | n                    | int       | to store the length of a word |
 * +----------------------+-----------+-------------------------------+
 */
