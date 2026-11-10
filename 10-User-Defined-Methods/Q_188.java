/*
 * ====================================================================
 *   Program  : Q_188
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading largest()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_188) to overload a
 *   method largest() as follows:
 *
 *       (i)   int largest(int a, int b)        : returns the larger of two
 *                                                integers
 *       (ii)  int largest(int a, int b, int c) : returns the largest of
 *                                                three integers (use (i))
 *       (iii) double largest(double a, double b) : returns the larger of
 *                                                two real numbers
 *
 *   Write a main method to accept values and call the methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_188
{
    int largest(int a, int b)
    {
        if (a > b)
            return a;
        else
            return b;
    }

    int largest(int a, int b, int c)
    {
        return largest(largest(a, b), c);
    }

    double largest(double a, double b)
    {
        if (a > b)
            return a;
        else
            return b;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_188 ob = new Q_188();
        System.out.print("Enter three integers: ");
        int p = sc.nextInt();
        int q = sc.nextInt();
        int r = sc.nextInt();
        System.out.print("Enter two real numbers: ");
        double x = sc.nextDouble();
        double y = sc.nextDouble();

        System.out.println("Larger of first two integers = " + ob.largest(p, q));
        System.out.println("Largest of three integers    = " + ob.largest(p, q, r));
        System.out.println("Larger real number           = " + ob.largest(x, y));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | a                    | int       | to receive the first integer      |
 * | b                    | int       | to receive the second integer     |
 * | c                    | int       | to receive the third integer      |
 * | a                    | double    | to receive the first real number  |
 * | b                    | double    | to receive the second real number |
 * | p                    | int       | to store the first integer        |
 * | q                    | int       | to store the second integer       |
 * | r                    | int       | to store the third integer        |
 * | x                    | double    | to store the first real number    |
 * | y                    | double    | to store the second real number   |
 * | ob                   | Q_188     | to refer to the object            |
 * +----------------------+-----------+-----------------------------------+
 */
