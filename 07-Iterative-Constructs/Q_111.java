/*
 * ====================================================================
 *   Program  : Q_111
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Largest and Smallest of n Numbers
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n numbers from the user and find the
 *   largest and the smallest of them. Display "Invalid input" if n
 *   is less than 1.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_111
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int n = sc.nextInt();

        if (n < 1)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.println("Enter " + n + " numbers:");
            double x = sc.nextDouble();
            double large = x, small = x;
            for (int i = 2; i <= n; i++)
            {
                x = sc.nextDouble();
                if (x > large)
                    large = x;
                if (x < small)
                    small = x;
            }
            System.out.println("Largest  = " + large);
            System.out.println("Smallest = " + small);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | int       | to store how many numbers    |
 * | x                    | double    | to store each number entered |
 * | large                | double    | to store the largest number  |
 * | small                | double    | to store the smallest number |
 * | i                    | int       | to act as the loop counter   |
 * +----------------------+-----------+------------------------------+
 */
