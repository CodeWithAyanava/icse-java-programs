/*
 * ====================================================================
 *   Program  : Q_81
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Perfect Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Perfect number or not. A Perfect number is a number that is
 *   equal to the sum of its factors excluding the number itself.
 *
 *   Example: 6 = 1 + 2 + 3 and 28 = 1 + 2 + 4 + 7 + 14
 * ====================================================================
 */

import java.util.Scanner;

public class Q_81
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= n / 2; i++)
        {
            if (n % i == 0)
                sum = sum + i;
        }

        if (n > 1 && sum == n)
            System.out.println("Perfect Number");
        else
            System.out.println("Not a Perfect Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | n                    | int       | to store the number           |
 * | sum                  | int       | to store the sum of factors   |
 * | i                    | int       | to act as the possible factor |
 * +----------------------+-----------+-------------------------------+
 */
