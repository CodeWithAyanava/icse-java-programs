/*
 * ====================================================================
 *   Program  : Q_110
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Prime Factors of a Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number greater than 1 and display
 *   its prime factorisation.
 *
 *   Example: 360 = 2 x 2 x 2 x 3 x 3 x 5
 * ====================================================================
 */

import java.util.Scanner;

public class Q_110
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        if (n <= 1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.print(n + " = ");
            long f = 2;
            boolean first = true;
            while (n > 1)
            {
                if (f * f > n)
                    f = n;
                if (n % f == 0)
                {
                    if (!first)
                        System.out.print(" x ");
                    System.out.print(f);
                    first = false;
                    n = n / f;
                }
                else
                {
                    f++;
                }
            }
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | n                    | long      | to store the number                |
 * | f                    | long      | to act as the trial factor         |
 * | first                | boolean   | to check if it is the first factor |
 * +----------------------+-----------+------------------------------------+
 */
