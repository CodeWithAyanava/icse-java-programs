/*
 * ====================================================================
 *   Program  : Q_131
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Smith Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a number and check whether it
 *   is a Smith number or not. A Smith number is a composite number
 *   whose sum of digits is equal to the sum of the digits of its
 *   prime factors (counted with repetition).
 *
 *   Example: 666 = 2 x 3 x 3 x 37
 *            Sum of digits of 666 = 6 + 6 + 6 = 18
 *            Sum of digits of prime factors = 2 + 3 + 3 + (3 + 7) = 18
 * ====================================================================
 */

import java.util.Scanner;

public class Q_131
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();

        long copy = n, sumDigits = 0;
        while (copy > 0)
        {
            sumDigits = sumDigits + copy % 10;
            copy = copy / 10;
        }

        long num = n, sumFactors = 0;
        int factorCount = 0;
        for (long f = 2; num > 1 && f * f <= num; f++)
        {
            while (num % f == 0)
            {
                long t = f;
                while (t > 0)
                {
                    sumFactors = sumFactors + t % 10;
                    t = t / 10;
                }
                factorCount++;
                num = num / f;
            }
        }
        if (num > 1 && factorCount > 0)
        {
            long t = num;
            while (t > 0)
            {
                sumFactors = sumFactors + t % 10;
                t = t / 10;
            }
            factorCount++;
        }

        if (n > 3 && factorCount > 1 && sumDigits == sumFactors)
            System.out.println("Smith Number");
        else
            System.out.println("Not a Smith Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | long      | to store the number                 |
 * | copy                 | long      | to store a working copy of n        |
 * | sumDigits            | long      | to store the sum of digits of n     |
 * | num                  | long      | to store the part left to factorise |
 * | sumFactors           | long      | to store digit sum of prime factors |
 * | factorCount          | int       | to count the prime factors          |
 * | f                    | long      | to act as the trial factor          |
 * | t                    | long      | to store a copy of a factor         |
 * +----------------------+-----------+-------------------------------------+
 */
