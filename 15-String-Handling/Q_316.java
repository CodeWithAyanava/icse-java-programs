/*
 * ====================================================================
 *   Program  : Q_316
 *   Chapter  : 15 - String Handling
 *   Title    : Letters of a Word in Alphabetical Order
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a word and arrange its letters in
 *   alphabetical order (ignoring case while comparing). Store the
 *   letters in a character array and use bubble sort.
 *
 *   Example: COMPUTER -> CEMOPRTU
 * ====================================================================
 */

import java.util.Scanner;

public class Q_316
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String w = sc.next();
        int n = w.length();
        char a[] = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = w.charAt(i);

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (Character.toLowerCase(a[j]) > Character.toLowerCase(a[j + 1]))
                {
                    char t = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = t;
                }
            }
        }

        String res = "";
        for (int i = 0; i < n; i++)
            res = res + a[i];
        System.out.println("Sorted: " + res);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | w                    | String    | to store the word                  |
 * | n                    | int       | to store the length of the word    |
 * | a                    | char[]    | to store the letters               |
 * | i                    | int       | to count the passes / act as index |
 * | j                    | int       | to act as the comparison index     |
 * | t                    | char      | to hold a letter while swapping    |
 * | res                  | String    | to store the sorted word           |
 * +----------------------+-----------+------------------------------------+
 */
