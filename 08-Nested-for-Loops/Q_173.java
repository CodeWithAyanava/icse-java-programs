/*
 * ====================================================================
 *   Program  : Q_173
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Disarium Numbers between Two Limits
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two limits and display all the
 *   Disarium numbers between them. A Disarium number is equal to the
 *   sum of its digits raised to the power of their respective
 *   positions (e.g. 135 = 1^1 + 3^2 + 5^3).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_173
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the two limits: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        for (int n = Math.max(a, 1); n <= b; n++)
        {
            int pos = 0;
            for (int t = n; t > 0; t = t / 10)
                pos++;
            int sum = 0;
            for (int t = n; t > 0; t = t / 10)
            {
                sum = sum + (int) Math.pow(t % 10, pos);
                pos--;
            }
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
 * | pos                  | int       | to store the position of a digit |
 * | t                    | int       | to store a working copy of n     |
 * | sum                  | int       | to store the sum of powers       |
 * +----------------------+-----------+----------------------------------+
 */
