/*
 * ====================================================================
 *   Program  : Q_211
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Age in Years, Months and Days
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a person's date of birth and
 *   today's date (each as day, month, year) and calculate the
 *   person's exact age in years, months and days. While the day of
 *   today is smaller than the day of birth, borrow the number of
 *   days of the previous month (going back one month each time); if
 *   the month is then smaller, borrow 12 months. Use a method int
 *   daysInMonth(int m, int y). Display "Invalid input" if the date
 *   of birth is after today's date.
 *
 *   Example: DOB 15/8/2011, Today 10/11/2026 -> 15 years 2 months 26
 *   days
 * ====================================================================
 */

import java.util.Scanner;

public class Q_211
{
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
        Q_211 ob = new Q_211();
        System.out.print("Enter date of birth (d m y): ");
        int bd = sc.nextInt();
        int bm = sc.nextInt();
        int by = sc.nextInt();
        System.out.print("Enter today's date (d m y): ");
        int td = sc.nextInt();
        int tm = sc.nextInt();
        int ty = sc.nextInt();

        long birth = by * 10000L + bm * 100 + bd;
        long today = ty * 10000L + tm * 100 + td;
        if (birth > today)
        {
            System.out.println("Invalid input");
        }
        else
        {
            while (td < bd)
            {
                int pm = tm - 1;
                int py = ty;
                if (pm == 0)
                {
                    pm = 12;
                    py = ty - 1;
                }
                td = td + ob.daysInMonth(pm, py);
                tm = tm - 1;
                if (tm == 0)
                {
                    tm = 12;
                    ty = ty - 1;
                }
            }
            if (tm < bm)
            {
                tm = tm + 12;
                ty = ty - 1;
            }
            System.out.println("Age: " + (ty - by) + " years " + (tm - bm) + " months " + (td - bd) + " days");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                   |
 * +----------------------+-----------+-----------------------------------------+
 * | m                    | int       | to receive the month                    |
 * | y                    | int       | to receive the year                     |
 * | bd                   | int       | to store the day of birth               |
 * | bm                   | int       | to store the month of birth             |
 * | by                   | int       | to store the year of birth              |
 * | td                   | int       | to store today's day                    |
 * | tm                   | int       | to store today's month                  |
 * | ty                   | int       | to store today's year                   |
 * | birth                | long      | to store the birth date as yyyymmdd     |
 * | today                | long      | to store today's date as yyyymmdd       |
 * | pm                   | int       | to store the previous month             |
 * | py                   | int       | to store the year of the previous month |
 * | ob                   | Q_211     | to refer to the object                  |
 * +----------------------+-----------+-----------------------------------------+
 */
