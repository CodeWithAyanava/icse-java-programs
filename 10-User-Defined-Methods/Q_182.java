/*
 * ====================================================================
 *   Program  : Q_182
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading volume(): Sphere, Cylinder and Cuboid
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_182) to overload a
 *   method volume() as follows:
 *
 *       (i)   double volume(double r)
 *             returns the volume of a sphere = (4/3) x pi x r^3
 *       (ii)  double volume(double h, double r)
 *             returns the volume of a cylinder = pi x r^2 x h
 *       (iii) double volume(double l, double b, double h)
 *             returns the volume of a cuboid = l x b x h
 *
 *   Take pi = 3.14. Write a main method to create an object of the
 *   class and call the above methods with suitable arguments.
 * ====================================================================
 */

public class Q_182
{
    double volume(double r)
    {
        return 4.0 / 3 * 3.14 * r * r * r;
    }

    double volume(double h, double r)
    {
        return 3.14 * r * r * h;
    }

    double volume(double l, double b, double h)
    {
        return l * b * h;
    }

    public static void main(String[] args)
    {
        Q_182 ob = new Q_182();
        System.out.println("Volume of sphere (r = 3)          = " + ob.volume(3));
        System.out.println("Volume of cylinder (h = 10, r = 2) = " + ob.volume(10, 2));
        System.out.println("Volume of cuboid (5 x 4 x 2.5)     = " + ob.volume(5, 4, 2.5));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------+
 * | Name of the Variable | Data Type | Purpose / Description  |
 * +----------------------+-----------+------------------------+
 * | r                    | double    | to receive the radius  |
 * | h                    | double    | to receive the height  |
 * | l                    | double    | to receive the length  |
 * | b                    | double    | to receive the breadth |
 * | ob                   | Q_182     | to refer to the object |
 * +----------------------+-----------+------------------------+
 */
