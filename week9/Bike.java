package week9;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private int enginecapacity;
    public Bike(int vehicleId, String brand, double basePrice, int engineCapacity)
    {
        super(vehicleId, brand, basePrice);
        this.enginecapacity= enginecapacity;
    }
    
    public double calculateFinalPrice()
    {
        return super.Baseprice+ super.calculateTax();
    }
    
    public void displayBikeDetails()
    {
        System.out.println("Bike Details");
        super.displayVehicleInfo();
        System.out.println("Fuel type:"+ this.enginecapacity);
    }
}