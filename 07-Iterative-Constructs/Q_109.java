/*
 * ====================================================================
 *   Program  : Q_109
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Factors of a Number and their Count
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a positive number and display all its
 *   factors and the number of factors.
 *
 *   Example: 12 -> Factors: 1 2 3 4 6 12, Number of factors = 6
 * ====================================================================
 */

import java.util.Scanner;

public class Q_109
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int count = 0;
            System.out.print("Factors: ");
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                {
                    System.out.print(i + " ");
                    count++;
                }
            }
            System.out.println();
            System.out.println("Number of factors = " + count);
        }
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
