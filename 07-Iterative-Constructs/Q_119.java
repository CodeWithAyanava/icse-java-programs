/*
 * ====================================================================
 *   Program  : Q_119
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Series 1, 4, 9, 16, ... and 2, 5, 10, 17, 26, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and display the first n terms of
 *   each of the following series:
 *
 *       (a) 1, 4, 9, 16, 25, ...
 *       (b) 2, 5, 10, 17, 26, ...
 * ====================================================================
 */

import java.util.Scanner;

public class Q_119
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.print("(a) ");
        for (int i = 1; i <= n; i++)
            System.out.print((long) i * i + " ");
        System.out.println();

        System.out.print("(b) ");
        for (int i = 1; i <= n; i++)
            System.out.print(((long) i * i + 1) + " ");
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
 * | i                    | int       | to act as the loop counter   |
 * +----------------------+-----------+------------------------------+
 */
