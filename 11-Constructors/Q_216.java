/*
 * ====================================================================
 *   Program  : Q_216
 *   Chapter  : 11 - Constructors
 *   Title    : Constructor Overloading: Class Time
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Time (written here as class Q_216) with data
 *   members int hh, mm, ss and the following overloaded
 *   constructors:
 *
 *       Time()                      : sets the time to 00:00:00
 *       Time(int h)                 : sets hours to h, minutes and
 *                                     seconds to 0
 *       Time(int h, int m)          : sets hours and minutes
 *       Time(int h, int m, int s)   : sets hours, minutes and seconds
 *
 *   Every constructor must store a valid time: any value out of
 *   range (hours 0-23, minutes and seconds 0-59) is stored as 0.
 *   Also write void display() to show the time as hh:mm:ss with two
 *   digits each. In main(), create one object with each constructor,
 *   including one with invalid values, and display them.
 * ====================================================================
 */

public class Q_216
{
    int hh, mm, ss;

    Q_216()
    {
        hh = 0;
        mm = 0;
        ss = 0;
    }

    Q_216(int h)
    {
        hh = (h >= 0 && h <= 23) ? h : 0;
        mm = 0;
        ss = 0;
    }

    Q_216(int h, int m)
    {
        hh = (h >= 0 && h <= 23) ? h : 0;
        mm = (m >= 0 && m <= 59) ? m : 0;
        ss = 0;
    }

    Q_216(int h, int m, int s)
    {
        hh = (h >= 0 && h <= 23) ? h : 0;
        mm = (m >= 0 && m <= 59) ? m : 0;
        ss = (s >= 0 && s <= 59) ? s : 0;
    }

    void display()
    {
        String t = "";
        if (hh < 10) t = t + "0";
        t = t + hh + ":";
        if (mm < 10) t = t + "0";
        t = t + mm + ":";
        if (ss < 10) t = t + "0";
        t = t + ss;
        System.out.println(t);
    }

    public static void main(String[] args)
    {
        Q_216 t1 = new Q_216();
        Q_216 t2 = new Q_216(9);
        Q_216 t3 = new Q_216(14, 5);
        Q_216 t4 = new Q_216(23, 59, 7);
        Q_216 t5 = new Q_216(25, 70, 30);
        t1.display();
        t2.display();
        t3.display();
        t4.display();
        t5.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | hh                   | int       | to store the hours                 |
 * | mm                   | int       | to store the minutes               |
 * | ss                   | int       | to store the seconds               |
 * | h                    | int       | to receive the hours               |
 * | m                    | int       | to receive the minutes             |
 * | s                    | int       | to receive the seconds             |
 * | t                    | String    | to build the formatted time        |
 * | t1                   | Q_216     | to refer to the first time object  |
 * | t2                   | Q_216     | to refer to the second time object |
 * | t3                   | Q_216     | to refer to the third time object  |
 * | t4                   | Q_216     | to refer to the fourth time object |
 * | t5                   | Q_216     | to refer to the fifth time object  |
 * +----------------------+-----------+------------------------------------+
 */
