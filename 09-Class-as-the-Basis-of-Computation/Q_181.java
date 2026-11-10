/*
 * ====================================================================
 *   Program  : Q_181
 *   Chapter  : 09 - Class as the Basis of all Computation
 *   Title    : Class Book as a Composite Data Type: References and Objects
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Book (written here as class Q_181) with data
 *   members String title and double price, and a method void show()
 *   to display them. In main(), demonstrate that a class is a
 *   composite (reference) data type:
 *
 *       (a) create an object b1 and assign its title and price
 *       (b) declare another reference b2 and assign b1 to it (b2 = b1);
 *           change the price through b2 and display b1 to show that both
 *           refer to the same object
 *       (c) create a separate object b3 with the same title and price,
 *           and use == to show that b1 and b3 are different objects
 *       (d) copy an int variable into another, change the copy and show
 *           that the original is unaffected (primitive behaviour)
 * ====================================================================
 */

public class Q_181
{
    String title;
    double price;

    void show()
    {
        System.out.println("  " + title + " : Rs " + price);
    }

    public static void main(String[] args)
    {
        Q_181 b1 = new Q_181();
        b1.title = "Computer Applications";
        b1.price = 450.0;
        System.out.println("(a) b1 :");
        b1.show();

        Q_181 b2 = b1;
        b2.price = 500.0;
        System.out.println("(b) after b2 = b1 and changing price through b2, b1 is :");
        b1.show();
        System.out.println("    b1 == b2 is " + (b1 == b2));

        Q_181 b3 = new Q_181();
        b3.title = "Computer Applications";
        b3.price = 500.0;
        System.out.println("(c) b3 has the same values, but b1 == b3 is " + (b1 == b3));

        int p = 10;
        int q = p;
        q = 99;
        System.out.println("(d) int p = 10, q = p, q = 99, but p is still " + p);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | title                | String    | to store the title of the book     |
 * | price                | double    | to store the price of the book     |
 * | b1                   | Q_181     | to refer to the first book object  |
 * | b2                   | Q_181     | to refer to the same object as b1  |
 * | b3                   | Q_181     | to refer to a separate book object |
 * | p                    | int       | to store a primitive value         |
 * | q                    | int       | to store a copy of p               |
 * +----------------------+-----------+------------------------------------+
 */
