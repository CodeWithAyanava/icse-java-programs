/*
 * ====================================================================
 *   Program  : Q_139
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Floyd's Triangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *       1
 *       2 3
 *       4 5 6
 *       7 8 9 10
 *       11 12 13 14 15
 * ====================================================================
 */

public class Q_139
{
    public static void main(String[] args)
    {
        int k = 1;
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(k + " ");
                k++;
            }
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
 * | k                    | int       | to store the number to print |
 * | i                    | int       | to control the rows          |
 * | j                    | int       | to control the columns       |
 * +----------------------+-----------+------------------------------+
 */
