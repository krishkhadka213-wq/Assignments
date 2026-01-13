package Week10;


/**
 * Write a description of class BikeDeli here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BikeDeli extends DeliveryPartner
{
    public BikeDeli(int partnerId, String name, double basePay)
    {
        super(partnerId, name, basePay);
    }

    
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 200; 
    }

    
    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 50);
    }
}