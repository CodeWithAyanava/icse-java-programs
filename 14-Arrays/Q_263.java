/*
 * ====================================================================
 *   Program  : Q_263
 *   Chapter  : 14 - Arrays
 *   Title    : Count of Positive, Negative and Zero Elements
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n numbers in an array and count how
 *   many of them are positive, negative and zero. If the size
 *   entered is less than 1, display "Invalid size".
 * ====================================================================
 */

import java.util.Scanner;

public class Q_263
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        if (n < 1)
        {
            System.out.println("Invalid size");
            return;
        }
        double a[] = new double[n];
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextDouble();

        int pos = 0, neg = 0, zero = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] > 0)
                pos++;
            else if (a[i] < 0)
                neg++;
            else
                zero++;
        }
        System.out.println("Positive = " + pos);
        System.out.println("Negative = " + neg);
        System.out.println("Zero     = " + zero);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | n                    | int       | to store the size of the array |
 * | a                    | double[]  | to store the numbers           |
 * | i                    | int       | to act as the index            |
 * | pos                  | int       | to count positive elements     |
 * | neg                  | int       | to count negative elements     |
 * | zero                 | int       | to count zero elements         |
 * +----------------------+-----------+--------------------------------+
 */
