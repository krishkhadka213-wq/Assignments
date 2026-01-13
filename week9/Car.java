package week9;

public class Car extends Vehicle
{
   private int doornum;
   private String fuelTypes;
   
   public Car(int VehicleID, String brand, double basePrice, int doors, String fuelTypes)
   {
       super(VehicleID, brand, basePrice);
       this.doornum= doors;
       this.fuelTypes= fuelTypes;
   }
   
   public double calculateFinalPrice()
   {
       return super.Baseprice + super.calculateTax() + 0.05 * super.Baseprice;
   }
   
   public void displayCarDetails()
   {
       super.displayVehicleInfo();
       System.out.println("No. of doors:"+ this.doornum);
       System.out.println();
   } 
}