/*
 * ====================================================================
 *   Program  : Q_128
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Collatz (Hailstone) Sequence
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] The Collatz sequence of a positive number n is formed as
 *   follows: if n is even, the next term is n / 2; if n is odd, the
 *   next term is 3n + 1. The sequence stops when it reaches 1. Write
 *   a program to accept a positive number, display its Collatz
 *   sequence and the number of steps taken to reach 1.
 *
 *   Example: 6 -> 6 3 10 5 16 8 4 2 1 (8 steps)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_128
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long n = sc.nextLong();

        if (n <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int steps = 0;
            System.out.print(n + " ");
            while (n != 1)
            {
                if (n % 2 == 0)
                    n = n / 2;
                else
                    n = 3 * n + 1;
                System.out.print(n + " ");
                steps++;
            }
            System.out.println();
            System.out.println("Steps = " + steps);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | n                    | long      | to store the current term |
 * | steps                | int       | to count the steps        |
 * +----------------------+-----------+---------------------------+
 */
