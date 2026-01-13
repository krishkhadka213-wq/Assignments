package week9;


/**
 * Write a description of class BankAcc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAcc
{
    protected int accountNumber;
    protected String accountHolderName;
    protected double balance;

    public BankAcc(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    public double getBalance() {
        return balance;
    }
}