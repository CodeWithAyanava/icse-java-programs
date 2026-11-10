/*
 * ====================================================================
 *   Program  : Q_208
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Day Number of the Year
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a date (day, month and year)
 *   and find the day number of that date in the year, i.e. how many
 *   days have passed from 1 January up to and including that date
 *   (e.g. 1 March 2024 is day 61 because 2024 is a leap year). Use
 *   the methods isLeap(int y) and daysInMonth(int m, int y). Display
 *   "Invalid date" for a wrong date.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_208
{
    boolean isLeap(int y)
    {
        return (y % 4 == 0 && y % 100 != 0) || y % 400 == 0;
    }

    int daysInMonth(int m, int y)
    {
        if (m == 2)
        {
            if (isLeap(y))
                return 29;
            else
                return 28;
        }
        else if (m == 4 || m == 6 || m == 9 || m == 11)
            return 30;
        else if (m >= 1 && m <= 12)
            return 31;
        else
            return 0;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_208 ob = new Q_208();
        System.out.print("Enter day, month and year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        if (y <= 0 || d < 1 || d > ob.daysInMonth(m, y))
        {
            System.out.println("Invalid date");
        }
        else
        {
            int dayNo = d;
            for (int i = 1; i < m; i++)
                dayNo = dayNo + ob.daysInMonth(i, y);
            System.out.println("Day number = " + dayNo);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | y                    | int       | to store/receive the year   |
 * | m                    | int       | to store/receive the month  |
 * | d                    | int       | to store the day            |
 * | dayNo                | int       | to store the day number     |
 * | i                    | int       | to act as the month counter |
 * | ob                   | Q_208     | to refer to the object      |
 * +----------------------+-----------+-----------------------------+
 */
