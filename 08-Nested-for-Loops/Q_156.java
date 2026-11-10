/*
 * ====================================================================
 *   Program  : Q_156
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Rectangle with Alternate Rows of * and #
 * --------------------------------------------------------------------
 *   Question :
 *
 *       * * * * *
 *       # # # # #
 *       * * * * *
 *       # # # # #
 * ====================================================================
 */

public class Q_156
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 5; j++)
            {
                if (i % 2 == 1)
                    System.out.print("* ");
                else
                    System.out.print("# ");
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
