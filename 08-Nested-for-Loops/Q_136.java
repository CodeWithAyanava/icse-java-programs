/*
 * ====================================================================
 *   Program  : Q_136
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 5 4 3 2 1, 4 3 2 1, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       5 4 3 2 1
 *       4 3 2 1
 *       3 2 1
 *       2 1
 *       1
 * ====================================================================
 */

public class Q_136
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
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
