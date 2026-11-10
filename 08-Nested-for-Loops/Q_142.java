/*
 * ====================================================================
 *   Program  : Q_142
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 1, 1 3, 1 3 5, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1
 *       1 3
 *       1 3 5
 *       1 3 5 7
 *       1 3 5 7 9
 * ====================================================================
 */

public class Q_142
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print((2 * j - 1) + " ");
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
