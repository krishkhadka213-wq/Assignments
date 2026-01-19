package Week11;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop
{
    protected String cropName;
    protected String season;
    protected double landArea;
    
    public Crop(String cropName, String season, double landArea)
    {
      this.cropName = cropName;
      this.season = season;
      this.landArea = landArea;
    }
    
    public abstract double calculateYield();
    public abstract double calculateWaterRequirement();
    
    public void displayCropInfo()
    {
        System.out.println("Crop Name" + cropName);
        System.out.println("Season" + season);
        System.out.println("Land Area" + landArea);
        System.out.println("Expected Yield" + calculateYield());
        System.out.println("Water Required" + calculateWaterRequirement());
    }
}