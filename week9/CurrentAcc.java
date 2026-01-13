package week9;


/**
 * Write a description of class CurrentAcc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAcc extends BankAcc
{
    private double overdraftLimit;

    public CurrentAcc(int accountNumber, String accountHolderName,
                          double balance, double overdraftLimit) {
        super(accountNumber, accountHolderName, balance);
        this.overdraftLimit = overdraftLimit;
    }

    public boolean withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Withdrawal Denied!");
            return false;
        }
    }
}