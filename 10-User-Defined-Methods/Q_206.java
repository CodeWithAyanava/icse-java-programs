/*
 * ====================================================================
 *   Program  : Q_206
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Class Series with Non-Static Methods
 *   Class    : Series   (compile: javac Q_206.java   run: java Series)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Series with the following description:
 *
 *       Data member : int n (number of terms)
 *       void accept()     : to accept n
 *       void fibonacci()  : to display the first n Fibonacci terms
 *                           0, 1, 1, 2, 3, 5, ...
 *       void oddSquares() : to display the squares of the first n odd
 *                           numbers 1, 9, 25, 49, ...
 *       long sumCubes()   : to return 1^3 + 2^3 + ... + n^3
 *
 *   Write a main method to create an object and call all the
 *   methods. Display "Invalid input" if n is less than 1 or more
 *   than 90.
 * ====================================================================
 */

import java.util.Scanner;

class Series
{
    int n;

    void accept()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        n = sc.nextInt();
    }

    void fibonacci()
    {
        long a = 0, b = 1;
        for (int i = 1; i <= n; i++)
        {
            System.out.print(a + " ");
            long c = a + b;
            a = b;
            b = c;
        }
        System.out.println();
    }

    void oddSquares()
    {
        for (long i = 1; i <= n; i++)
        {
            long odd = 2 * i - 1;
            System.out.print(odd * odd + " ");
        }
        System.out.println();
    }

    long sumCubes()
    {
        long s = 0;
        for (long i = 1; i <= n; i++)
            s = s + i * i * i;
        return s;
    }

    public static void main(String[] args)
    {
        Series ob = new Series();
        ob.accept();
        if (ob.n < 1 || ob.n > 90)
        {
            System.out.println("Invalid input");
        }
        else
        {
            System.out.print("Fibonacci   : ");
            ob.fibonacci();
            System.out.print("Odd squares : ");
            ob.oddSquares();
            System.out.println("Sum of cubes: " + ob.sumCubes());
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                  |
 * +----------------------+-----------+----------------------------------------+
 * | n                    | int       | to store the number of terms           |
 * | a                    | long      | to store the current fibonacci term    |
 * | b                    | long      | to store the next fibonacci term       |
 * | c                    | long      | to store the sum of a and b            |
 * | i                    | int       | to act as the counter in fibonacci()   |
 * | i                    | long      | to act as the counter in other methods |
 * | odd                  | long      | to store the current odd number        |
 * | s                    | long      | to store the sum of cubes              |
 * | ob                   | Series    | to refer to the object                 |
 * +----------------------+-----------+----------------------------------------+
 */
