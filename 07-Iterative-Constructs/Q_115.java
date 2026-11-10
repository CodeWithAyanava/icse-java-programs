/*
 * ====================================================================
 *   Program  : Q_115
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sum of the Series 1 + 1/2 + 1/3 + ... + 1/n
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and find the sum of the series:
 *
 *       S = 1 + 1/2 + 1/3 + 1/4 + ... + 1/n
 * ====================================================================
 */

import java.util.Scanner;

public class Q_115
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        double s = 0;

        for (int i = 1; i <= n; i++)
            s = s + 1.0 / i;

        System.out.println("Sum = " + s);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | int       | to store the number of terms |
 * | s                    | double    | to store the sum             |
 * | i                    | int       | to act as the loop counter   |
 * +----------------------+-----------+------------------------------+
 */
