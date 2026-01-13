package week9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected int VehicleID;
    protected String brand;
    protected double Baseprice;
    
    public Vehicle(int VehicleID, String brand, double Baseprice)
    {
        this.VehicleID= VehicleID;
        this.brand= brand;
        this.Baseprice= Baseprice;
    }
    
    public void displayVehicleInfo()
    {
        System.out.println("Vehicle Id:"+ this.VehicleID);
        System.out.println("Brand:"+ this.brand);
        System.out.println("Base price:"+ this.Baseprice);
        
    }
    
    public double calculateTax()
    {
        return 0.10 * this.Baseprice;
    }
}