/*
 * ====================================================================
 *   Program  : Q_141
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 1, 2 4, 3 6 9, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1
 *       2 4
 *       3 6 9
 *       4 8 12 16
 *       5 10 15 20 25
 * ====================================================================
 */

public class Q_141
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print(i * j + " ");
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
