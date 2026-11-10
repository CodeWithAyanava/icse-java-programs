/*
 * ====================================================================
 *   Program  : Q_44
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Integer Part, Fractional Part, Ceiling and Floor
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a real number and display:
 *
 *       (a) its integer part (using type casting)
 *       (b) its fractional part
 *       (c) Math.ceil() of the number
 *       (d) Math.floor() of the number
 *       (e) Math.round() of the number
 *
 *   Run the program for both positive and negative numbers and
 *   observe how ceil, floor and round behave.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_44
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number: ");
        double x = sc.nextDouble();

        int ip = (int) x;
        double fp = x - ip;
        System.out.println("(a) Integer part    = " + ip);
        System.out.println("(b) Fractional part = " + fp);
        System.out.println("(c) Math.ceil       = " + Math.ceil(x));
        System.out.println("(d) Math.floor      = " + Math.floor(x));
        System.out.println("(e) Math.round      = " + Math.round(x));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | x                    | double    | to store the real number     |
 * | ip                   | int       | to store the integer part    |
 * | fp                   | double    | to store the fractional part |
 * +----------------------+-----------+------------------------------+
 */
