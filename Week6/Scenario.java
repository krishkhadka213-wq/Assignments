package Week6;


/**
 * Write a description of class Scenario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Scenario
{
    public static void main(String[] args)
    {
      String[] categories = {"Fiction","Nepali"};
      String[][] titles = {{"Asahamati-5"},{"Ek Chihan"}};
      double[][] prices = {{750.0},{690.67}};
      
      for(int i=0; i<categories.length; i++)
      {
        String Titles = titles[i][0];
        double Prices = prices[i][0];
            if(Titles==null)
             {
               Titles="[No Title Available]";
             }
         System.out.println(categories[i]+": "+Titles+" Rs: "+Prices);
        }
      }
    }
