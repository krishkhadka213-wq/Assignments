package Week10;


/**
 * Write a description of class NormalOrd here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NormalOrd extends Order
{
    public NormalOrd(int orderId, String customerName, double amount) 
    {
        super(orderId, customerName, amount);
    }

    @Override
    public double calculateFinalAmount() 
    {
        super.calculateFinalAmount();
        return amount + 50;
    }

    public double calculateFinalAmount(double discountAmount) 
    {
        return (amount + 50) - discountAmount;
    }
}