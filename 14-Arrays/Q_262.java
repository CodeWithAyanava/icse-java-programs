/*
 * ====================================================================
 *   Program  : Q_262
 *   Chapter  : 14 - Arrays
 *   Title    : Sum and Count of Even and Odd Elements
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept n integers in an array and find the
 *   sum and the count of the even elements and of the odd elements
 *   separately.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_262
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        long sumE = 0, sumO = 0;
        int cE = 0, cO = 0;
        for (int i = 0; i < n; i++)
        {
            if (a[i] % 2 == 0)
            {
                sumE = sumE + a[i];
                cE++;
            }
            else
            {
                sumO = sumO + a[i];
                cO++;
            }
        }
        System.out.println("Even elements: count = " + cE + ", sum = " + sumE);
        System.out.println("Odd elements : count = " + cO + ", sum = " + sumO);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | n                    | int       | to store the size of the array    |
 * | a                    | int[]     | to store the elements             |
 * | i                    | int       | to act as the index               |
 * | sumE                 | long      | to store the sum of even elements |
 * | sumO                 | long      | to store the sum of odd elements  |
 * | cE                   | int       | to count the even elements        |
 * | cO                   | int       | to count the odd elements         |
 * +----------------------+-----------+-----------------------------------+
 */
