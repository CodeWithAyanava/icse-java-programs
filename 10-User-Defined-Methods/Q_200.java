/*
 * ====================================================================
 *   Program  : Q_200
 *   Chapter  : 10 - User-Defined Methods
 *   Title    : Pure and Impure Methods
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Write a class (written here as class Q_200) to show the
 *   difference between pure and impure methods. The class has a data
 *   member int marks.
 *
 *       int addBonus(int m, int b) : a pure method that returns m + b
 *                                    without changing any data member
 *       void updateMarks(int b)    : an impure method that adds b to the
 *                                    data member marks (changes the state
 *                                    of the object)
 *
 *   In main(), create an object with marks = 70. Call
 *   addBonus(marks, 5) and display its result and the value of
 *   marks; then call updateMarks(5) and display marks again.
 * ====================================================================
 */

public class Q_200
{
    int marks;

    int addBonus(int m, int b)
    {
        return m + b;
    }

    void updateMarks(int b)
    {
        marks = marks + b;
    }

    public static void main(String[] args)
    {
        Q_200 ob = new Q_200();
        ob.marks = 70;

        int r = ob.addBonus(ob.marks, 5);
        System.out.println("Pure method returned " + r + ", marks is still " + ob.marks);

        ob.updateMarks(5);
        System.out.println("After impure method, marks is now " + ob.marks);
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+-----------------------------+
 * | Name of the Variable | Data Type | Purpose / Description       |
 * +----------------------+-----------+-----------------------------+
 * | marks                | int       | to store the marks          |
 * | m                    | int       | to receive the marks        |
 * | b                    | int       | to receive the bonus        |
 * | r                    | int       | to store the returned value |
 * | ob                   | Q_200     | to refer to the object      |
 * +----------------------+-----------+-----------------------------+
 */
