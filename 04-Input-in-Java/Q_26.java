/*
 * ====================================================================
 *   Program  : Q_26
 *   Chapter  : 04 - Input in Java
 *   Title    : Final Velocity: Input through Parameters
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to calculate the final velocity of a body using
 *   the formula v = u + at, taking the input through parameters.
 *   Define a method void velocity(double u, double a, double t) that
 *   calculates and displays v. Call the method from main() for the
 *   following two sets of values:
 *
 *       u = 10 m/s, a = 2.5 m/s^2, t = 4 s
 *       u = 0 m/s,  a = 9.8 m/s^2, t = 5 s
 * ====================================================================
 */

public class Q_26
{
    static void velocity(double u, double a, double t)
    {
        double v = u + a * t;
        System.out.println("u = " + u + ", a = " + a + ", t = " + t + ", v = " + v + " m/s");
    }

    public static void main(String[] args)
    {
        velocity(10, 2.5, 4);
        velocity(0, 9.8, 5);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | u                    | double    | to receive the initial velocity |
 * | a                    | double    | to receive the acceleration     |
 * | t                    | double    | to receive the time             |
 * | v                    | double    | to store the final velocity     |
 * +----------------------+-----------+---------------------------------+
 */
