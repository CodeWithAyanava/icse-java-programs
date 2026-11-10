/*
 * ====================================================================
 *   Program  : Q_253
 *   Chapter  : 13 - Encapsulation
 *   Title    : Counting Objects with a Static (Class) Variable
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Visitor (written here as class Q_253) with a
 *   private static int total that counts how many Visitor objects
 *   have been created, a private String name, a parameterised
 *   constructor Visitor(String n) that stores the name and increases
 *   total by 1, an instance method void greet() and a static method
 *   int getTotal(). In main(), accept the names of n visitors (n
 *   entered by the user) and create an object for each, greeting
 *   each visitor; finally display the total number of visitors using
 *   getTotal().
 * ====================================================================
 */

import java.util.Scanner;

public class Q_253
{
    private static int total = 0;
    private String name;

    Q_253(String n)
    {
        name = n;
        total++;
    }

    void greet()
    {
        System.out.println("Welcome, " + name + "! You are visitor number " + total);
    }

    static int getTotal()
    {
        return total;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many visitors? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 1; i <= n; i++)
        {
            System.out.print("Enter name: ");
            Q_253 v = new Q_253(sc.nextLine());
            v.greet();
        }
        System.out.println("Total visitors = " + getTotal());
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                             |
 * +----------------------+-----------+---------------------------------------------------+
 * | total                | int       | to count the visitors (class variable)            |
 * | name                 | String    | to store the visitor's name                       |
 * | n                    | int       | to receive the name / store the count of visitors |
 * | i                    | int       | to act as the loop counter                        |
 * | v                    | Q_253     | to refer to each visitor object                   |
 * +----------------------+-----------+---------------------------------------------------+
 */
