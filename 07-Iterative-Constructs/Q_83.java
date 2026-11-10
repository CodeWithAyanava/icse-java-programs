/*
 * ====================================================================
 *   Program  : Q_83
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Niven (Harshad) Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and check whether it is a
 *   Niven (Harshad) number or not. A Niven number is a number that
 *   is divisible by the sum of its digits.
 *
 *   Example: 126 -> sum of digits = 1 + 2 + 6 = 9, and 126 is
 *   divisible by 9.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_83
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n, sum = 0;

        while (copy > 0)
        {
            sum = sum + copy % 10;
            copy = copy / 10;
        }

        if (n > 0 && n % sum == 0)
            System.out.println("Niven Number");
        else
            System.out.println("Not a Niven Number");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the number          |
 * | copy                 | long      | to store a working copy of n |
 * | sum                  | long      | to store the sum of digits   |
 * +----------------------+-----------+------------------------------+
 */
