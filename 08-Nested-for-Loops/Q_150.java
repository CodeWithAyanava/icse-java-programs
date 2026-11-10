/*
 * ====================================================================
 *   Program  : Q_150
 *   Chapter  : 08 - Nested for Loops
 *   Title    : Floyd's Triangle of Letters
 * --------------------------------------------------------------------
 *   Question :
 *
 *       A
 *       B C
 *       D E F
 *       G H I J
 *       K L M N O
 * ====================================================================
 */

public class Q_150
{
    public static void main(String[] args)
    {
        char ch = 'A';
        for (int i = 1; i <= 5; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(ch + " ");
                ch++;
            }
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
 * | ch                   | char      | to store the letter to print |
 * | i                    | int       | to control the rows          |
 * | j                    | int       | to control the columns       |
 * +----------------------+-----------+------------------------------+
 */
