/*
 * ====================================================================
 *   Program  : Q_27
 *   Chapter  : 04 - Input in Java
 *   Title    : Distance Travelled: Input by Initialisation
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to calculate the distance travelled by a body
 *   using the formula s = ut + (1/2)at^2, where the values u = 20
 *   m/s, a = 4 m/s^2 and t = 5 s are given to the variables by
 *   initialisation (assignment) inside the program.
 * ====================================================================
 */

public class Q_27
{
    public static void main(String[] args)
    {
        double u = 20;
        double a = 4;
        double t = 5;
        double s = u * t + 0.5 * a * t * t;
        System.out.println("Distance travelled = " + s + " m");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | u                    | double    | to store the initial velocity   |
 * | a                    | double    | to store the acceleration       |
 * | t                    | double    | to store the time               |
 * | s                    | double    | to store the distance travelled |
 * +----------------------+-----------+---------------------------------+
 */
