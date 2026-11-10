/*
 * ====================================================================
 *   Program  : Q_175
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pythagorean Triplets up to n
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] A Pythagorean triplet is a set of three positive
 *   integers a < b < c such that a^2 + b^2 = c^2, e.g. (3, 4, 5).
 *   Write a program to accept n and display all the Pythagorean
 *   triplets with c not greater than n.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_175
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int count = 0;

        for (int a = 1; a <= n; a++)
        {
            for (int b = a + 1; b <= n; b++)
            {
                int csq = a * a + b * b;
                int c = (int) Math.round(Math.sqrt(csq));
                if (c <= n && c * c == csq)
                {
                    System.out.println("(" + a + ", " + b + ", " + c + ")");
                    count++;
                }
            }
        }
        System.out.println("Number of triplets = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | n                    | int       | to store the upper limit for c     |
 * | count                | int       | to count the triplets              |
 * | a                    | int       | to store the first number          |
 * | b                    | int       | to store the second number         |
 * | csq                  | int       | to store a squared plus b squared  |
 * | c                    | int       | to store the possible third number |
 * +----------------------+-----------+------------------------------------+
 */
