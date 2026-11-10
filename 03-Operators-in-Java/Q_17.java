/*
 * ====================================================================
 *   Program  : Q_17
 *   Chapter  : 03 - Operators in Java
 *   Title    : Simple Interest and Amount
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the principal, the rate of interest
 *   (per annum) and the time (in years), and calculate the simple
 *   interest and the amount.
 *
 *       Simple Interest = (P x R x T) / 100        Amount = P + SI
 *
 *   Display "Invalid input" if any value is negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_17
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter the time in years: ");
        double t = sc.nextDouble();

        if (p < 0 || r < 0 || t < 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            double si = p * r * t / 100;
            double amt = p + si;
            System.out.println("Simple Interest = " + si);
            System.out.println("Amount          = " + amt);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | p                    | double    | to store the principal        |
 * | r                    | double    | to store the rate of interest |
 * | t                    | double    | to store the time in years    |
 * | si                   | double    | to store the simple interest  |
 * | amt                  | double    | to store the amount           |
 * +----------------------+-----------+-------------------------------+
 */
