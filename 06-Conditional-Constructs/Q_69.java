/*
 * ====================================================================
 *   Program  : Q_69
 *   Chapter  : 06 - Conditional Constructs in Java
 *   Title    : Buzz Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Buzz number or not. A Buzz number is a number which is either
 *   divisible by 7 or ends with the digit 7.
 *
 *   Example: 63 (divisible by 7), 107 (ends with 7) and 147 are Buzz
 *   numbers.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_69
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int last = Math.abs(n % 10);

        if (n != 0 && (n % 7 == 0 || last == 7))
            System.out.println("Buzz Number");
        else
            System.out.println("Not a Buzz Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------+
 * | Name of the Variable | Data Type | Purpose / Description   |
 * +----------------------+-----------+-------------------------+
 * | n                    | int       | to store the number     |
 * | last                 | int       | to store the last digit |
 * +----------------------+-----------+-------------------------+
 */
