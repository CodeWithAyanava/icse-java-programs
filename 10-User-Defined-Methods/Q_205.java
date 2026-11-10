/*
 * ====================================================================
 *   Program  : Q_205
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Class Number with Data Member and Member Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Number (written here as class Q_205) with the
 *   following description:
 *
 *       Data member : long n
 *       void input()        : to accept the number
 *       int sumDigits()     : to return the sum of the digits of n
 *       long reverse()      : to return the reverse of n
 *       boolean isPalindrome() : to return true if n is a palindrome
 *                                (using reverse())
 *       void display()      : to display n, the sum of its digits, its
 *                             reverse and whether it is a palindrome
 *
 *   Write a main method to create an object and invoke the methods.
 *   Treat a negative number by its absolute value.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_205
{
    long n;

    void input()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n = Math.abs(sc.nextLong());
    }

    int sumDigits()
    {
        int s = 0;
        long t = n;
        while (t > 0)
        {
            s = s + (int) (t % 10);
            t = t / 10;
        }
        return s;
    }

    long reverse()
    {
        long rev = 0, t = n;
        while (t > 0)
        {
            rev = rev * 10 + t % 10;
            t = t / 10;
        }
        return rev;
    }

    boolean isPalindrome()
    {
        return reverse() == n;
    }

    void display()
    {
        System.out.println("Number        : " + n);
        System.out.println("Sum of digits : " + sumDigits());
        System.out.println("Reverse       : " + reverse());
        if (isPalindrome())
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a Palindrome Number");
    }

    public static void main(String[] args)
    {
        Q_205 ob = new Q_205();
        ob.input();
        ob.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | long      | to store the number          |
 * | s                    | int       | to store the sum of digits   |
 * | t                    | long      | to store a working copy of n |
 * | rev                  | long      | to store the reverse         |
 * | ob                   | Q_205     | to refer to the object       |
 * +----------------------+-----------+------------------------------+
 */
