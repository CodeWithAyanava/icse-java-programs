/*
 * ====================================================================
 *   Program  : Q_113
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Numbers from 1 to 50 not Divisible by 3 or 5 (continue)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to display all the numbers from 1 to 50 that are
 *   divisible neither by 3 nor by 5, using the continue statement to
 *   skip the other numbers. Also display how many such numbers there
 *   are.
 * ====================================================================
 */

public class Q_113
{
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 1; i <= 50; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
                continue;
            System.out.print(i + " ");
            count++;
        }
        System.out.println();
        System.out.println("Count = " + count);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | count                | int       | to count the numbers displayed |
 * | i                    | int       | to act as the loop counter     |
 * +----------------------+-----------+--------------------------------+
 */
