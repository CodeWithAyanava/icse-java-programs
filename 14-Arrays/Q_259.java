/*
 * ====================================================================
 *   Program  : Q_259
 *   Chapter  : 14 - Arrays
 *   Title    : Bubble Sort in Descending Order
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept the marks of n students in an array
 *   and arrange them in descending order using the bubble sort
 *   technique. Display the sorted marks.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_259
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        double m[] = new double[n];
        System.out.println("Enter the marks:");
        for (int i = 0; i < n; i++)
            m[i] = sc.nextDouble();

        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - 1 - i; j++)
            {
                if (m[j] < m[j + 1])
                {
                    double t = m[j];
                    m[j] = m[j + 1];
                    m[j + 1] = t;
                }
            }
        }

        System.out.print("Marks in descending order: ");
        for (int i = 0; i < n; i++)
            System.out.print(m[i] + " ");
        System.out.println();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description              |
 * +----------------------+-----------+------------------------------------+
 * | n                    | int       | to store the number of students    |
 * | m                    | double[]  | to store the marks                 |
 * | i                    | int       | to count the passes / act as index |
 * | j                    | int       | to act as the comparison index     |
 * | t                    | double    | to hold a value while swapping     |
 * +----------------------+-----------+------------------------------------+
 */
