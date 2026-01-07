package week8;


/**
 * Write a description of class ShoppingApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingApp
{
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart(1500.49, 7);
        
        System.out.println("Cart Details");
        cart.displayCart();
        System.out.println();

        System.out.println("Current quantity: " + cart.getQuantity());
        cart.setQuantity(5);
        System.out.println("Updated quantity: " + cart.getQuantity());
        System.out.println("Updated total: " + cart.calculateTotal());
        System.out.println();

        double Discount = 10;
        double DiscountedTotal = cart.calculateDiscountedTotal(Discount);
        System.out.println("Discounted Total (" + Discount + "% off): " + DiscountedTotal);
    }
}