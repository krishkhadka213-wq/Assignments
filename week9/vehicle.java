package week9;


/**
 * Write a description of class vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class vehicle
{
    protected int vehicleId;
    protected String brand;
    protected double baseprice;
    
    public vehicle(int vehicleId, String brand, double baseprice)
    {
        this.vehicleId= vehicleId;
        this.brand=brand;
        this.baseprice=baseprice;
    }
    
    public void displayvehicleInfo()
    {
        System.out.println("vehicle Id: " + this.vehicleId);
        System.out.println("brand: " + this.brand);
        System.out.println("base price: "+ 
    }
}