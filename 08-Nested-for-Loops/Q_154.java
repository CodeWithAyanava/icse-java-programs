/*
 * ====================================================================
 *   Program  : Q_154
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Rectangular Pattern: 1 2 3 4 5, 2 3 4 5 6, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1 2 3 4 5
 *       2 3 4 5 6
 *       3 4 5 6 7
 *       4 5 6 7 8
 *       5 6 7 8 9
 * ====================================================================
 */

public class Q_154
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int j = i; j <= i + 4; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | i                    | int       | to control the rows          |
 * | j                    | int       | to store the number to print |
 * +----------------------+-----------+------------------------------+
 */
