/*
 * ====================================================================
 *   Program  : Q_51
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Menu-Driven Temperature Conversion
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a menu-driven program using switch-case to convert
 *   temperatures:
 *
 *       1. Celsius to Fahrenheit : F = 9/5 x C + 32
 *       2. Fahrenheit to Celsius : C = 5/9 x (F - 32)
 *
 *   Accept the choice and the temperature, and display the converted
 *   temperature. For an incorrect choice, display "Wrong choice".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_51
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        double t;

        switch (ch)
        {
            case 1:
                System.out.print("Enter temperature in Celsius: ");
                t = sc.nextDouble();
                System.out.println("Temperature in Fahrenheit = " + (9.0 / 5 * t + 32));
                break;
            case 2:
                System.out.print("Enter temperature in Fahrenheit: ");
                t = sc.nextDouble();
                System.out.println("Temperature in Celsius = " + (5.0 / 9 * (t - 32)));
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | ch                   | int       | to store the user's choice |
 * | t                    | double    | to store the temperature   |
 * +----------------------+-----------+----------------------------+
 */
