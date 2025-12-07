import java.util.Scanner;

/**
 * Write a description of class RickshawFare here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RickshawFare
{
 public static void main(String [] args)
 {
  //Scanner for taking input
     
  Scanner scan = new Scanner(System.in);
  
  // Fares for components
  
  double basefare = 30;
  double perkm = 10;
  double permin = 2;
  double dis = 0.20;
  double sur = 1.20;
  
  // Taking inputs from user
  
  System.out.println("Enter distance(in km): ");
  double dist = scan.nextDouble();
  
  System.out.println("Enter time(in min): ");
  double time = scan.nextDouble();
  
  System.out.println("Is passenger local(yes/no): ");
  String local = scan.nextLine();
  
  scan.nextLine();
  
  System.out.println("Is it night time(yes/no): ");
  String night = scan.nextLine();
  
  // Ternary operation
  
  boolean islocal = local.equals("yes")? true : false;
  boolean isnight = night.equals("yes")? true : false;
  
  // Basic fare calculations
  
  double fare = basefare + (dist * perkm) + (time * permin);
  
  // Discounts for locals travelling long distance
  
  if(islocal && dist > 10)
  {
    fare = fare - (fare * dis);
  }
  
  // Extra charge for night time
  
  if(isnight)
  {
      fare = fare + (fare * sur);
  }
  
  // FInal fare
  
  System.out.println("Final fare: "+ fare);
 }
}