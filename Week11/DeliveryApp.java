package Week11;


/**
 * Write a description of class DeliveryApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryApp
{
    public static void main(String[] args)
    {
        // int orderId, double distance, String pickUp, String dropOff
        Notification d1 = new CarDelivery(101, 10, "Budhanilkantha","Lagankhel");
        d1.notify("Your order has been placed"); 
    }
}