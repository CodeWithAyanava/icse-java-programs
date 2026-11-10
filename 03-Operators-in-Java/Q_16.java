/*
 * ====================================================================
 *   Program  : Q_16
 *   Chapter  : 03 - Operators in Java
 *   Title    : Temperature Conversion: Celsius and Fahrenheit
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a temperature in degree Celsius and
 *   convert it into degree Fahrenheit. Also accept a temperature in
 *   degree Fahrenheit and convert it into degree Celsius.
 *
 *       F = (9 / 5) x C + 32        C = (5 / 9) x (F - 32)
 *
 *   Make sure the formula is written so that integer division does
 *   not spoil the result.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_16
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();
        double f = 9.0 / 5 * c + 32;
        System.out.println(c + " C = " + f + " F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fah = sc.nextDouble();
        double cel = 5.0 / 9 * (fah - 32);
        System.out.println(fah + " F = " + cel + " C");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                   |
 * +----------------------+-----------+-----------------------------------------+
 * | c                    | double    | to store the temperature in celsius     |
 * | f                    | double    | to store the converted fahrenheit value |
 * | fah                  | double    | to store the temperature in fahrenheit  |
 * | cel                  | double    | to store the converted celsius value    |
 * +----------------------+-----------+-----------------------------------------+
 */
