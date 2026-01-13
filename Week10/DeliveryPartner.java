package Week10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int PartnerId;
    private String Name;
    private double BasePay;

    public DeliveryPartner(int partnerId, String name, double basePay) 
    {
        this.PartnerId = partnerId;
        this.Name = name;
        this.BasePay = basePay;
    }

    public int getPartnerId() 
    {
        return PartnerId;
    }

    public void setPartnerId(int partnerId) 
    {
        this.PartnerId = partnerId;
    }

    public String getName() 
    {
        return Name;
    }

    public void setName(String name) 
    {
        this.Name = name;
    }

    public double getBasePay()
    {
        return BasePay;
    }

    public void setBasePay(double basePay) 
    {
        this.BasePay = basePay;
    }

    public double calculatePayment() 
    {
        return BasePay;
    }

    @Override
    public String toString()
    {
        return "Partner ID: " + PartnerId +
               ", Name: " + Name +
               ", Base Pay: " + BasePay;
    }
}