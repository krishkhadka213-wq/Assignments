package Week11;


/**
 * Write a description of class Rice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rice extends Crop implements Transportable
{
    public Rice(double landArea)
    {
        super("Rice","Monsoon", landArea);
    }
    
    @Override
    public double calculateYield(){
         return landArea * 40;   
    }

    @Override
    public double calculateWaterRequirement() {
        return landArea * 120000;
    }

    @Override
    public double calculateTransportCost() {
        return calculateYield() * 150;
    }

    @Override
    public String getTransportMethod() {
        return "Tractor (rural muddy roads)";
    }
}