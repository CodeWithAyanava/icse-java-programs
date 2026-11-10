/*
 * ====================================================================
 *   Program  : Q_37
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Compound Interest using Math.pow()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the principal, the rate of interest
 *   per annum and the time in years, and calculate the amount and
 *   the compound interest (compounded annually).
 *
 *       Amount = P x (1 + R / 100)^T        Compound Interest = Amount - P
 *
 *   Display "Invalid input" if any value is negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_37
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter principal, rate and time: ");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();

        if (p < 0 || r < 0 || t < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            double amt = p * Math.pow(1 + r / 100, t);
            double ci = amt - p;
            System.out.println("Amount            = " + Math.round(amt * 100) / 100.0);
            System.out.println("Compound Interest = " + Math.round(ci * 100) / 100.0);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | p                    | double    | to store the principal         |
 * | r                    | double    | to store the rate of interest  |
 * | t                    | double    | to store the time in years     |
 * | amt                  | double    | to store the amount            |
 * | ci                   | double    | to store the compound interest |
 * +----------------------+-----------+--------------------------------+
 */
