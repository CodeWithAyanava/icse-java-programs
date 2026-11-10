/*
 * ====================================================================
 *   Program  : Q_160
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pascal's Triangle
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to display the following pattern:
 *
 *       1
 *       1 1
 *       1 2 1
 *       1 3 3 1
 *       1 4 6 4 1
 *       1 5 10 10 5 1
 * ====================================================================
 */

public class Q_160
{
    public static void main(String[] args)
    {
        for (int i = 0; i <= 5; i++)
        {
            int c = 1;
            for (int j = 0; j <= i; j++)
            {
                System.out.print(c + " ");
                c = c * (i - j) / (j + 1);
            }
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | i                    | int       | to control the rows              |
 * | c                    | int       | to store the current coefficient |
 * | j                    | int       | to control the columns           |
 * +----------------------+-----------+----------------------------------+
 */
