/*
 * ====================================================================
 *   Program  : Q_212
 *   Chapter  : 11 - Constructors
 *   Title    : Non-Parameterised (Default) Constructor
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Student (written here as class Q_212) with data
 *   members String name, int roll and double marks. Write a non-
 *   parameterised (default) constructor that initialises name to
 *   "Not assigned", roll to 0 and marks to 0.0, and a method void
 *   show() to display the data members. In main(), create two
 *   objects and display them to show that the constructor is invoked
 *   automatically for every object created. Then assign new values
 *   to the second object and display it again.
 * ====================================================================
 */

public class Q_212
{
    String name;
    int roll;
    double marks;

    Q_212()
    {
        name = "Not assigned";
        roll = 0;
        marks = 0.0;
        System.out.println("Constructor invoked");
    }

    void show()
    {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }

    public static void main(String[] args)
    {
        Q_212 s1 = new Q_212();
        Q_212 s2 = new Q_212();
        s1.show();
        s2.show();
        s2.name = "Neha Bose";
        s2.roll = 12;
        s2.marks = 91.5;
        s2.show();
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description          |
 * +----------------------+-----------+--------------------------------+
 * | name                 | String    | to store the student's name    |
 * | roll                 | int       | to store the roll number       |
 * | marks                | double    | to store the marks             |
 * | s1                   | Q_212     | to refer to the first student  |
 * | s2                   | Q_212     | to refer to the second student |
 * +----------------------+-----------+--------------------------------+
 */
