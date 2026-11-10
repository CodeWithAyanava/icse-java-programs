/*
 * ====================================================================
 *   Program  : Q_330
 *   Chapter  : 15 - String Handling
 *   Title    : Count Pairs of Consecutive Letters
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a sentence, convert it to uppercase
 *   and count the number of pairs of consecutive letters of the
 *   alphabet appearing together in it (such as AB, ST, OP, HI).
 *   Display each pair found and the count.
 *
 *   Example: "IT WAS NOT TOUGH FOR HIM TO RESIDE ABOVE THE HILL" ->
 *   pairs: NO, GH, HI, DE, AB, HI -> count = 6
 * ====================================================================
 */

import java.util.Scanner;

public class Q_330
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine().toUpperCase();
        int count = 0;

        for (int i = 0; i < s.length() - 1; i++)
        {
            char a = s.charAt(i);
            char b = s.charAt(i + 1);
            if (Character.isLetter(a) && Character.isLetter(b) && b == a + 1)
            {
                System.out.print("" + a + b + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Number of consecutive pairs = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | s                    | String    | to store the sentence in uppercase |
 * | count                | int       | to count the pairs                 |
 * | i                    | int       | to act as the index                |
 * | a                    | char      | to store the current character     |
 * | b                    | char      | to store the next character        |
 * +----------------------+-----------+------------------------------------+
 */
