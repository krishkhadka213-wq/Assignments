package Week10;


/**
 * Write a description of class PremiumOrd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PremiumOrd extends Order
{
    public PremiumOrd(int orderId, String customerName, double amount) 
    {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() 
    {
        super.calculateFinalAmount();
        return amount - 100;
    }

    // Overloaded method
    public double calculateFinalAmount(double discountAmount) 
    {
        return amount - discountAmount;
    }
}