package Week11;

public abstract class Delivery
{
    private int orderId;
    private double distanceInKm;
    private String pickupLocation;
    private String dropoffLocation;
    
    public Delivery(int orderId, double distance, String pickUp, String dropOff)
    {
        this.orderId = orderId;
        this.distanceInKm = distance;
        this.pickupLocation = pickUp;
        this.dropoffLocation = dropOff;
    }
    
    public double getDistance()
    {
        return this.distanceInKm;
    }
    
    public abstract double calculatecharge();
    public abstract double estimateTime();
}