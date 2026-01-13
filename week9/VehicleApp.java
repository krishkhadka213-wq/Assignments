package week9;


/**
 * Write a description of class VehicleApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class VehicleApp
{
    public static void main(String[] args)
    {
        Car c1= new Car(101, "BMW", 40000000, 3, "Diesel");
        c1.displayCarDetails();
        
        Bike b1= new Bike(112, "RE Meteor 350", 720000, 8);
        b1.displayBikeDetails();
    }
}