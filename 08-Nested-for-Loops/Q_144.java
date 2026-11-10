/*
 * ====================================================================
 *   Program  : Q_144
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: Inverted Triangle of Stars
 * --------------------------------------------------------------------
 *   Question :
 *
 *       * * * * *
 *       * * * *
 *       * * *
 *       * *
 *       *
 * ====================================================================
 */

public class Q_144
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------+
 * | Name of the Variable | Data Type | Purpose / Description  |
 * +----------------------+-----------+------------------------+
 * | i                    | int       | to control the rows    |
 * | j                    | int       | to control the columns |
 * +----------------------+-----------+------------------------+
 */
