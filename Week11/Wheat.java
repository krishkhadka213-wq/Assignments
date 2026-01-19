package Week11;


/**
 * Write a description of class Wheat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wheat extends Crop implements Transportable
{
    public Wheat(double landArea) {
        super("Wheat", "Winter", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 30;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 70000;
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 120;
    }

    @Override
    public String getTransportMethod() {
        return "Mini Truck (gravel roads)";
    }
}