/*
 * ====================================================================
 *   Program  : Q_261
 *   Chapter  : 14 - Arrays
 *   Title    : Largest, Smallest, Sum and Average of Array Elements
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n numbers in an array and find the
 *   largest element, the smallest element, the sum and the average
 *   of all the elements.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_261
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

        double max = a[0], min = a[0], sum = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] > max)
                max = a[i];
            if (a[i] < min)
                min = a[i];
            sum = sum + a[i];
        }
        System.out.println("Largest  = " + max);
        System.out.println("Smallest = " + min);
        System.out.println("Sum      = " + sum);
        System.out.println("Average  = " + (sum / n));
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
 * | max                  | double    | to store the largest element   |
 * | min                  | double    | to store the smallest element  |
 * | sum                  | double    | to store the sum               |
 * +----------------------+-----------+--------------------------------+
 */
