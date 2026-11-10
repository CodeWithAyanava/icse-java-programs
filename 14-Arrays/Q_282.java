/*
 * ====================================================================
 *   Program  : Q_282
 *   Chapter  : 14 - Arrays
 *   Title    : Running Total (Cumulative Sum) Array
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the daily sales of n days in an array
 *   and create another array in which each element is the running
 *   total of sales up to that day (cumulative sum). Display both
 *   arrays side by side. If the size entered is less than 1, display
 *   "Invalid size".
 *
 *   Example: 100 250 75 -> 100 350 425
 * ====================================================================
 */

import java.util.Scanner;

public class Q_282
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
        double s[] = new double[n];
        double c[] = new double[n];
        System.out.println("Enter the daily sales:");
        for (int i = 0; i < n; i++)
            s[i] = sc.nextDouble();

        for (int i = 0; i < n; i++)
        {
            if (i == 0)
                c[i] = s[i];
            else
                c[i] = c[i - 1] + s[i];
        }

        System.out.println("Day\tSales\tRunning total");
        for (int i = 0; i < n; i++)
            System.out.println((i + 1) + "\t" + s[i] + "\t" + c[i]);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | n                    | int       | to store the number of days |
 * | s                    | double[]  | to store the daily sales    |
 * | c                    | double[]  | to store the running totals |
 * | i                    | int       | to act as the index         |
 * +----------------------+-----------+-----------------------------+
 */
