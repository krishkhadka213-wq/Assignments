package Week7;


/**
 * Write a description of class Mobiile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Mobiile
{
    String brand;
    int price;

    public Mobiile(String brand, int price)
    {
        this.brand = brand;
        this.price = price;
    }

    public boolean isAffordable()
    {
        return price < 20000;
    }
}