/*
 * ====================================================================
 *   Program  : Q_243
 *   Chapter  : 12 - Library Classes
 *   Title    : Autoboxing and Unboxing
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a program to demonstrate autoboxing and unboxing:
 *
 *       (a) store the int value 25 in an Integer object (autoboxing)
 *       (b) store the double value 3.5 in a Double object (autoboxing)
 *       (c) store the char 'J' in a Character object (autoboxing)
 *       (d) assign the Integer object to an int variable (unboxing)
 *       (e) use the Integer and Double objects in an arithmetic expression
 *           (automatic unboxing) and display the result
 *       (f) pass an int to a method that takes an Integer parameter and
 *           return an int from it
 * ====================================================================
 */

public class Q_243
{
    static int twice(Integer x)
    {
        return x * 2;
    }

    public static void main(String[] args)
    {
        Integer iObj = 25;
        Double dObj = 3.5;
        Character cObj = 'J';
        System.out.println("(a) Integer object : " + iObj);
        System.out.println("(b) Double object  : " + dObj);
        System.out.println("(c) Character obj  : " + cObj);

        int n = iObj;
        System.out.println("(d) unboxed int    : " + n);

        double r = iObj + dObj * 2;
        System.out.println("(e) iObj + dObj * 2 = " + r);

        int t = twice(10);
        System.out.println("(f) twice(10) = " + t);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                 |
 * +----------------------+-----------+---------------------------------------+
 * | x                    | Integer   | to receive an integer object          |
 * | iObj                 | Integer   | to store a boxed integer              |
 * | dObj                 | Double    | to store a boxed double               |
 * | cObj                 | Character | to store a boxed character            |
 * | n                    | int       | to store the unboxed integer          |
 * | r                    | double    | to store the result of the expression |
 * | t                    | int       | to store the value returned           |
 * +----------------------+-----------+---------------------------------------+
 */
