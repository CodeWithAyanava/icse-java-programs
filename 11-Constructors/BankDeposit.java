/*
 * ====================================================================
 *   Program  : Q_234
 *   Chapter  : 11 - Constructors
 *   Title    : Class BankDeposit: Maturity with Compound Interest
 *   Class    : BankDeposit  (file BankDeposit.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class BankDeposit with the following description:
 *
 *       Instance variables:
 *       String name; double principal; int years; double rate, maturity
 *
 *       Member methods:
 *       BankDeposit(String n, double p, int y) : parameterised constructor
 *       void setRate() : to set the rate of interest:
 *                          Up to 1 year          6.0%
 *                          2 to 3 years          7.0%
 *                          More than 3 years     7.5%
 *       void compute() : to compute the maturity amount using compound
 *                        interest, maturity = principal x (1 + rate/100)^years
 *       void display() : to display all the details (maturity rounded to
 *                        two decimal places)
 *
 *   In main(), accept the details, create an object and call the
 *   methods. Display "Invalid input" if the principal or years is
 *   not positive.
 * ====================================================================
 */

import java.util.Scanner;

public class BankDeposit
{
    String name;
    double principal;
    int years;
    double rate, maturity;

    BankDeposit(String n, double p, int y)
    {
        name = n;
        principal = p;
        years = y;
        rate = 0;
        maturity = 0;
    }

    void setRate()
    {
        if (years <= 1)
            rate = 6.0;
        else if (years <= 3)
            rate = 7.0;
        else
            rate = 7.5;
    }

    void compute()
    {
        maturity = principal * Math.pow(1 + rate / 100, years);
    }

    void display()
    {
        System.out.println("Name      : " + name);
        System.out.println("Principal : " + principal);
        System.out.println("Years     : " + years);
        System.out.println("Rate      : " + rate + "%");
        System.out.println("Maturity  : " + Math.round(maturity * 100) / 100.0);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String n = sc.nextLine();
        System.out.print("Enter principal and years: ");
        double p = sc.nextDouble();
        int y = sc.nextInt();

        if (p <= 0 || y <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            BankDeposit ob = new BankDeposit(n, p, y);
            ob.setRate();
            ob.compute();
            ob.display();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-------------+--------------------------------+
 * | Name of the Variable | Data Type   | Purpose / Description          |
 * +----------------------+-------------+--------------------------------+
 * | name                 | String      | to store the depositor's name  |
 * | principal            | double      | to store the principal         |
 * | years                | int         | to store the period in years   |
 * | rate                 | double      | to store the rate of interest  |
 * | maturity             | double      | to store the maturity amount   |
 * | n                    | String      | to store/receive the name      |
 * | p                    | double      | to store/receive the principal |
 * | y                    | int         | to store/receive the years     |
 * | ob                   | BankDeposit | to refer to the object         |
 * +----------------------+-------------+--------------------------------+
 */
