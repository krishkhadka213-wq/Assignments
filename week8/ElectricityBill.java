package week8;


/**
 * Write a description of class ElectricityBill here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ElectricityBill
{
    private String ConsumerName;
    private int UnitsConsumed;

    public ElectricityBill(String cName, int units)
    {
        this.ConsumerName = cName;
        this.UnitsConsumed = units;
    }

    public int getUnitsConsumed()
    {
        return UnitsConsumed;
    }
    
    public void setUnitsConsumed(int UnitsConsumed)
    {
        if (UnitsConsumed >= 0)
        {
            this.UnitsConsumed = UnitsConsumed;
        } 
        else 
        {
            System.out.println("Units consumed cannot be negative.");
        }
    }

    public double calculateBill() 
    {
        double billAmount;
        if (UnitsConsumed <= 100) 
        {
            billAmount = UnitsConsumed * 5;
        } 
        else 
        {
            billAmount = 100 * 5 + (UnitsConsumed - 100) * 8;
        }
        return billAmount;
    }

    public void displayBill() {
        System.out.println("Consumer Name: " + ConsumerName);
        System.out.println("Units Consumed: " + UnitsConsumed);
        System.out.println("Total Bill Amount: " + calculateBill());
    }
}