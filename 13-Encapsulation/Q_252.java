/*
 * ====================================================================
 *   Program  : Q_252
 *   Chapter  : 13 - Encapsulation
 *   Title    : Kinds of Variables: Class, Instance, Local and Argument
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a class (written here as class Q_252) that shows the four
 *   kinds of variables and their scope:
 *
 *       static int count          - class variable (one copy shared by all
 *                                   objects)
 *       int id                    - instance variable (one copy per object)
 *       int square(int x)         - x is an argument (parameter) variable
 *       int sq inside square()    - a local variable
 *       a loop variable i         - local to the for loop only
 *
 *   Each time an object is created through the method create(),
 *   count increases by 1 and the object's id is set to count. In
 *   main(), create three objects, display each id and the shared
 *   count, and call square() to display the squares of 1 to 3.
 * ====================================================================
 */

public class Q_252
{
    static int count = 0;
    int id;

    static Q_252 create()
    {
        Q_252 ob = new Q_252();
        count++;
        ob.id = count;
        return ob;
    }

    int square(int x)
    {
        int sq = x * x;
        return sq;
    }

    public static void main(String[] args)
    {
        Q_252 a = create();
        Q_252 b = create();
        Q_252 c = create();
        System.out.println("Instance variable id : " + a.id + ", " + b.id + ", " + c.id);
        System.out.println("Class variable count : " + Q_252.count + " (one copy shared by all objects)");

        for (int i = 1; i <= 3; i++)
            System.out.println("square(" + i + ") = " + a.square(i));
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+----------------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                        |
 * +----------------------+-----------+----------------------------------------------+
 * | count                | int       | to count objects (class variable)            |
 * | id                   | int       | to store the object's id (instance variable) |
 * | ob                   | Q_252     | to refer to the new object (local)           |
 * | x                    | int       | to receive the number (argument variable)    |
 * | sq                   | int       | to store the square (local variable)         |
 * | a                    | Q_252     | to refer to the first object                 |
 * | b                    | Q_252     | to refer to the second object                |
 * | c                    | Q_252     | to refer to the third object                 |
 * | i                    | int       | to act as the loop variable (local to loop)  |
 * +----------------------+-----------+----------------------------------------------+
 */
