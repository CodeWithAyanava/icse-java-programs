/*
 * ====================================================================
 *   Program  : Q_153
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Rectangular Pattern: Row Number Repeated
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1 1 1 1 1
 *       2 2 2 2 2
 *       3 3 3 3 3
 *       4 4 4 4 4
 * ====================================================================
 */

public class Q_153
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 5; j++)
                System.out.print(i + " ");
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
