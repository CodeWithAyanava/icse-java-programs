/*
 * ====================================================================
 *   Program  : Q_101
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Fibonacci Series
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to display the first n terms of the Fibonacci
 *   series, where each term is the sum of the previous two terms:
 *
 *       0, 1, 1, 2, 3, 5, 8, 13, 21, ...
 *
 *   Use long so that the terms do not overflow for n up to 92.
 *   Display "Invalid input" if n is less than 1 or more than 92.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_101
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        if (n < 1 || n > 92)
        {
            System.out.println("Invalid input");
        }
        else
        {
            long a = 0, b = 1;
            for (int i = 1; i <= n; i++)
            {
                System.out.print(a + " ");
                long c = a + b;
                a = b;
                b = c;
            }
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | int       | to store the number of terms |
 * | a                    | long      | to store the current term    |
 * | b                    | long      | to store the next term       |
 * | c                    | long      | to store the sum of a and b  |
 * | i                    | int       | to act as the loop counter   |
 * +----------------------+-----------+------------------------------+
 */
