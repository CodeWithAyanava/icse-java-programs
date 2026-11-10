/*
 * ====================================================================
 *   Program  : Q_236
 *   Chapter  : 11 - Constructors
 *   Title    : Class CinemaTicket
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class CinemaTicket (written here as class Q_236) with
 *   the following description:
 *
 *       Instance variables:
 *       String name; char seat; int tickets; double amount
 *
 *       Member methods:
 *       CinemaTicket() : default constructor
 *       void accept()  : to accept the customer's name, the seat class
 *                        ('G' Gold, 'S' Silver, 'R' Regular) and the
 *                        number of tickets
 *       void compute() : to calculate the amount using a switch statement:
 *                          Gold Rs 350, Silver Rs 250, Regular Rs 150 per
 *                          ticket, plus a convenience fee of 5% of the
 *                          ticket cost. Booking more than 5 tickets gives a
 *                          discount of 10% on the ticket cost (before the
 *                          fee is added).
 *       void display() : to display the details and the amount
 *
 *   Write a main method to create an object and call the methods.
 *   Display "Invalid booking" for a wrong seat class or fewer than 1
 *   ticket.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_236
{
    String name;
    char seat;
    int tickets;
    double amount;

    Q_236()
    {
        name = "";
        seat = ' ';
        tickets = 0;
        amount = 0;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter seat class (G/S/R): ");
        seat = sc.next().charAt(0);
        System.out.print("Enter number of tickets: ");
        tickets = sc.nextInt();
    }

    void compute()
    {
        int rate;
        switch (seat)
        {
            case 'G': case 'g': rate = 350; break;
            case 'S': case 's': rate = 250; break;
            case 'R': case 'r': rate = 150; break;
            default: rate = 0;
        }
        if (rate == 0 || tickets < 1)
        {
            amount = -1;
        }
        else
        {
            double cost = rate * tickets;
            if (tickets > 5)
                cost = cost - cost * 10 / 100;
            amount = cost + cost * 5 / 100;
        }
    }

    void display()
    {
        if (amount < 0)
        {
            System.out.println("Invalid booking");
        }
        else
        {
            System.out.println("Name    : " + name);
            System.out.println("Seat    : " + seat);
            System.out.println("Tickets : " + tickets);
            System.out.println("Amount  : Rs " + amount);
        }
    }

    public static void main(String[] args)
    {
        Q_236 ob = new Q_236();
        ob.accept();
        ob.compute();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | name                 | String    | to store the customer's name   |
 * | seat                 | char      | to store the seat class        |
 * | tickets              | int       | to store the number of tickets |
 * | amount               | double    | to store the amount payable    |
 * | rate                 | int       | to store the rate per ticket   |
 * | cost                 | double    | to store the ticket cost       |
 * | ob                   | Q_236     | to refer to the object         |
 * +----------------------+-----------+--------------------------------+
 */
