/*
 * ====================================================================
 *   Program  : Q_10
 *   Chapter  : 02 - Values and Data Types
 *   Title    : Swap Two Numbers using a Third Variable
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two integers and swap (interchange)
 *   their values using a third variable. Display the values before
 *   and after swapping.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_10
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();

        System.out.println("Before swapping: a = " + a + ", b = " + b);
        int t = a;
        a = b;
        b = t;
        System.out.println("After swapping : a = " + a + ", b = " + b);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | a                    | int       | to store the first number   |
 * | b                    | int       | to store the second number  |
 * | t                    | int       | to hold a value temporarily |
 * +----------------------+-----------+-----------------------------+
 */
