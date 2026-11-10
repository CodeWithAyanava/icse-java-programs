/*
 * ====================================================================
 *   Program  : Q_167
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Palindrome Numbers in a Range
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two limits and display all the
 *   palindrome numbers between them and their count. A palindrome
 *   number reads the same when reversed (e.g. 121, 1331).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_167
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two limits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int count = 0;

        for (int n = Math.max(a, 0); n <= b; n++)
        {
            int rev = 0;
            for (int t = n; t > 0; t = t / 10)
                rev = rev * 10 + t % 10;
            if (rev == n)
            {
                System.out.print(n + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | a                    | int       | to store the lower limit         |
 * | b                    | int       | to store the upper limit         |
 * | count                | int       | to count the palindromes         |
 * | n                    | int       | to store the number being tested |
 * | rev                  | int       | to store the reverse of n        |
 * | t                    | int       | to store a working copy of n     |
 * +----------------------+-----------+----------------------------------+
 */
