/*
 * ====================================================================
 *   Program  : Q_304
 *   Chapter  : 15 - String Handling
 *   Title    : Uppercase Conversion and Double-Letter Sequences
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence, convert it into uppercase
 *   and count the number of double-letter sequences in it, i.e. the
 *   number of times the same letter appears twice in succession.
 *
 *   Example: "She was feeding the little rabbit with an apple"
 *   Uppercase: SHE WAS FEEDING THE LITTLE RABBIT WITH AN APPLE
 *   Double-letter sequences: 4 (EE, TT, BB, PP)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_304
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().toUpperCase();
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++)
        {
            char ch = s.charAt(i);
            if (Character.isLetter(ch) && ch == s.charAt(i + 1))
                count++;
        }
        System.out.println(s);
        System.out.println("Double-letter sequences = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | s                    | String    | to store the sentence in uppercase |
 * | count                | int       | to count the double letters        |
 * | i                    | int       | to act as the index                |
 * | ch                   | char      | to store each character            |
 * +----------------------+-----------+------------------------------------+
 */
