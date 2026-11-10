/*
 * ====================================================================
 *   Program  : Q_189
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Overloading count(): Digits and Occurrences of a Digit
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Design a class (written here as class Q_189) to overload a
 *   method count() as follows:
 *
 *       (i)  int count(long n)        : returns the number of digits in n
 *       (ii) int count(long n, int d) : returns the number of times the
 *                                       digit d occurs in n
 *
 *   Work with the absolute value of n; the number 0 has one digit.
 *   Write a main method to accept a number and a digit and display
 *   both results.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_189
{
    int count(long n)
    {
        n = Math.abs(n);
        int c = 0;
        do
        {
            c++;
            n = n / 10;
        } while (n > 0);
        return c;
    }

    int count(long n, int d)
    {
        n = Math.abs(n);
        int c = 0;
        do
        {
            if (n % 10 == d)
                c++;
            n = n / 10;
        } while (n > 0);
        return c;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_189 ob = new Q_189();
        System.out.print("Enter a number: ");
        long num = sc.nextLong();
        System.out.print("Enter a digit: ");
        int dig = sc.nextInt();
        System.out.println("Number of digits = " + ob.count(num));
        System.out.println("Occurrences of " + dig + " = " + ob.count(num, dig));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description         |
 * +----------------------+-----------+-------------------------------+
 * | n                    | long      | to receive the number         |
 * | d                    | int       | to receive the digit to count |
 * | c                    | int       | to store the count            |
 * | num                  | long      | to store the number entered   |
 * | dig                  | int       | to store the digit entered    |
 * | ob                   | Q_189     | to refer to the object        |
 * +----------------------+-----------+-------------------------------+
 */
