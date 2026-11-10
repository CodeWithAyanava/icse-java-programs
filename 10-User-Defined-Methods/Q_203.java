/*
 * ====================================================================
 *   Program  : Q_203
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Actual and Formal Parameters with Return Values
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program with a method double simpleInterest(double p,
 *   double r, double t) that returns the simple interest (p x r x t
 *   / 100). In main(), call the method three times with different
 *   actual parameters:
 *
 *       (i)   principal 5000, rate 8, time 3 (literal arguments)
 *       (ii)  values entered by the user (variable arguments)
 *       (iii) principal = twice the principal entered, same rate and
 *             time (expression argument)
 *
 *   Display the interest returned each time and the total of the
 *   three.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_203
{
    double simpleInterest(double p, double r, double t)
    {
        return p * r * t / 100;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_203 ob = new Q_203();

        double i1 = ob.simpleInterest(5000, 8, 3);
        System.out.println("(i)   Interest = " + i1);

        System.out.print("Enter principal, rate and time: ");
        double pr = sc.nextDouble();
        double rt = sc.nextDouble();
        double tm = sc.nextDouble();
        double i2 = ob.simpleInterest(pr, rt, tm);
        System.out.println("(ii)  Interest = " + i2);

        double i3 = ob.simpleInterest(2 * pr, rt, tm);
        System.out.println("(iii) Interest = " + i3);
        System.out.println("Total interest = " + (i1 + i2 + i3));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | p                    | double    | to receive the principal (formal) |
 * | r                    | double    | to receive the rate (formal)      |
 * | t                    | double    | to receive the time (formal)      |
 * | i1                   | double    | to store the first interest       |
 * | pr                   | double    | to store the principal entered    |
 * | rt                   | double    | to store the rate entered         |
 * | tm                   | double    | to store the time entered         |
 * | i2                   | double    | to store the second interest      |
 * | i3                   | double    | to store the third interest       |
 * | ob                   | Q_203     | to refer to the object            |
 * +----------------------+-----------+-----------------------------------+
 */
