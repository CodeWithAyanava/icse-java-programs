/*
 * ====================================================================
 *   Program  : Q_305
 *   Chapter  : 15 - String Handling
 *   Title    : Capitalise the First Letter of Each Word
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and convert the first
 *   letter of each word into uppercase, leaving the other letters
 *   unchanged. The sentence may contain extra spaces; the output
 *   must have exactly one space between words and no spaces at the
 *   ends.
 *
 *   Example: "  we   are in   cyber world " -> "We Are In Cyber
 *   World"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_305
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
                w = Character.toUpperCase(w.charAt(0)) + w.substring(1);
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
 * +----------------------+-----------+-------------------------+
 * | Name of the Variable | Data Type | Purpose / Description   |
 * +----------------------+-----------+-------------------------+
 * | s                    | String    | to store the sentence   |
 * | res                  | String    | to store the result     |
 * | w                    | String    | to build each word      |
 * | i                    | int       | to act as the index     |
 * | ch                   | char      | to store each character |
 * +----------------------+-----------+-------------------------+
 */
