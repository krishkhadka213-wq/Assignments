package week9;


/**
 * Write a description of class SavingAcc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAcc extends BankAcc
{
    private double interestRate;

    public SavingAcc(int accountNumber, String accountHolderName,
                         double balance, double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate = interestRate;
    }

    public double calculateInterest() {
        return super.getBalance() * interestRate / 10;
    }
}