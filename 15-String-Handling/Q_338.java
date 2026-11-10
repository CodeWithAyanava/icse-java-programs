/*
 * ====================================================================
 *   Program  : Q_338
 *   Chapter  : 15 - String Handling
 *   Title    : Remove Extra Spaces from a Sentence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and remove all extra spaces
 *   from it, so that there is no space at the beginning or the end
 *   and exactly one space between words. Display the sentence before
 *   and after (within square brackets) and the number of spaces
 *   removed.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_338
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String t = s.trim();
        String res = "";

        for (int i = 0; i < t.length(); i++)
        {
            char ch = t.charAt(i);
            if (ch != ' ' || t.charAt(i - 1) != ' ')
                res = res + ch;
        }
        System.out.println("Before: [" + s + "]");
        System.out.println("After : [" + res + "]");
        System.out.println("Spaces removed: " + (s.length() - res.length()));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | s                    | String    | to store the sentence         |
 * | t                    | String    | to store the trimmed sentence |
 * | res                  | String    | to store the cleaned sentence |
 * | i                    | int       | to act as the index           |
 * | ch                   | char      | to store each character       |
 * +----------------------+-----------+-------------------------------+
 */
