/*
 * ====================================================================
 *   Program  : Q_31
 *   Chapter  : 04 - Input in Java
 *   Title    : Gross and Net Salary of an Employee
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the basic salary of an employee and
 *   calculate the gross salary and the net salary using the
 *   following:
 *
 *       Dearness Allowance (DA)   = 30% of basic
 *       House Rent Allowance (HRA) = 15% of basic
 *       Provident Fund (PF)        = 12.5% of basic
 *       Gross salary = basic + DA + HRA
 *       Net salary   = gross salary - PF
 *
 *   Display "Invalid basic salary" if the basic salary is negative.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_31
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the basic salary: ");
        double basic = sc.nextDouble();

        if (basic < 0)
        {
            System.out.println("Invalid basic salary");
        }
        else
        {
            double da = 30.0 / 100 * basic;
            double hra = 15.0 / 100 * basic;
            double pf = 12.5 / 100 * basic;
            double gross = basic + da + hra;
            double net = gross - pf;
            System.out.println("DA           = " + da);
            System.out.println("HRA          = " + hra);
            System.out.println("PF           = " + pf);
            System.out.println("Gross salary = " + gross);
            System.out.println("Net salary   = " + net);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | basic                | double    | to store the basic salary         |
 * | da                   | double    | to store the dearness allowance   |
 * | hra                  | double    | to store the house rent allowance |
 * | pf                   | double    | to store the provident fund       |
 * | gross                | double    | to store the gross salary         |
 * | net                  | double    | to store the net salary           |
 * +----------------------+-----------+-----------------------------------+
 */
