/*
 * ====================================================================
 *   Program  : Q_349
 *   Chapter  : 15 - String Handling
 *   Title    : Run-Length Encoding
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Run-length encoding compresses a string by replacing
 *   each run of the same character with the character followed by
 *   the length of the run. Write a program to accept a word and
 *   display its run-length encoding and the compression (length of
 *   the encoded word compared with the original).
 *
 *   Example: aaabbcdddd -> a3b2c1d4
 * ====================================================================
 */

import java.util.Scanner;

public class Q_349
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String s = sc.next();
        String res = "";
        int i = 0;

        while (i < s.length())
        {
            char ch = s.charAt(i);
            int run = 1;
            while (i + run < s.length() && s.charAt(i + run) == ch)
                run++;
            res = res + ch + run;
            i = i + run;
        }
        System.out.println("Encoded: " + res);
        System.out.println("Original length " + s.length() + ", encoded length " + res.length());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | s                    | String    | to store the word                 |
 * | res                  | String    | to store the encoded word         |
 * | i                    | int       | to store the start of a run       |
 * | ch                   | char      | to store the character of the run |
 * | run                  | int       | to store the length of the run    |
 * +----------------------+-----------+-----------------------------------+
 */
