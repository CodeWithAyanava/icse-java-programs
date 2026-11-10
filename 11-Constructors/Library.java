/*
 * ====================================================================
 *   Program  : Q_228
 *   Chapter  : 11 - Constructors
 *   Title    : Class Library: Fine for Late Return
 *   Class    : Library  (file Library.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Library with the following description:
 *
 *       Instance variables:
 *       String title, author; int daysLate; double fine
 *
 *       Member methods:
 *       Library(String t, String a, int d) : parameterised constructor to
 *                      initialise the title, author and number of days the
 *                      book is returned late (a negative value is stored
 *                      as 0)
 *       void computeFine() : to compute the fine:
 *                              First 5 days late       Rs 2.00 per day
 *                              Next 5 days (6 to 10)   Rs 3.50 per day
 *                              Beyond 10 days          Rs 5.00 per day
 *       void display()     : to display the details and the fine
 *
 *   In main(), accept the details, create an object using the
 *   constructor and call the methods.
 * ====================================================================
 */

import java.util.Scanner;

public class Library
{
    String title, author;
    int daysLate;
    double fine;

    Library(String t, String a, int d)
    {
        title = t;
        author = a;
        daysLate = (d < 0) ? 0 : d;
        fine = 0;
    }

    void computeFine()
    {
        if (daysLate <= 5)
            fine = daysLate * 2.0;
        else if (daysLate <= 10)
            fine = 5 * 2.0 + (daysLate - 5) * 3.5;
        else
            fine = 5 * 2.0 + 5 * 3.5 + (daysLate - 10) * 5.0;
    }

    void display()
    {
        System.out.println("Title     : " + title);
        System.out.println("Author    : " + author);
        System.out.println("Days late : " + daysLate);
        System.out.println("Fine      : Rs " + fine);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String t = sc.nextLine();
        System.out.print("Enter author: ");
        String a = sc.nextLine();
        System.out.print("Enter days late: ");
        int d = sc.nextInt();
        Library ob = new Library(t, a, d);
        ob.computeFine();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | title                | String    | to store the title              |
 * | author               | String    | to store the author             |
 * | daysLate             | int       | to store the days returned late |
 * | fine                 | double    | to store the fine               |
 * | t                    | String    | to store/receive the title      |
 * | a                    | String    | to store/receive the author     |
 * | d                    | int       | to store/receive the days late  |
 * | ob                   | Library   | to refer to the object          |
 * +----------------------+-----------+---------------------------------+
 */
