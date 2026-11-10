/*
 * ====================================================================
 *   Program  : Q_149
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: E, D E, C D E, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       E
 *       D E
 *       C D E
 *       B C D E
 *       A B C D E
 * ====================================================================
 */

public class Q_149
{
    public static void main(String[] args)
    {
        for (char start = 'E'; start >= 'A'; start--)
        {
            for (char ch = start; ch <= 'E'; ch++)
                System.out.print(ch + " ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | start                | char      | to store the first letter of the row |
 * | ch                   | char      | to store the letter to print         |
 * +----------------------+-----------+--------------------------------------+
 */
