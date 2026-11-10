/*
 * ====================================================================
 *   Program  : Q_323
 *   Chapter  : 15 - String Handling
 *   Title    : Word Pattern: JAVA, AVA, VA, A
 * --------------------------------------------------------------------
 *   Question :
 *
 *       J A V A
 *         A V A
 *           V A
 *             A
 * ====================================================================
 */

public class Q_323
{
    public static void main(String[] args)
    {
        String w = "JAVA";
        int n = w.length();
        for (int i = 0; i < n; i++)
        {
            for (int s = 1; s <= i; s++)
                System.out.print("  ");
            for (int j = i; j < n; j++)
                System.out.print(w.charAt(j) + " ");
            System.out.println();
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | w                    | String    | to store the word               |
 * | n                    | int       | to store the length of the word |
 * | i                    | int       | to control the rows             |
 * | s                    | int       | to print the leading spaces     |
 * | j                    | int       | to print the letters            |
 * +----------------------+-----------+---------------------------------+
 */
