package week8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private double itemPrice;
    private int Quantity;

    public ShoppingCart(double Price, int Qty)
    {
        this.itemPrice = Price;
        this.Quantity = Qty;
    }

    public int getQuantity()
    {
        return Quantity;
    }

    // Setter for quantity
    public void setQuantity(int Quantity)
    {
        if (Quantity >= 0) {
            this.Quantity = Quantity;
        } 
        else 
        {
            System.out.println("Quantity cannot be negative.");
        }
    }

    public double calculateTotal() {
        return itemPrice * Quantity;
    }

    public double calculateDiscountedTotal(double discountPercent) {
        double total = calculateTotal();
        double discountAmount = total * (discountPercent / 100);
        return total - discountAmount;
    }

    // Method to display cart details
    public void displayCart() {
        System.out.println("Item Price: " + itemPrice);
        System.out.println("Quantity: " + Quantity);
        System.out.println("Total Price: " + calculateTotal());
    }
}