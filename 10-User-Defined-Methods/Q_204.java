/*
 * ====================================================================
 *   Program  : Q_204
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Menu-Driven Number Checks using Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a menu-driven program using methods to check a number:
 *
 *       1. Prime number      - boolean isPrime(int n)
 *       2. Palindrome number - boolean isPalindrome(int n)
 *       3. Perfect number    - boolean isPerfect(int n)
 *
 *   Accept the choice and a number, call the corresponding method
 *   and display the result (e.g. "Prime Number" or "Not a Prime
 *   Number"). Display "Wrong choice" for any other choice.
 * ====================================================================
 */

import java.util.Scanner;

public class Q_204
{
    boolean isPrime(int n)
    {
        if (n < 2)
            return false;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    boolean isPalindrome(int n)
    {
        int copy = n, rev = 0;
        while (copy > 0)
        {
            rev = rev * 10 + copy % 10;
            copy = copy / 10;
        }
        return n >= 0 && rev == n;
    }

    boolean isPerfect(int n)
    {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++)
        {
            if (n % i == 0)
                sum = sum + i;
        }
        return n > 1 && sum == n;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Q_204 ob = new Q_204();
        System.out.println("1. Prime  2. Palindrome  3. Perfect");
        System.out.print("Enter your choice: ");
        int ch = sc.nextInt();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        switch (ch)
        {
            case 1:
                if (ob.isPrime(num))
                    System.out.println("Prime Number");
                else
                    System.out.println("Not a Prime Number");
                break;
            case 2:
                if (ob.isPalindrome(num))
                    System.out.println("Palindrome Number");
                else
                    System.out.println("Not a Palindrome Number");
                break;
            case 3:
                if (ob.isPerfect(num))
                    System.out.println("Perfect Number");
                else
                    System.out.println("Not a Perfect Number");
                break;
            default:
                System.out.println("Wrong choice");
        }
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description        |
 * +----------------------+-----------+------------------------------+
 * | n                    | int       | to receive the number        |
 * | i                    | int       | to act as the loop counter   |
 * | copy                 | int       | to store a working copy of n |
 * | rev                  | int       | to store the reverse of n    |
 * | sum                  | int       | to store the sum of factors  |
 * | ch                   | int       | to store the user's choice   |
 * | num                  | int       | to store the number entered  |
 * | ob                   | Q_204     | to refer to the object       |
 * +----------------------+-----------+------------------------------+
 */
