/*
 * ====================================================================
 *   Program  : Q_20
 *   Chapter  : 03 - Operators in Java
 *   Title    : Prefix and Postfix Increment and Decrement
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to show the difference between the prefix and
 *   postfix forms of the increment (++) and decrement (--)
 *   operators. Starting with a = 5 each time, find and display the
 *   values of a and b after each of these statements:
 *
 *       (a) b = a++;     (b) b = ++a;     (c) b = a--;     (d) b = --a;
 *       (e) b = a++ + ++a;               (f) b = a-- - --a + a++;
 * ====================================================================
 */

public class Q_20
{
    public static void main(String[] args)
    {
        int a, b;

        a = 5;
        b = a++;
        System.out.println("(a) b = a++          : a = " + a + ", b = " + b);

        a = 5;
        b = ++a;
        System.out.println("(b) b = ++a          : a = " + a + ", b = " + b);

        a = 5;
        b = a--;
        System.out.println("(c) b = a--          : a = " + a + ", b = " + b);

        a = 5;
        b = --a;
        System.out.println("(d) b = --a          : a = " + a + ", b = " + b);

        a = 5;
        b = a++ + ++a;
        System.out.println("(e) b = a++ + ++a    : a = " + a + ", b = " + b);

        a = 5;
        b = a-- - --a + a++;
        System.out.println("(f) b = a-- - --a + a++ : a = " + a + ", b = " + b);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | a                    | int       | to store the operand value            |
 * | b                    | int       | to store the result of each statement |
 * +----------------------+-----------+---------------------------------------+
 */
