/*
 * ====================================================================
 *   Program  : Q_134
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 1 2 3 4 5, 1 2 3 4, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1 2 3 4 5
 *       1 2 3 4
 *       1 2 3
 *       1 2
 *       1
 * ====================================================================
 */

public class Q_134
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
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
