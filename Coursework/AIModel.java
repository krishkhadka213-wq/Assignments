package Coursework;


/**
 * Write a description of class AIModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AIModel
{
    private String modelName;
    private double price;
    private String contextWindow;
    
    public AIModel(String modelName, double price, String contextWindow)
    {
        this.modelName     = modelName;
        this.price         = price;
        this.contextWindow = contextWindow;
    }

    public String getModelName()
    {
        return modelName;
    }

    public double getPrice()
    {
        return price;
    }

    public String getContextWindow()
    {
        return contextWindow;
    }

    public String display() {
        return "Model Name    : " + modelName     + "\n"
             + "Price (NPR)   : " + price         + " per 1 lakh tokens\n"
             + "Context Window: " + contextWindow;
    }
}