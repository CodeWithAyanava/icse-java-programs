/*
 * ====================================================================
 *   Program  : Q_210
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Calendar of a Month
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a month and a year (from 1600
 *   onwards) and print the calendar of that month in the format
 *   shown below. Use a method int firstDay(int m, int y) to find the
 *   day of the week of the 1st of the month (using Zeller's
 *   congruence, converted so that 0 = Sunday ... 6 = Saturday) and a
 *   method int daysInMonth(int m, int y). Display "Invalid input"
 *   for a wrong month or a year before 1600.
 *
 *   Example: Input 11 2026
 *
 *        Su  Mo  Tu  We  Th  Fr  Sa
 *         1   2   3   4   5   6   7
 *         8   9  10  11  12  13  14
 *        15  16  17  18  19  20  21
 *        22  23  24  25  26  27  28
 *        29  30
 * ====================================================================
 */

import java.util.Scanner;

public class Q_210
{
    int firstDay(int m, int y)
    {
        int d = 1;
        if (m < 3)
        {
            m = m + 12;
            y = y - 1;
        }
        int k = y % 100;
        int j = y / 100;
        int h = (d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
        return (h + 6) % 7;
    }

    int daysInMonth(int m, int y)
    {
        if (m == 2)
            return ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 29 : 28;
        else if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;
        else
            return 31;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_210 ob = new Q_210();
        System.out.print("Enter month and year: ");
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (m < 1 || m > 12 || y < 1600)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int start = ob.firstDay(m, y);
            int days = ob.daysInMonth(m, y);
            System.out.println(" Su  Mo  Tu  We  Th  Fr  Sa");
            for (int i = 0; i < start; i++)
                System.out.print("    ");
            for (int d = 1; d <= days; d++)
            {
                if (d < 10)
                    System.out.print("  " + d + " ");
                else
                    System.out.print(" " + d + " ");
                if ((start + d) % 7 == 0)
                    System.out.println();
            }
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | m                    | int       | to store/receive the month       |
 * | y                    | int       | to store/receive the year        |
 * | d                    | int       | to store the day of the month    |
 * | k                    | int       | to store the year of the century |
 * | j                    | int       | to store the century             |
 * | h                    | int       | to store zeller's day code       |
 * | ob                   | Q_210     | to refer to the object           |
 * | start                | int       | to store the column of the 1st   |
 * | days                 | int       | to store the days in the month   |
 * | i                    | int       | to print the leading blanks      |
 * +----------------------+-----------+----------------------------------+
 */
