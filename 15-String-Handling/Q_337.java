/*
 * ====================================================================
 *   Program  : Q_337
 *   Chapter  : 15 - String Handling
 *   Title    : Encode a Sentence by Shifting Letters by 2
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence and encode it by replacing
 *   each letter with the letter two places after it in the alphabet,
 *   wrapping around at the end (Y becomes A, Z becomes B, y becomes
 *   a, z becomes b). The case of the letters is kept, and other
 *   characters remain unchanged.
 *
 *   Example: "Zebra crossing at 5 pm!" -> "Bgdtc etquukpi cv 5 ro!"
 * ====================================================================
 */

import java.util.Scanner;

public class Q_337
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();
        String res = "";

        for (int i = 0; i < s.length(); i++)
        {
            char ch = s.charAt(i);
            if (Character.isUpperCase(ch))
                ch = (char) ('A' + (ch - 'A' + 2) % 26);
            else if (Character.isLowerCase(ch))
                ch = (char) ('a' + (ch - 'a' + 2) % 26);
            res = res + ch;
        }
        System.out.println(res);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | s                    | String    | to store the sentence         |
 * | res                  | String    | to store the encoded sentence |
 * | i                    | int       | to act as the index           |
 * | ch                   | char      | to store each character       |
 * +----------------------+-----------+-------------------------------+
 */
