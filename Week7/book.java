package Week7;


/**
 * Write a description of class book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class book
{
   private String title;
   private String author;
   private int price; 
   
   public book(String title, String author)
   {
       this.title = title;
       this.author = author;
   }
   
   public void displayDetails()
   {
       System.out.println("Title of the book is: " + this.title);
       System.out.println("Author of the book is: " + this.author);
   }
}