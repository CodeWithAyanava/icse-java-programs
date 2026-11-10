/*
 * ====================================================================
 *   Program  : Q_117
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sum of the Series 1 - 2 + 3 - 4 + ... n
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and find the sum of the series:
 *
 *       S = 1 - 2 + 3 - 4 + 5 - 6 + ... up to n terms
 * ====================================================================
 */

import java.util.Scanner;

public class Q_117
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        long n = sc.nextLong();
        long s = 0;

        for (long i = 1; i <= n; i++)
        {
            if (i % 2 == 1)
                s = s + i;
            else
                s = s - i;
        }
        System.out.println("Sum = " + s);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the number of terms |
 * | s                    | long      | to store the sum             |
 * | i                    | long      | to act as the loop counter   |
 * +----------------------+-----------+------------------------------+
 */
