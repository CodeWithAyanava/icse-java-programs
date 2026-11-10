/*
 * ====================================================================
 *   Program  : Q_147
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: A, B B, C C C, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       A
 *       B B
 *       C C C
 *       D D D D
 *       E E E E E
 * ====================================================================
 */

public class Q_147
{
    public static void main(String[] args)
    {
        for (int i = 1; i <= 5; i++)
        {
            char ch = (char) ('A' + i - 1);
            for (int j = 1; j <= i; j++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | i                    | int       | to control the rows            |
 * | ch                   | char      | to store the letter of the row |
 * | j                    | int       | to control the columns         |
 * +----------------------+-----------+--------------------------------+
 */
