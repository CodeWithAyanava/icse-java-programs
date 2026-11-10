/*
 * ====================================================================
 *   Program  : Q_158
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Diamond of Stars
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to display the following pattern:
 *
 *           *
 *          * *
 *         * * *
 *        * * * *
 *       * * * * *
 *        * * * *
 *         * * *
 *          * *
 *           *
 * ====================================================================
 */

public class Q_158
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            for (int s = 1; s <= 5 - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
        for (int i = 4; i >= 1; i--)
        {
            for (int s = 1; s <= 5 - i; s++)
                System.out.print(" ");
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
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
 * | j                    | int       | to print the stars          |
 * +----------------------+-----------+-----------------------------+
 */
