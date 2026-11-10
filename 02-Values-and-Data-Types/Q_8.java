/*
 * ====================================================================
 *   Program  : Q_8
 *   Chapter  : 02 - Values and Data Types
 *   Title    : Implicit Type Conversion
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to demonstrate implicit (automatic) type
 *   conversion. Declare int i = 25, long l = 100000L, float f =
 *   2.5f, double d = 4.75 and char c = 'A', and display the result
 *   and the resulting data type of each of the following:
 *
 *       (a) i + d    (b) c + i    (c) i * l    (d) l + f
 *       (e) a double variable assigned the value of i
 * ====================================================================
 */

public class Q_8
{
    public static void main(String[] args)
    {
        int i = 25;
        long l = 100000L;
        float f = 2.5f;
        double d = 4.75;
        char c = 'A';

        double r1 = i + d;
        int r2 = c + i;
        long r3 = i * l;
        float r4 = l + f;
        double r5 = i;

        System.out.println("(a) i + d = " + r1 + "   (int + double gives double)");
        System.out.println("(b) c + i = " + r2 + "   (char + int gives int)");
        System.out.println("(c) i * l = " + r3 + "   (int * long gives long)");
        System.out.println("(d) l + f = " + r4 + "   (long + float gives float)");
        System.out.println("(e) double r5 = i stores " + r5 + "   (int widened to double)");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | i                    | int       | to store an integer value    |
 * | l                    | long      | to store a long value        |
 * | f                    | float     | to store a float value       |
 * | d                    | double    | to store a double value      |
 * | c                    | char      | to store a character         |
 * | r1                   | double    | to store the result of i + d |
 * | r2                   | int       | to store the result of c + i |
 * | r3                   | long      | to store the result of i * l |
 * | r4                   | float     | to store the result of l + f |
 * | r5                   | double    | to store i after widening    |
 * +----------------------+-----------+------------------------------+
 */
