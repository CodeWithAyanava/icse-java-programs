/*
 * ====================================================================
 *   Program  : Q_146
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: A, A B, A B C, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       A
 *       A B
 *       A B C
 *       A B C D
 *       A B C D E
 * ====================================================================
 */

public class Q_146
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print((char) ('A' + j - 1) + " ");
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
