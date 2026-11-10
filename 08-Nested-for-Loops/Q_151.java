/*
 * ====================================================================
 *   Program  : Q_151
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: Rows of Numbers and Letters Alternately
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1
 *       A B
 *       1 2 3
 *       A B C D
 *       1 2 3 4 5
 * ====================================================================
 */

public class Q_151
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i % 2 == 1)
                    System.out.print(j + " ");
                else
                    System.out.print((char) ('A' + j - 1) + " ");
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
