/*
 * ====================================================================
 *   Program  : Q_165
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Perfect Numbers from 1 to n
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n and display all the Perfect numbers
 *   from 1 to n. A Perfect number is equal to the sum of its factors
 *   excluding itself (e.g. 6 = 1 + 2 + 3).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_165
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int num = 2; num <= n; num++)
        {
            int sum = 0;
            for (int i = 1; i <= num / 2; i++)
            {
                if (num % i == 0)
                    sum = sum + i;
            }
            if (sum == num)
                System.out.print(num + " ");
        }
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | n                    | int       | to store the upper limit         |
 * | num                  | int       | to store the number being tested |
 * | sum                  | int       | to store the sum of factors      |
 * | i                    | int       | to act as the possible factor    |
 * +----------------------+-----------+----------------------------------+
 */
