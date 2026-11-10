/*
 * ====================================================================
 *   Program  : Q_213
 *   Chapter  : 11 - Constructors
 *   Title    : Parameterised Constructor
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Employee (written here as class Q_213) with the
 *   following description:
 *
 *       Data members : String name; double basic, da, hra, gross
 *       Employee(String n, double b) : parameterised constructor to
 *                      initialise name and basic, and calculate
 *                      da = 25% of basic, hra = 12% of basic and
 *                      gross = basic + da + hra
 *       void display() : to display all the details
 *
 *   In main(), accept the name and basic salary, create an object
 *   using the parameterised constructor and display the details.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_213
{
    String name;
    double basic, da, hra, gross;

    Q_213(String n, double b)
    {
        name = n;
        basic = b;
        da = basic * 25 / 100;
        hra = basic * 12 / 100;
        gross = basic + da + hra;
    }

    void display()
    {
        System.out.println("Name   : " + name);
        System.out.println("Basic  : " + basic);
        System.out.println("DA     : " + da);
        System.out.println("HRA    : " + hra);
        System.out.println("Gross  : " + gross);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String nm = sc.nextLine();
        System.out.print("Enter basic salary: ");
        double bs = sc.nextDouble();
        Q_213 e = new Q_213(nm, bs);
        e.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | name                 | String    | to store the employee's name      |
 * | basic                | double    | to store the basic salary         |
 * | da                   | double    | to store the dearness allowance   |
 * | hra                  | double    | to store the house rent allowance |
 * | gross                | double    | to store the gross salary         |
 * | n                    | String    | to receive the name               |
 * | b                    | double    | to receive the basic salary       |
 * | nm                   | String    | to store the name entered         |
 * | bs                   | double    | to store the basic entered        |
 * | e                    | Q_213     | to refer to the employee object   |
 * +----------------------+-----------+-----------------------------------+
 */
