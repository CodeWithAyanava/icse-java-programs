/*
 * ====================================================================
 *   Program  : Q_226
 *   Chapter  : 11 - Constructors
 *   Title    : Class Employee: Annual Income Tax
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Employee (written here as class Q_226) with the
 *   following description:
 *
 *       Instance variables:
 *       String pan     : to store the PAN number
 *       String name    : to store the name
 *       double income  : to store the annual taxable income
 *       double tax     : to store the tax calculated
 *
 *       Member methods:
 *       Employee()   : default constructor
 *       void input() : to accept the PAN number, name and annual income
 *       void calc()  : to calculate the tax as per the following slabs:
 *                        Annual income (Rs)        Tax
 *                        Up to 2,50,000            Nil
 *                        2,50,001 to 5,00,000      5% of the amount above
 *                                                  2,50,000
 *                        5,00,001 to 10,00,000     12,500 + 20% of the
 *                                                  amount above 5,00,000
 *                        Above 10,00,000           1,12,500 + 30% of the
 *                                                  amount above 10,00,000
 *       void display() : to display PAN, name, income and tax
 *
 *   Write a main method to create an object and call the member
 *   methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_226
{
    String pan, name;
    double income, tax;

    Q_226()
    {
        pan = "";
        name = "";
        income = 0;
        tax = 0;
    }

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PAN: ");
        pan = sc.next();
        sc.nextLine();
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter annual income: ");
        income = sc.nextDouble();
    }

    void calc()
    {
        if (income <= 250000)
            tax = 0;
        else if (income <= 500000)
            tax = (income - 250000) * 5 / 100;
        else if (income <= 1000000)
            tax = 12500 + (income - 500000) * 20 / 100;
        else
            tax = 112500 + (income - 1000000) * 30 / 100;
    }

    void display()
    {
        System.out.println("PAN    : " + pan);
        System.out.println("Name   : " + name);
        System.out.println("Income : " + income);
        System.out.println("Tax    : " + tax);
    }

    public static void main(String[] args)
    {
        Q_226 ob = new Q_226();
        ob.input();
        ob.calc();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | pan                  | String    | to store the pan number    |
 * | name                 | String    | to store the name          |
 * | income               | double    | to store the annual income |
 * | tax                  | double    | to store the tax           |
 * | ob                   | Q_226     | to refer to the object     |
 * +----------------------+-----------+----------------------------+
 */
