/*
 * ====================================================================
 *   Program  : Q_107
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Frequency of a Given Digit in a Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a number and a digit, and count how
 *   many times the digit occurs in the number. Display "Invalid
 *   digit" if the digit is not from 0 to 9.
 *
 *   Example: Number = 1223242, Digit = 2 -> Frequency = 4
 * ====================================================================
 */

import java.util.Scanner;

public class Q_107
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = Math.abs(sc.nextLong());
        System.out.print("Enter the digit to count: ");
        int dig = sc.nextInt();

        if (dig < 0 || dig > 9)
        {
            System.out.println("Invalid digit");
        }
        else
        {
            int freq = 0;
            do
            {
                if (n % 10 == dig)
                    freq++;
                n = n / 10;
            } while (n > 0);
            System.out.println("Frequency = " + freq);
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | n                    | long      | to store the number         |
 * | dig                  | int       | to store the digit to count |
 * | freq                 | int       | to store the frequency      |
 * +----------------------+-----------+-----------------------------+
 */
