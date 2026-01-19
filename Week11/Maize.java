package Week11;


/**
 * Write a description of class Maize here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Maize extends Crop implements Transportable {

    public Maize(double landArea) {
        super("Maize", "Summer", landArea);
    }

    @Override
    public double calculateYield() {
        return landArea * 25;
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 50000;
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 200;
    }

    @Override
    public String getTransportMethod() {
        return "Mule/Porter";
    }
}
