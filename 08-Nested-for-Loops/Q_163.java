/*
 * ====================================================================
 *   Program  : Q_163
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Multiplication Tables from 1 to 10 in a Grid
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to display the multiplication tables of 1 to 10
 *   in the form of a 10 x 10 grid, where the entry in row i and
 *   column j is i x j. Separate the columns with tab spaces.
 * ====================================================================
 */

public class Q_163
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 10; i++)
        {
            for (int j = 1; j <= 10; j++)
                System.out.print(i * j + "\t");
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
