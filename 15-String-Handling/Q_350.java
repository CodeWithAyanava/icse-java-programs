/*
 * ====================================================================
 *   Program  : Q_350
 *   Chapter  : 15 - String Handling
 *   Title    : 24-Hour Time to 12-Hour Time
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to accept a time in 24-hour format as a
 *   string "HH:MM" (for example 13:05) and convert it into 12-hour
 *   format with AM or PM (1:05 PM). Midnight 00:MM is 12:MM AM and
 *   noon 12:MM is 12:MM PM. Validate the input: it must have the
 *   form of two digits, a colon and two digits, with hours 00-23 and
 *   minutes 00-59; otherwise display "Invalid time".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_350
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter time (HH:MM): ");
        String t = sc.next();
        boolean ok = t.length() == 5 && t.charAt(2) == ':'
                  && Character.isDigit(t.charAt(0)) && Character.isDigit(t.charAt(1))
                  && Character.isDigit(t.charAt(3)) && Character.isDigit(t.charAt(4));

        int h = 0, m = 0;
        if (ok)
        {
            h = Integer.parseInt(t.substring(0, 2));
            m = Integer.parseInt(t.substring(3));
            if (h > 23 || m > 59)
                ok = false;
        }

        if (!ok)
        {
            System.out.println("Invalid time");
        }
        else
        {
            String ampm = (h < 12) ? "AM" : "PM";
            int h12 = h % 12;
            if (h12 == 0)
                h12 = 12;
            String mm = t.substring(3);
            System.out.println(h12 + ":" + mm + " " + ampm);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | t                    | String    | to store the time entered           |
 * | ok                   | boolean   | to record whether the time is valid |
 * | h                    | int       | to store the hours                  |
 * | m                    | int       | to store the minutes                |
 * | ampm                 | String    | to store am or pm                   |
 * | h12                  | int       | to store the hour in 12-hour format |
 * | mm                   | String    | to store the minutes as text        |
 * +----------------------+-----------+-------------------------------------+
 */
