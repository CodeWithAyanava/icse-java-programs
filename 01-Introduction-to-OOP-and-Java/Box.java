/*
 * ====================================================================
 *   Program  : Q_4
 *   Chapter  : 01 - Introduction to OOP and Java
 *   Title    : Class Box: Creating an Object and Finding its Volume
 *   Class    : Box  (file Box.java)
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Box with the following specifications:
 *
 *       Data members  : double length, breadth, height
 *       void assign(double l, double b, double h) : to assign the
 *                       arguments to the data members
 *       double volume() : to calculate and return the volume of the box
 *       void display()  : to display the dimensions and the volume
 *
 *   Write a main method to create an object of the class and call
 *   the above methods to assign the dimensions 12.5, 8.0 and 4.0 and
 *   display the details.
 * ====================================================================
 */

public class Box
{
    double length, breadth, height;

    void assign(double l, double b, double h)
    {
        length = l;
        breadth = b;
        height = h;
    }

    double volume()
    {
        return length * breadth * height;
    }

    void display()
    {
        System.out.println("Length  = " + length);
        System.out.println("Breadth = " + breadth);
        System.out.println("Height  = " + height);
        System.out.println("Volume  = " + volume());
    }

    public static void main(String[] args)
    {
        Box box = new Box();
        box.assign(12.5, 8.0, 4.0);
        box.display();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+---------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description           |
 * +----------------------+-----------+---------------------------------+
 * | length               | double    | to store the length of the box  |
 * | breadth              | double    | to store the breadth of the box |
 * | height               | double    | to store the height of the box  |
 * | l                    | double    | to receive the length           |
 * | b                    | double    | to receive the breadth          |
 * | h                    | double    | to receive the height           |
 * | box                  | Box       | to refer to the box object      |
 * +----------------------+-----------+---------------------------------+
 */
