/*
 * ====================================================================
 *   Program  : Q_190
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading perimeter(): Square, Rectangle and Triangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_190) to overload a
 *   method perimeter() as follows:
 *
 *       (i)   double perimeter(double s)               : square, 4 x s
 *       (ii)  double perimeter(double l, double b)     : rectangle,
 *                                                        2 x (l + b)
 *       (iii) double perimeter(double a, double b, double c) : triangle,
 *                                                        a + b + c
 *
 *   Write a main method to create an object and display the
 *   perimeters of a square of side 6.5, a rectangle 8 x 3 and a
 *   triangle with sides 3, 4 and 5.
 * ====================================================================
 */

public class Q_190
{
    double perimeter(double s)
    {
        return 4 * s;
    }

    double perimeter(double l, double b)
    {
        return 2 * (l + b);
    }

    double perimeter(double a, double b, double c)
    {
        return a + b + c;
    }

    public static void main(String[] args)
    {
        Q_190 ob = new Q_190();
        System.out.println("Perimeter of square    = " + ob.perimeter(6.5));
        System.out.println("Perimeter of rectangle = " + ob.perimeter(8, 3));
        System.out.println("Perimeter of triangle  = " + ob.perimeter(3, 4, 5));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | s                    | double    | to receive the side of the square |
 * | l                    | double    | to receive the length             |
 * | b                    | double    | to receive the breadth or a side  |
 * | a                    | double    | to receive the first side         |
 * | c                    | double    | to receive the third side         |
 * | ob                   | Q_190     | to refer to the object            |
 * +----------------------+-----------+-----------------------------------+
 */
