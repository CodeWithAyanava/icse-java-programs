/*
 * ====================================================================
 *   Program  : Q_148
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Pattern: A B C D E, A B C D, ...
 * --------------------------------------------------------------------
 *   Question :
 *
 *       A B C D E
 *       A B C D
 *       A B C
 *       A B
 *       A
 * ====================================================================
 */

public class Q_148
{
    public static void main(String[] args)
    {
        for (int i = 5; i >= 1; i--)
        {
            for (char ch = 'A'; ch < 'A' + i; ch++)
                System.out.print(ch + " ");
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
 * | ch                   | char      | to store the letter to print |
 * +----------------------+-----------+------------------------------+
 */
