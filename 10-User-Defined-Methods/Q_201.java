/*
 * ====================================================================
 *   Program  : Q_201
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Static and Non-Static Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a class (written here as class Q_201) with:
 *
 *       a data member double radius,
 *       a static method double circleArea(double r) that returns the area
 *           of a circle of radius r,
 *       a non-static method void show() that displays the radius of the
 *           object and its area (by calling circleArea()).
 *
 *   In main(), call the static method directly without creating an
 *   object (circleArea(7)), then create an object with radius 3.5
 *   and call show() through the object.
 * ====================================================================
 */

public class Q_201
{
    double radius;

    static double circleArea(double r)
    {
        return Math.PI * r * r;
    }

    void show()
    {
        System.out.println("Radius = " + radius + ", Area = " + circleArea(radius));
    }

    public static void main(String[] args)
    {
        System.out.println("Static call: circleArea(7) = " + circleArea(7));

        Q_201 c = new Q_201();
        c.radius = 3.5;
        System.out.print("Non-static call: ");
        c.show();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | radius               | double    | to store the radius of the object |
 * | r                    | double    | to receive the radius             |
 * | c                    | Q_201     | to refer to the object            |
 * +----------------------+-----------+-----------------------------------+
 */
