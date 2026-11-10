/*
 * ====================================================================
 *   Program  : Q_322
 *   Chapter  : 15 - String Handling
 *   Title    : Word Pattern: B, BL, BLU, BLUE, BLUEJ
 * --------------------------------------------------------------------
 *   Question :
 *
 *       B
 *       BL
 *       BLU
 *       BLUE
 *       BLUEJ
 * ====================================================================
 */

public class Q_322
{
    public static void main(String[] args)
    {
        String w = "BLUEJ";
        for (int i = 1; i <= w.length(); i++)
            System.out.println(w.substring(0, i));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description            |
 * +----------------------+-----------+----------------------------------+
 * | w                    | String    | to store the word                |
 * | i                    | int       | to store the length of each part |
 * +----------------------+-----------+----------------------------------+
 */
