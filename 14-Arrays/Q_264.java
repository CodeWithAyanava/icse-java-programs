/*
 * ====================================================================
 *   Program  : Q_264
 *   Chapter  : 14 - Arrays
 *   Title    : Elements Greater than the Average
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the temperatures of n days in an
 *   array, find the average temperature and display the temperatures
 *   that are above the average along with their day numbers.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_264
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        double t[] = new double[n];
        double sum = 0;
        System.out.println("Enter the temperatures:");
        for (int i = 0; i < n; i++)
        {
            t[i] = sc.nextDouble();
            sum = sum + t[i];
        }

        double avg = sum / n;
        System.out.println("Average temperature = " + avg);
        System.out.println("Days above average:");
        for (int i = 0; i < n; i++)
        {
            if (t[i] > avg)
                System.out.println("Day " + (i + 1) + " : " + t[i]);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | n                    | int       | to store the number of days |
 * | t                    | double[]  | to store the temperatures   |
 * | sum                  | double    | to store the sum            |
 * | i                    | int       | to act as the index         |
 * | avg                  | double    | to store the average        |
 * +----------------------+-----------+-----------------------------+
 */
