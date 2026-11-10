/*
 * ====================================================================
 *   Program  : Q_159
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Number Pyramid: 1, 1 2 1, 1 2 3 2 1, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to display the following pattern:
 *
 *               1
 *             1 2 1
 *           1 2 3 2 1
 *         1 2 3 4 3 2 1
 *       1 2 3 4 5 4 3 2 1
 * ====================================================================
 */

public class Q_159
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int s = 1; s <= 2 * (5 - i); s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            for (int j = i - 1; j >= 1; j--)
                System.out.print(j + " ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | i                    | int       | to control the rows         |
 * | s                    | int       | to print the leading spaces |
 * | j                    | int       | to print the numbers        |
 * +----------------------+-----------+-----------------------------+
 */
