/*
 * ====================================================================
 *   Program  : Q_120
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Series 0, 7, 26, 63, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and display the first n terms of the
 *   series:
 *
 *       0, 7, 26, 63, 124, ...
 *
 *   (Hint: each term is one less than the cube of its position.)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_120
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (long i = 1; i <= n; i++)
            System.out.print((i * i * i - 1) + " ");
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | int       | to store the number of terms |
 * | i                    | long      | to act as the loop counter   |
 * +----------------------+-----------+------------------------------+
 */
