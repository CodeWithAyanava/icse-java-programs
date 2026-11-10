/*
 * ====================================================================
 *   Program  : Q_152
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Rectangular Pattern: 1 2 3 4 5 in Every Row
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1 2 3 4 5
 *       1 2 3 4 5
 *       1 2 3 4 5
 *       1 2 3 4 5
 * ====================================================================
 */

public class Q_152
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            for (int j = 1; j <= 5; j++)
                System.out.print(j + " ");
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
