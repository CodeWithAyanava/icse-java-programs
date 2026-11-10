/*
 * ====================================================================
 *   Program  : Q_138
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 5 5 5 5 5, 4 4 4 4, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       5 5 5 5 5
 *       4 4 4 4
 *       3 3 3
 *       2 2
 *       1
 * ====================================================================
 */

public class Q_138
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
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
