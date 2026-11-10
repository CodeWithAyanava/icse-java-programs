/*
 * ====================================================================
 *   Program  : Q_222
 *   Chapter  : 11 - Constructors
 *   Title    : Class movieMagic
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [ICSE 2014] Define a class named movieMagic (written here as
 *   class Q_222) with the following description:
 *
 *       Instance variables:
 *       int year       : to store the year of release of a movie
 *       String title   : to store the title of the movie
 *       float rating   : to store the popularity rating of the movie
 *                        (minimum rating = 0.0 and maximum rating = 5.0)
 *
 *       Member methods:
 *       movieMagic()   : default constructor to initialise numeric data
 *                        members to 0 and String data member to ""
 *       void accept()  : to input and store year, title and rating
 *       void display() : to display the title of the movie and a message
 *                        based on the rating as per the table below:
 *                          Rating              Message to be displayed
 *                          0.0 to 2.0          Flop
 *                          2.1 to 3.4          Semi-hit
 *                          3.5 to 4.5          Hit
 *                          4.6 to 5.0          Super Hit
 *
 *   Write a main method to create an object of the class and call
 *   the above member methods. (Display "Invalid rating" for a rating
 *   outside 0.0 to 5.0.)
 * ====================================================================
 */

import java.util.Scanner;

public class Q_222
{
    int year;
    String title;
    float rating;

    Q_222()
    {
        year = 0;
        title = "";
        rating = 0.0f;
    }

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the title: ");
        title = sc.nextLine();
        System.out.print("Enter the year of release: ");
        year = sc.nextInt();
        System.out.print("Enter the rating: ");
        rating = sc.nextFloat();
    }

    void display()
    {
        System.out.println("Title : " + title);
        if (rating < 0.0f || rating > 5.0f)
            System.out.println("Invalid rating");
        else if (rating <= 2.0f)
            System.out.println("Flop");
        else if (rating <= 3.4f)
            System.out.println("Semi-hit");
        else if (rating <= 4.5f)
            System.out.println("Hit");
        else
            System.out.println("Super Hit");
    }

    public static void main(String[] args)
    {
        Q_222 ob = new Q_222();
        ob.accept();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | year                 | int       | to store the year of release |
 * | title                | String    | to store the title           |
 * | rating               | float     | to store the rating          |
 * | ob                   | Q_222     | to refer to the object       |
 * +----------------------+-----------+------------------------------+
 */
