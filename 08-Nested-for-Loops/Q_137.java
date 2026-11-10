/*
 * ====================================================================
 *   Program  : Q_137
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 1, 2 1, 3 2 1, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1
 *       2 1
 *       3 2 1
 *       4 3 2 1
 *       5 4 3 2 1
 * ====================================================================
 */

public class Q_137
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j >= 1; j--)
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
