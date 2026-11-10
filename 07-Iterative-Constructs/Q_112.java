/*
 * ====================================================================
 *   Program  : Q_112
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Sum of Numbers until 0 is Entered
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program using a do-while loop to keep accepting numbers
 *   from the user until 0 is entered. Display the sum, the count and
 *   the average of the numbers entered (excluding the 0). If the
 *   first number itself is 0, display "No numbers entered".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_112
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        int count = 0;
        double n;

        System.out.println("Enter numbers (0 to stop):");
        do
        {
            n = sc.nextDouble();
            if (n != 0)
            {
                sum = sum + n;
                count++;
            }
        } while (n != 0);

        if (count == 0)
        {
            System.out.println("No numbers entered");
        }
        else
        {
            System.out.println("Sum     = " + sum);
            System.out.println("Count   = " + count);
            System.out.println("Average = " + (sum / count));
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | sum                  | double    | to store the sum of the numbers |
 * | count                | int       | to count the numbers entered    |
 * | n                    | double    | to store each number entered    |
 * +----------------------+-----------+---------------------------------+
 */
