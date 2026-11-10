/*
 * ====================================================================
 *   Program  : Q_209
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Day of the Week for any Date
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a date (day, month and year,
 *   year from 1600 onwards) and find the day of the week on which it
 *   falls, using Zeller's congruence:
 *
 *       If the month is January or February, treat it as month 13 or 14
 *       of the previous year.
 *       K = year % 100,  J = year / 100
 *       h = (d + (13 (m + 1)) / 5 + K + K/4 + J/4 + 5J) % 7
 *       h = 0 : Saturday, 1 : Sunday, 2 : Monday, ..., 6 : Friday
 *
 *   Write a method int zeller(int d, int m, int y) that returns h,
 *   and a method String dayName(int h). Display "Invalid date" for
 *   an invalid date.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_209
{
    int zeller(int d, int m, int y)
    {
        if (m < 3)
        {
            m = m + 12;
            y = y - 1;
        }
        int k = y % 100;
        int j = y / 100;
        return (d + 13 * (m + 1) / 5 + k + k / 4 + j / 4 + 5 * j) % 7;
    }

    String dayName(int h)
    {
        switch (h)
        {
            case 0: return "Saturday";
            case 1: return "Sunday";
            case 2: return "Monday";
            case 3: return "Tuesday";
            case 4: return "Wednesday";
            case 5: return "Thursday";
            default: return "Friday";
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_209 ob = new Q_209();
        System.out.print("Enter day, month and year: ");
        int d = sc.nextInt();
        int m = sc.nextInt();
        int y = sc.nextInt();

        int maxDay;
        if (m == 2)
            maxDay = ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) ? 29 : 28;
        else if (m == 4 || m == 6 || m == 9 || m == 11)
            maxDay = 30;
        else if (m >= 1 && m <= 12)
            maxDay = 31;
        else
            maxDay = 0;

        if (y < 1600 || d < 1 || d > maxDay)
            System.out.println("Invalid date");
        else
            System.out.println(d + "/" + m + "/" + y + " is a " + ob.dayName(ob.zeller(d, m, y)));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | d                    | int       | to store/receive the day         |
 * | m                    | int       | to store/receive the month       |
 * | y                    | int       | to store/receive the year        |
 * | k                    | int       | to store the year of the century |
 * | j                    | int       | to store the century             |
 * | h                    | int       | to receive the day code          |
 * | maxDay               | int       | to store the days in the month   |
 * | ob                   | Q_209     | to refer to the object           |
 * +----------------------+-----------+----------------------------------+
 */
