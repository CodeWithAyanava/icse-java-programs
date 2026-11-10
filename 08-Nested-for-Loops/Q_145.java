/*
 * ====================================================================
 *   Program  : Q_145
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: Alternating # and * Triangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *       #
 *       * #
 *       # * #
 *       * # * #
 *       # * # * #
 * ====================================================================
 */

public class Q_145
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if ((i + j) % 2 == 0)
                    System.out.print("# ");
                else
                    System.out.print("* ");
            }
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
