/*
 * ====================================================================
 *   Program  : Q_135
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 5, 5 4, 5 4 3, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       5
 *       5 4
 *       5 4 3
 *       5 4 3 2
 *       5 4 3 2 1
 * ====================================================================
 */

public class Q_135
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
        {
            for (int j = 5; j >= i; j--)
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
