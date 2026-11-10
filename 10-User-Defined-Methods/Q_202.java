/*
 * ====================================================================
 *   Program  : Q_202
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Call by Value: Swapping inside a Method
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to show that primitive arguments are passed by
 *   value in Java. Define a method void swap(int a, int b) that
 *   interchanges a and b and displays them. In main(), accept two
 *   numbers x and y, display them, call swap(x, y), and display x
 *   and y again to show that the original values are unchanged.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_202
{
    void swap(int a, int b)
    {
        int t = a;
        a = b;
        b = t;
        System.out.println("Inside swap : a = " + a + ", b = " + b);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_202 ob = new Q_202();
        System.out.print("Enter x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("Before call : x = " + x + ", y = " + y);
        ob.swap(x, y);
        System.out.println("After call  : x = " + x + ", y = " + y);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | a                    | int       | to receive a copy of x         |
 * | b                    | int       | to receive a copy of y         |
 * | t                    | int       | to hold a value while swapping |
 * | x                    | int       | to store the first number      |
 * | y                    | int       | to store the second number     |
 * | ob                   | Q_202     | to refer to the object         |
 * +----------------------+-----------+--------------------------------+
 */
