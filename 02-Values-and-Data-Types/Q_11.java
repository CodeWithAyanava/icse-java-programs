/*
 * ====================================================================
 *   Program  : Q_11
 *   Chapter  : 02 - Values and Data Types
 *   Title    : Swap Two Numbers without a Third Variable
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two integers and swap their values
 *   without using a third variable. Display the values before and
 *   after swapping.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping : a = " + a + ", b = " + b);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description      |
 * +----------------------+-----------+----------------------------+
 * | a                    | int       | to store the first number  |
 * | b                    | int       | to store the second number |
 * +----------------------+-----------+----------------------------+
 */
