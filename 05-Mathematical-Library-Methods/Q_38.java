/*
 * ====================================================================
 *   Program  : Q_38
 *   Chapter  : 05 - Mathematical Library Methods
 *   Title    : Largest and Smallest of Three Numbers using Math.max() and Math.min()
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept three integers and find the largest
 *   and the smallest of them using only the methods Math.max() and
 *   Math.min() (no if statement).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_38
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter three integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int large = Math.max(Math.max(a, b), c);
        int small = Math.min(Math.min(a, b), c);
        System.out.println("Largest  = " + large);
        System.out.println("Smallest = " + small);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | a                    | int       | to store the first number    |
 * | b                    | int       | to store the second number   |
 * | c                    | int       | to store the third number    |
 * | large                | int       | to store the largest number  |
 * | small                | int       | to store the smallest number |
 * +----------------------+-----------+------------------------------+
 */
