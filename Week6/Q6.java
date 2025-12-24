package Week6;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
 public static void main(String[] args)
 {
   int[][] marks = { {80,75},{90,85}};
   
   for(int i=0;i<marks.length; i++)
   {
     for(int j=0; j<marks[i].length;j++)
     {
       System.out.print(marks[i][j]+ " ");
     }
     System.out.println();
   }
 }
}