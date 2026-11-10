/*
 * ====================================================================
 *   Program  : Q_140
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: 1, 0 1, 1 0 1, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1
 *       0 1
 *       1 0 1
 *       0 1 0 1
 *       1 0 1 0 1
 * ====================================================================
 */

public class Q_140
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if ((i + j) % 2 == 0)
                    System.out.print("1 ");
                else
                    System.out.print("0 ");
            }
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
