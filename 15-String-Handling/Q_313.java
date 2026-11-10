/*
 * ====================================================================
 *   Program  : Q_313
 *   Chapter  : 15 - String Handling
 *   Title    : Reverse the Order of Words
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and display the words in
 *   reverse order. Extra spaces in the input must be removed in the
 *   output.
 *
 *   Example: "  I love   Java programming " -> "programming Java
 *   love I"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_313
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = " " + sc.nextLine().trim();
        String res = "", w = "";

        for (int i = s.length() - 1; i >= 0; i--)
        {
            char ch = s.charAt(i);
            if (ch != ' ')
            {
                w = ch + w;
            }
            else if (w.length() > 0)
            {
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
