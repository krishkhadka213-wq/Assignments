package week8;


/**
 * Write a description of class ATM here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ATM
{
    public static void main(String[] args)
    {
        BankAccount a1 = new BankAccount(4637, "Vecna", 50000);

        a1.displayAccountInfo();
        System.out.println();
        
        a1.deposit(2500);
        System.out.println("Balance after deposit: " + a1.getBalance());
        System.out.println();

        boolean success = a1.withdraw(3500); 
        System.out.println("Withdrawal success: " + success);
        System.out.println("Balance after withdrawal: " + a1.getBalance());
        System.out.println();

        a1.withdraw(5000);
        System.out.println("Final Balance: " + a1.getBalance());
    }
}