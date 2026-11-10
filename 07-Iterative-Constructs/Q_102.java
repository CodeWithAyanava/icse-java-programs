/*
 * ====================================================================
 *   Program  : Q_102
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : HCF and LCM of Two Numbers
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two integers and find their HCF
 *   (Highest Common Factor) using the division (Euclid's) method and
 *   their LCM (Lowest Common Multiple) using the relation LCM = (a x
 *   b) / HCF. Work with the absolute values of the numbers. Display
 *   "Not defined" if both numbers are zero.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_102
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        long a = Math.abs(sc.nextLong());
        long b = Math.abs(sc.nextLong());

        if (a == 0 && b == 0)
        {
            System.out.println("Not defined");
        }
        else
        {
            long x = a, y = b;
            while (y != 0)
            {
                long r = x % y;
                x = y;
                y = r;
            }
            long hcf = x;
            long lcm = a / hcf * b;
            System.out.println("HCF = " + hcf);
            System.out.println("LCM = " + lcm);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | a                    | long      | to store the first number          |
 * | b                    | long      | to store the second number         |
 * | x                    | long      | to store the dividend in each step |
 * | y                    | long      | to store the divisor in each step  |
 * | r                    | long      | to store the remainder             |
 * | hcf                  | long      | to store the hcf                   |
 * | lcm                  | long      | to store the lcm                   |
 * +----------------------+-----------+------------------------------------+
 */
