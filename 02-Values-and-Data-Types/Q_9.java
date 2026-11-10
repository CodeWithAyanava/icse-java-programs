/*
 * ====================================================================
 *   Program  : Q_9
 *   Chapter  : 02 - Values and Data Types
 *   Title    : Explicit Type Casting
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to demonstrate explicit type conversion (type
 *   casting). Accept two integers a and b, and a real number x from
 *   the user, and display:
 *
 *       (a) the quotient a / b without casting and with (double) casting
 *       (b) the integer part of x using (int) casting
 *       (c) the character whose code is the integer part of x, using
 *           (char) casting (only if that code lies from 0 to 127,
 *           otherwise display "Not a valid ASCII code")
 *       (d) the value of x rounded off to the nearest whole number using
 *           only casting, i.e. (int)(x + 0.5) for x >= 0 and
 *           (int)(x - 0.5) for x < 0
 *
 *   If b is zero, display "Division by zero is not possible" for
 *   part (a).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_9
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers a and b: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter a real number x: ");
        double x = sc.nextDouble();

        if (b != 0)
        {
            System.out.println("(a) a / b          = " + (a / b));
            System.out.println("    (double) a / b = " + ((double) a / b));
        }
        else
        {
            System.out.println("(a) Division by zero is not possible");
        }

        int whole = (int) x;
        System.out.println("(b) (int) x = " + whole);
        if (whole >= 0 && whole <= 127)
            System.out.println("(c) (char) " + whole + " = " + (char) whole);
        else
            System.out.println("(c) Not a valid ASCII code");

        int rounded;
        if (x >= 0)
            rounded = (int) (x + 0.5);
        else
            rounded = (int) (x - 0.5);
        System.out.println("(d) x rounded = " + rounded);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | a                    | int       | to store the first integer     |
 * | b                    | int       | to store the second integer    |
 * | x                    | double    | to store the real number       |
 * | whole                | int       | to store the integer part of x |
 * | rounded              | int       | to store x rounded off         |
 * +----------------------+-----------+--------------------------------+
 */
