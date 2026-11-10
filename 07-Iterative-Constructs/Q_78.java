/*
 * ====================================================================
 *   Program  : Q_78
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Prime Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Prime number or not. A Prime number is a number that has exactly
 *   two factors, 1 and the number itself.
 *
 *   Example: 2, 3, 5, 7, 11, 13 are Prime numbers. (1 is not prime.)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_78
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        boolean isPrime = n > 1;

        for (long i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                isPrime = false;
                break;
            }
        }

        if (isPrime)
            System.out.println("Prime Number");
        else
            System.out.println("Not a Prime Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the number          |
 * | isPrime              | boolean   | to record whether n is prime |
 * | i                    | long      | to act as the trial divisor  |
 * +----------------------+-----------+------------------------------+
 */
