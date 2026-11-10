/*
 * ====================================================================
 *   Program  : Q_174
 *   Chapter  : 08 - Nested for Loops
 *   Title    : break and continue in Nested Loops
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to show how break and continue work in nested
 *   loops. For i = 1 to 4 and j = 1 to 4, display the pairs (i, j),
 *   but
 *
 *       - skip the pair when i is equal to j (use continue), and
 *       - stop the inner loop as soon as i + j becomes greater than 5
 *         (use break).
 *
 *   Display the pairs of each value of i on a separate line.
 * ====================================================================
 */

public class Q_174
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 4; i++)
        {
            System.out.print("i = " + i + " : ");
            for (int j = 1; j <= 4; j++)
            {
                if (i + j > 5)
                    break;
                if (i == j)
                    continue;
                System.out.print("(" + i + ", " + j + ") ");
            }
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------+
 * | Name of the Variable | Data Type | Purpose / Description     |
 * +----------------------+-----------+---------------------------+
 * | i                    | int       | to control the outer loop |
 * | j                    | int       | to control the inner loop |
 * +----------------------+-----------+---------------------------+
 */
