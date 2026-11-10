/*
 * ====================================================================
 *   Program  : Q_286
 *   Chapter  : 14 - Arrays
 *   Title    : Dice Roll Frequency Simulation
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Write a program to simulate rolling a die n times (n
 *   entered by the user, at least 1) using Math.random(). Store how
 *   many times each face 1 to 6 appears in an array, and display for
 *   each face its count, its percentage and a bar of # symbols (one
 *   # for every 2%). With a large n, every face should appear close
 *   to 16.67% of the time.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_286
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many rolls? ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid input");
            return;
        }
        int count[] = new int[7];
        for (int i = 1; i <= n; i++)
        {
            int face = (int) (Math.random() * 6) + 1;
            count[face]++;
        }

        for (int f = 1; f <= 6; f++)
        {
            double per = count[f] * 100.0 / n;
            System.out.print(f + " : " + count[f] + " (" + Math.round(per * 10) / 10.0 + "%) ");
            for (int k = 1; k <= (int) (per / 2); k++)
                System.out.print("#");
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
 * | n                    | int       | to store the number of rolls |
 * | count                | int[]     | to count each face           |
 * | i                    | int       | to act as the loop counter   |
 * | face                 | int       | to store the face rolled     |
 * | f                    | int       | to act as the face index     |
 * | per                  | double    | to store the percentage      |
 * | k                    | int       | to print the bar             |
 * +----------------------+-----------+------------------------------+
 */
