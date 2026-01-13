package Week10;


/**
 * Write a description of class CarDeli here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CarDeli extends DeliveryPartner
{
    public CarDeli(int partnerId, String name, double basePay) {
        super(partnerId, name, basePay);
    }

    
    @Override
    public double calculatePayment() {
        return super.calculatePayment() + 500; 
    }


    public double calculatePayment(int extraOrders) {
        return calculatePayment() + (extraOrders * 100);
    }
}