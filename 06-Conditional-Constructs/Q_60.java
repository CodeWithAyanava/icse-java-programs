/*
 * ====================================================================
 *   Program  : Q_60
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Fixed Deposit Interest by Period
 * --------------------------------------------------------------------
 *   Question :
 *
 *   A bank pays interest on fixed deposits according to the period
 *   of the deposit:
 *
 *       Number of days               Rate of interest (per annum)
 *       Up to 180 days               5.5%
 *       181 to 364 days              7.5%
 *       Exactly 365 days             9.0%
 *       More than 365 days           8.5%
 *
 *   Write a program to input the principal and the number of days,
 *   and calculate the interest and the maturity amount using
 *   Interest = P x R x (days / 365) / 100. Display "Invalid input"
 *   if either value is zero or negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_60
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter the number of days: ");
        int days = sc.nextInt();
        double r;

        if (p <= 0 || days <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            if (days <= 180)
                r = 5.5;
            else if (days <= 364)
                r = 7.5;
            else if (days == 365)
                r = 9.0;
            else
                r = 8.5;
            double interest = p * r * (days / 365.0) / 100;
            System.out.println("Rate of interest = " + r + "%");
            System.out.println("Interest         = Rs " + interest);
            System.out.println("Maturity amount  = Rs " + (p + interest));
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
 * | days                 | int       | to store the number of days   |
 * | r                    | double    | to store the rate of interest |
 * | interest             | double    | to store the interest earned  |
 * +----------------------+-----------+-------------------------------+
 */
