/*
 * ====================================================================
 *   Program  : Q_251
 *   Chapter  : 13 - Encapsulation
 *   Title    : Access Specifiers: private, default, protected and public
 * --------------------------------------------------------------------
 *   Question :
 *
 *   Define a class Account (written here as class Q_251) having one
 *   member of each access level:
 *
 *       private double balance        - visible only inside this class
 *       String branch (default)       - visible inside the same package
 *       protected String ifsc         - visible in the same package and in
 *                                       subclasses
 *       public String holder          - visible everywhere
 *
 *   Write public methods getBalance() and deposit(double amt) to
 *   give controlled access to the private member. In main() (which
 *   is inside the same class, so every member is accessible here),
 *   create an object, assign values to all members, deposit an
 *   amount and display all the members. Also display a table showing
 *   where each access specifier allows access.
 * ====================================================================
 */

public class Q_251
{
    private double balance;
    String branch;
    protected String ifsc;
    public String holder;

    public double getBalance()
    {
        return balance;
    }

    public void deposit(double amt)
    {
        if (amt > 0)
            balance = balance + amt;
    }

    public static void main(String[] args)
    {
        Q_251 a = new Q_251();
        a.holder = "Ishaan Roy";
        a.branch = "Salt Lake";
        a.ifsc = "ABCD0001234";
        a.balance = 1000;
        a.deposit(500);

        System.out.println("holder (public)     : " + a.holder);
        System.out.println("branch (default)    : " + a.branch);
        System.out.println("ifsc (protected)    : " + a.ifsc);
        System.out.println("balance (private)   : " + a.getBalance());
        System.out.println();
        System.out.println("Access from     private  default  protected  public");
        System.out.println("Same class        Yes      Yes       Yes       Yes");
        System.out.println("Same package      No       Yes       Yes       Yes");
        System.out.println("Subclass (other   No       No        Yes       Yes");
        System.out.println("  package)");
        System.out.println("Other package     No       No        No        Yes");
    }
}

/*
 * Variable Description Table
 *
 * +----------------------+-----------+--------------------------------------+
 * | Name of the Variable | Data Type | Purpose / Description                |
 * +----------------------+-----------+--------------------------------------+
 * | balance              | double    | to store the balance (private)       |
 * | branch               | String    | to store the branch (default access) |
 * | ifsc                 | String    | to store the ifsc code (protected)   |
 * | holder               | String    | to store the holder's name (public)  |
 * | amt                  | double    | to receive the amount deposited      |
 * | a                    | Q_251     | to refer to the account object       |
 * +----------------------+-----------+--------------------------------------+
 */
