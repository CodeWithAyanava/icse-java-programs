/*
 * ====================================================================
 *   Program  : Q_214
 *   Chapter  : 11 - Constructors
 *   Title    : Constructor Overloading: Rectangle with Three Constructors
 *   Class    : Rectangle   (compile: javac Q_214.java   run: java Rectangle)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Rectangle with data members double length and
 *   breadth, and the following overloaded constructors:
 *
 *       Rectangle()                   : sets length and breadth to 1
 *       Rectangle(double s)           : creates a square of side s
 *       Rectangle(double l, double b) : sets length = l, breadth = b
 *
 *   Also define double area() and void show(). In main(), create one
 *   object using each constructor and display their dimensions and
 *   areas.
 * ====================================================================
 */

class Rectangle
{
    double length, breadth;

    Rectangle()
    {
        length = 1;
        breadth = 1;
    }

    Rectangle(double s)
    {
        length = s;
        breadth = s;
    }

    Rectangle(double l, double b)
    {
        length = l;
        breadth = b;
    }

    double area()
    {
        return length * breadth;
    }

    void show()
    {
        System.out.println(length + " x " + breadth + ", area = " + area());
    }

    public static void main(String[] args)
    {
        Rectangle r1 = new Rectangle();
        Rectangle r2 = new Rectangle(4.5);
        Rectangle r3 = new Rectangle(8, 2.5);
        r1.show();
        r2.show();
        r3.show();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description             |
 * +----------------------+-----------+-----------------------------------+
 * | length               | double    | to store the length               |
 * | breadth              | double    | to store the breadth              |
 * | s                    | double    | to receive the side of a square   |
 * | l                    | double    | to receive the length             |
 * | b                    | double    | to receive the breadth            |
 * | r1                   | Rectangle | to refer to the default rectangle |
 * | r2                   | Rectangle | to refer to the square            |
 * | r3                   | Rectangle | to refer to the third rectangle   |
 * +----------------------+-----------+-----------------------------------+
 */
