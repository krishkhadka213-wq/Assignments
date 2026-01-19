package Week11;


/**
 * Write a description of class CarDelivery here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDelivery extends Delivery implements Notification
{
    private static final double PER_KM_CHARGE =50;
    private static final double MIN_PER_KM = 4;
    
    public CarDelivery(int orderId, double distance, String pickUp, String dropOff)
    {
        super(orderId, distance, pickUp, dropOff);
    }
    
    @Override
    public double calculatecharge()
    {
        return super.getDistance() * PER_KM_CHARGE;
    }
    
    @Override
    public double estimateTime()
    {
        return super.getDistance()* MIN_PER_KM;
    }
    
    public double display()
    {
        return this.calculatecharge();
    }
    
    @Override 
    public void notify(String message)
    {
        System.out.println(message);
    }
}