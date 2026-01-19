package Week11;


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FarmCalculator {

    public static void main(String[] args) 
    {
        Crop[] crops = new Crop[3];

        crops[0] = new Rice(1.5);
        crops[1] = new Wheat(1.0);
        crops[2] = new Maize(0.8);

        for (Crop crop : crops) {
            crop.displayCropInfo();

            if (crop instanceof Transportable) {
                Transportable t = (Transportable) crop;
                System.out.println("Transport Method: " + t.getTransportMethod());
                System.out.println("Transport Cost: NPR " + t.calculateTransportCost());
            }
        }
    }
}
