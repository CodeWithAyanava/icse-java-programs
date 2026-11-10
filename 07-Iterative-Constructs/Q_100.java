/*
 * ====================================================================
 *   Program  : Q_100
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Abundant, Deficient or Perfect Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a positive number and find the sum of
 *   its proper factors (all factors except the number itself). Then
 *   display:
 *
 *       "Abundant Number"  if the sum is greater than the number
 *       "Deficient Number" if the sum is less than the number
 *       "Perfect Number"   if the sum is equal to the number
 *
 *   Example: 12 (1+2+3+4+6 = 16) is Abundant, 8 (1+2+4 = 7) is
 *   Deficient, 6 is Perfect. Display "Invalid input" for zero or a
 *   negative number.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_100
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
            int sum = 0;
            for (int i = 1; i <= n / 2; i++)
            {
                if (n % i == 0)
                    sum = sum + i;
            }
            if (sum > n)
                System.out.println("Abundant Number");
            else if (sum < n)
                System.out.println("Deficient Number");
            else
                System.out.println("Perfect Number");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | n                    | int       | to store the number                |
 * | sum                  | int       | to store the sum of proper factors |
 * | i                    | int       | to act as the possible factor      |
 * +----------------------+-----------+------------------------------------+
 */
