package Workshop5;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
 public static void main(String[] args)
 {
   for(int i=1; i<=5; i++)
    {
      for(int j= 5; j>=i; j--)
      {
        System.out.print(" ");
      }
      for(int j=1; j<=i; j++)
      {
        System.out.print(j);
      }
      System.out.println();
    }
 }
}