/*
 * ====================================================================
 *   Program  : Q_248
 *   Chapter  : 12 - Library Classes
 *   Title    : Percentage from Marks Entered as Strings
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the marks of five subjects as strings
 *   (one word each). Convert each into an integer using
 *   Integer.parseInt() after checking with Character.isDigit() that
 *   it contains only digits and is from 0 to 100. Display the total
 *   and the percentage. If any entry is invalid, display "Invalid
 *   marks: <entry>" and stop.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_248
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in five subjects:");
        int total = 0;

        for (int k = 1; k <= 5; k++)
        {
            String m = sc.next();
            boolean ok = m.length() <= 3;
            for (int i = 0; i < m.length() && ok; i++)
            {
                if (!Character.isDigit(m.charAt(i)))
                    ok = false;
            }
            if (ok && Integer.parseInt(m) > 100)
                ok = false;
            if (!ok)
            {
                System.out.println("Invalid marks: " + m);
                return;
            }
            total = total + Integer.parseInt(m);
        }

        System.out.println("Total      = " + total);
        System.out.println("Percentage = " + (total * 100.0 / 500) + "%");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | total                | int       | to store the total marks             |
 * | k                    | int       | to count the subjects                |
 * | m                    | String    | to store the marks as a string       |
 * | ok                   | boolean   | to record whether the entry is valid |
 * | i                    | int       | to act as the index                  |
 * +----------------------+-----------+--------------------------------------+
 */
