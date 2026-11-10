/*
 * ====================================================================
 *   Program  : Q_130
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Reverse-and-Add until a Palindrome
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [Extra] Many numbers become palindromes when they are repeatedly
 *   added to their reverse. For example, 87 -> 87 + 78 = 165 -> 165
 *   + 561 = 726 -> 726 + 627 = 1353 -> 1353 + 3531 = 4884 (a
 *   palindrome after 4 steps). Write a program to accept a positive
 *   number and apply this process at least once, displaying each
 *   sum, until a palindrome is obtained. Stop with the message "No
 *   palindrome found within the limit" if 30 steps are over or the
 *   sum exceeds 10^16 (196 is a famous number that never seems to
 *   give a palindrome).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_130
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number: ");
        long n = sc.nextLong();

        if (n <= 0)
        {
            System.out.println("Invalid input");
        }
        else
        {
            final long LIMIT = 10000000000000000L;
            int steps = 0;
            boolean pal = false;
            do
            {
                long copy = n, rev = 0;
                while (copy > 0)
                {
                    rev = rev * 10 + copy % 10;
                    copy = copy / 10;
                }
                n = n + rev;
                steps++;
                System.out.println("Step " + steps + ": " + n);

                copy = n;
                rev = 0;
                while (copy > 0)
                {
                    rev = rev * 10 + copy % 10;
                    copy = copy / 10;
                }
                pal = (rev == n);
            } while (!pal && steps < 30 && n <= LIMIT);

            if (pal)
                System.out.println("Palindrome " + n + " obtained in " + steps + " steps");
            else
                System.out.println("No palindrome found within the limit");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description               |
 * +----------------------+-----------+-------------------------------------+
 * | n                    | long      | to store the current number         |
 * | LIMIT                | long      | to store the largest allowed sum    |
 * | steps                | int       | to count the steps                  |
 * | pal                  | boolean   | to record whether n is a palindrome |
 * | copy                 | long      | to store a working copy of n        |
 * | rev                  | long      | to store the reverse of n           |
 * +----------------------+-----------+-------------------------------------+
 */
