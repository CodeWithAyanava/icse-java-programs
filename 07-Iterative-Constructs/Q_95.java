/*
 * ====================================================================
 *   Program  : Q_95
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Composite Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Composite number or not. A Composite number is a number greater
 *   than 1 that has more than two factors.
 *
 *   Example: 4, 6, 9, 15 are Composite numbers. (1 is neither prime
 *   nor composite.)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_95
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
                count++;
        }

        if (count > 2)
            System.out.println("Composite Number");
        else
            System.out.println("Not a Composite Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | n                    | int       | to store the number           |
 * | count                | int       | to count the factors          |
 * | i                    | int       | to act as the possible factor |
 * +----------------------+-----------+-------------------------------+
 */
