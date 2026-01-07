package week8;


/**
 * Write a description of class BankAccount here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAccount
{
    private long accountNumber;
    private double balance;
    private String name;

    public BankAccount(long accountNum, String Name, double Bal)
    {
        this.accountNumber = accountNum;
        this.name = Name;
        this.balance = Bal;
    }

    public double getBalance()
    {
        return balance;
    }
    
    public void deposit(double amount)
    {
        if (amount > 0)
        {
            balance += amount;
            System.out.println(amount + " deposited successfully.");
        }
        else
        {
            System.out.println("Deposit amount must be positive.");
        }
    }

    public boolean withdraw(double amount)
    {
        if (amount > 0 && amount <= balance)
        {
            balance -= amount;
            System.out.println(amount + " withdrawn successfully.");
            return true;
        } else
        {
            System.out.println("Withdrawal failed.");
            return false;
        }
    }

    // Optional: display account info
    public void displayAccountInfo() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + name);
        System.out.println("Balance: " + balance);
    }
}