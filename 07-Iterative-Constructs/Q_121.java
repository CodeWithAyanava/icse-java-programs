/*
 * ====================================================================
 *   Program  : Q_121
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Series 1, 11, 111, 1111, ... and its Sum
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and display the first n terms of the
 *   series 1, 11, 111, 1111, ... and their sum. Use long, and accept
 *   n only from 1 to 18 (otherwise display "Invalid input").
 * ====================================================================
 */

import java.util.Scanner;

public class Q_121
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n < 1 || n > 18)
        {
            System.out.println("Invalid input");
        }
        else
        {
            long term = 0, sum = 0;
            for (int i = 1; i <= n; i++)
            {
                term = term * 10 + 1;
                sum = sum + term;
                System.out.print(term + " ");
            }
            System.out.println();
            System.out.println("Sum = " + sum);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | n                    | int       | to store the number of terms  |
 * | term                 | long      | to store the current term     |
 * | sum                  | long      | to store the sum of the terms |
 * | i                    | int       | to act as the loop counter    |
 * +----------------------+-----------+-------------------------------+
 */
