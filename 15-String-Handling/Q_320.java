/*
 * ====================================================================
 *   Program  : Q_320
 *   Chapter  : 15 - String Handling
 *   Title    : Replace a Word with Another Word
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence, a word to be replaced and
 *   a new word. Replace every occurrence of the word (as a complete
 *   word, ignoring case) with the new word and display the new
 *   sentence with single spaces between words.
 *
 *   Example: "I like tea and Tea likes me", tea -> coffee "I like
 *   coffee and coffee likes me"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_320
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        System.out.print("Enter the word to replace: ");
        String old = sc.next();
        System.out.print("Enter the new word: ");
        String nw = sc.next();
        String res = "", w = "";
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
                if (w.equalsIgnoreCase(old))
                {
                    res = res + nw + " ";
                    count++;
                }
                else
                {
                    res = res + w + " ";
                }
                w = "";
            }
        }
        System.out.println(res.trim());
        System.out.println("Words replaced: " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | s                    | String    | to store the sentence        |
 * | old                  | String    | to store the word to replace |
 * | nw                   | String    | to store the new word        |
 * | res                  | String    | to store the new sentence    |
 * | w                    | String    | to build each word           |
 * | count                | int       | to count the replacements    |
 * | i                    | int       | to act as the index          |
 * | ch                   | char      | to store each character      |
 * +----------------------+-----------+------------------------------+
 */
