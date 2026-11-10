/*
 * ====================================================================
 *   Program  : Q_215
 *   Chapter  : 11 - Constructors
 *   Title    : The this Keyword in a Constructor
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Book (written here as class Q_215) with data
 *   members String title, String author and double price. Write a
 *   parameterised constructor whose parameters have the same names
 *   as the data members (title, author, price) and use the keyword
 *   this to assign them. Also define void show(). In main(), create
 *   an object using values entered by the user and display it. If
 *   the price entered is negative, store 0.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_215
{
    String title, author;
    double price;

    Q_215(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        if (price < 0)
            this.price = 0;
        else
            this.price = price;
    }

    void show()
    {
        System.out.println("Title  : " + title);
        System.out.println("Author : " + author);
        System.out.println("Price  : Rs " + price);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter title: ");
        String t = sc.nextLine();
        System.out.print("Enter author: ");
        String a = sc.nextLine();
        System.out.print("Enter price: ");
        double p = sc.nextDouble();
        Q_215 bk = new Q_215(t, a, p);
        bk.show();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | title                | String    | to store/receive the title  |
 * | author               | String    | to store/receive the author |
 * | price                | double    | to store/receive the price  |
 * | t                    | String    | to store the title entered  |
 * | a                    | String    | to store the author entered |
 * | p                    | double    | to store the price entered  |
 * | bk                   | Q_215     | to refer to the book object |
 * +----------------------+-----------+-----------------------------+
 */
