/*
 * ====================================================================
 *   Program  : Q_116
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sum of the Series x/1 + x^2/2 + x^3/3 + ... + x^n/n
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept x and n, and find the sum of the
 *   series:
 *
 *       S = x/1 + x^2/2 + x^3/3 + ... + x^n/n
 * ====================================================================
 */

import java.util.Scanner;

public class Q_116
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter x and n: ");
        double x = sc.nextDouble();
        int n = sc.nextInt();
        double s = 0;

        for (int i = 1; i <= n; i++)
            s = s + Math.pow(x, i) / i;

        System.out.println("Sum = " + s);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | x                    | double    | to store the value of x      |
 * | n                    | int       | to store the number of terms |
 * | s                    | double    | to store the sum             |
 * | i                    | int       | to act as the loop counter   |
 * +----------------------+-----------+------------------------------+
 */
