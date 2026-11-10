/*
 * ====================================================================
 *   Program  : Q_133
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 1, 2 2, 3 3 3, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1
 *       2 2
 *       3 3 3
 *       4 4 4 4
 *       5 5 5 5 5
 * ====================================================================
 */

public class Q_133
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
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
