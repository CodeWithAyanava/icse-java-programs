/*
 * ====================================================================
 *   Program  : Q_196
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : HCF, LCM and Co-prime Check using Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program with the methods:
 *
 *       long hcf(long a, long b) : returns the HCF of a and b using the
 *                                  Euclidean (division) method
 *       long lcm(long a, long b) : returns the LCM using hcf()
 *
 *   In main(), accept two positive integers and display their HCF
 *   and LCM, and whether they are co-prime (two numbers are co-prime
 *   if their HCF is 1). Display "Invalid input" if either number is
 *   not positive.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_196
{
    long hcf(long a, long b)
    {
        while (b != 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    long lcm(long a, long b)
    {
        return a / hcf(a, b) * b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_196 ob = new Q_196();
        System.out.print("Enter two positive integers: ");
        long x = sc.nextLong();
        long y = sc.nextLong();

        if (x <= 0 || y <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            long h = ob.hcf(x, y);
            System.out.println("HCF = " + h);
            System.out.println("LCM = " + ob.lcm(x, y));
            if (h == 1)
                System.out.println("Co-prime numbers");
            else
                System.out.println("Not co-prime numbers");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | a                    | long      | to receive the first number        |
 * | b                    | long      | to receive the second number       |
 * | r                    | long      | to store the remainder             |
 * | x                    | long      | to store the first number entered  |
 * | y                    | long      | to store the second number entered |
 * | h                    | long      | to store the hcf                   |
 * | ob                   | Q_196     | to refer to the object             |
 * +----------------------+-----------+------------------------------------+
 */
