/*
 * ====================================================================
 *   Program  : Q_39
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Round off a Number to Two Decimal Places
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a real number and round it off to two
 *   decimal places using Math.round().
 *
 *   Example: 12.3456 becomes 12.35 and 7.891 becomes 7.89
 * ====================================================================
 */

import java.util.Scanner;

public class Q_39
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double x = sc.nextDouble();
        double r = Math.round(x * 100) / 100.0;
        System.out.println("Rounded to two decimal places = " + r);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | x                    | double    | to store the real number   |
 * | r                    | double    | to store the rounded value |
 * +----------------------+-----------+----------------------------+
 */
