/*
 * ====================================================================
 *   Program  : Q_21
 *   Chapter  : 03 - Operators in Java
 *   Title    : Larger of Two Numbers using the Ternary Operator
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept two integers and display the larger of
 *   the two using the ternary (conditional) operator. If both are
 *   equal, display "Both are equal" (use a nested ternary operator).
 * ====================================================================
 */

import java.util.Scanner;

public class Q_21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two integers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = (a == b) ? "Both are equal"
                      : (a > b) ? "Larger number = " + a
                      : "Larger number = " + b;
        System.out.println(result);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | a                    | int       | to store the first number       |
 * | b                    | int       | to store the second number      |
 * | result               | String    | to store the message to display |
 * +----------------------+-----------+---------------------------------+
 */
