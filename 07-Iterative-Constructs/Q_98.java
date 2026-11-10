/*
 * ====================================================================
 *   Program  : Q_98
 *   Chapter  : 07 - Iterative Constructs in Java
 *   Title    : Evil Number
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to accept a positive number and check whether it
 *   is an Evil number or not. An Evil number is a positive number
 *   whose binary equivalent contains an even number of 1s.
 *
 *   Example: 9 -> binary 1001 has two 1s, so 9 is an Evil number.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_98
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long n = sc.nextLong();
        long copy = n;
        int ones = 0;

        while (copy > 0)
        {
            if (copy % 2 == 1)
                ones++;
            copy = copy / 2;
        }

        if (n > 0 && ones % 2 == 0)
            System.out.println("Evil Number");
        else
            System.out.println("Not an Evil Number");
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
 * | ones                 | int       | to count the 1s in binary    |
 * +----------------------+-----------+------------------------------+
 */
