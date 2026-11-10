/*
 * ====================================================================
 *   Program  : Q_180
 *   Chapter  : 09 - Class as the Basis of all Computation
 *   Title    : Class Temperature with Conversion Methods
 *   Class    : Temperature  (file Temperature.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Temperature with the following description:
 *
 *       Data member : double celsius
 *       void setCelsius(double c)  : to assign the temperature
 *       double toFahrenheit()      : to return the temperature in
 *                                    Fahrenheit (9/5 x C + 32)
 *       double toKelvin()          : to return the temperature in
 *                                    Kelvin (C + 273.15)
 *       void show()                : to display the temperature in all
 *                                    three scales
 *
 *   In main(), accept a temperature in Celsius, create an object and
 *   call the methods. If the temperature is below absolute zero
 *   (-273.15 C), display "Temperature below absolute zero is not
 *   possible".
 * ====================================================================
 */

import java.util.Scanner;

public class Temperature
{
    double celsius;

    void setCelsius(double c)
    {
        celsius = c;
    }

    double toFahrenheit()
    {
        return 9.0 / 5 * celsius + 32;
    }

    double toKelvin()
    {
        return celsius + 273.15;
    }

    void show()
    {
        System.out.println("Celsius    : " + celsius);
        System.out.println("Fahrenheit : " + toFahrenheit());
        System.out.println("Kelvin     : " + toKelvin());
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        double c = sc.nextDouble();

        if (c < -273.15)
        {
            System.out.println("Temperature below absolute zero is not possible");
        }
        else
        {
            Temperature t = new Temperature();
            t.setCelsius(c);
            t.show();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-------------+-------------------------------------+
 * | Name of the Variable | Data Type   | Purpose / Description               |
 * +----------------------+-------------+-------------------------------------+
 * | celsius              | double      | to store the temperature in celsius |
 * | c                    | double      | to store/receive the celsius value  |
 * | t                    | Temperature | to refer to the temperature object  |
 * +----------------------+-------------+-------------------------------------+
 */
