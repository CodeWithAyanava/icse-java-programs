/*
 * ====================================================================
 *   Program  : Q_312
 *   Chapter  : 15 - String Handling
 *   Title    : Reverse Each Word of a Sentence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and reverse each word of
 *   it, keeping the words in their original order. Extra spaces in
 *   the input must be removed in the output.
 *
 *   Example: "Java  is fun" -> "avaJ si nuf"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_312
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().trim() + " ";
        String res = "", rev = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                rev = ch + rev;
            }
            else if (rev.length() > 0)
            {
                res = res + rev + " ";
                rev = "";
            }
        }
        System.out.println(res.trim());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | s                    | String    | to store the sentence       |
 * | res                  | String    | to store the result         |
 * | rev                  | String    | to build each reversed word |
 * | i                    | int       | to act as the index         |
 * | ch                   | char      | to store each character     |
 * +----------------------+-----------+-----------------------------+
 */
