/*
 * ====================================================================
 *   Program  : Q_87
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Special Two-Digit Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   [ICSE 2014] Write a program to accept a two-digit number and
 *   check whether it is a Special two-digit number or not. A Special
 *   two-digit number is one in which the sum of the sum of its
 *   digits and the product of its digits is equal to the number
 *   itself. If the number is not a two-digit number, display
 *   "Invalid input".
 *
 *   Example: 59 -> (5 + 9) + (5 x 9) = 14 + 45 = 59
 * ====================================================================
 */

import java.util.Scanner;

public class Q_87
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a two-digit number: ");
        int n = sc.nextInt();

        if (n < 10 || n > 99)
        {
            System.out.println("Invalid input");
        }
        else
        {
            int first = n / 10;
            int last = n % 10;
            int sum = first + last;
            int prod = first * last;
            if (sum + prod == n)
                System.out.println("Special 2-digit Number");
            else
                System.out.println("Not a Special 2-digit Number");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | n                    | int       | to store the number            |
 * | first                | int       | to store the tens digit        |
 * | last                 | int       | to store the units digit       |
 * | sum                  | int       | to store the sum of digits     |
 * | prod                 | int       | to store the product of digits |
 * +----------------------+-----------+--------------------------------+
 */
