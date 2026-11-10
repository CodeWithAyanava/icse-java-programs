/*
 * ====================================================================
 *   Program  : Q_166
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Armstrong Numbers in a Range
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two limits and display all the
 *   Armstrong numbers between them. An Armstrong number is equal to
 *   the sum of its digits each raised to the power of the number of
 *   digits (e.g. 153, 370, 371, 407, 1634).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_166
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two limits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int n = Math.max(a, 1); n <= b; n++)
        {
            int count = 0;
            for (int t = n; t > 0; t = t / 10)
                count++;
            int sum = 0;
            for (int t = n; t > 0; t = t / 10)
                sum = sum + (int) Math.pow(t % 10, count);
            if (sum == n)
                System.out.print(n + " ");
        }
        System.out.println();
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
 * | n                    | int       | to store the number being tested |
 * | count                | int       | to count the digits              |
 * | t                    | int       | to store a working copy of n     |
 * | sum                  | int       | to store the sum of powers       |
 * +----------------------+-----------+----------------------------------+
 */
