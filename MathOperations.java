
/**
 * Write a description of class MathOperations here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MathOperations
{
    public static void main(String[ ] args)
 {
     // 1. Arithemetic Operator
     
     int num1 = 15;
     int num2 = 20;
     
     int sum = num1 + num2;
     int diff = num2 - num1;
     int mult = num1 * num2;
     int div = num1 / num2;
     int remain = num1 % num2;
     
     System.out.println(sum);
     System.out.println(diff);
     System.out.println(mult);
     System.out.println(div);
     System.out.println(remain);
    

     // Urinary Operator
     
     int num3 = 1;
     
     // Post-increment
     
     System.out.println(num3); //num3 = 1
     System.out.println(num3++); //num3++ = 1, num3=2
     System.out.println(num3); // num3=2
     // Pre-increment
     
     System.out.println(++num3); //++num3=3, num3=3,
     System.out.println(num3); //num3 =3
     
     //Relational Operator
     
     float num4= 2.02f;
     float num5= 2.40f;
     
     System.out.println(num4 < num5);
     System.out.println(num4 > num5);
     System.out.println(num4 == num5);
     System.out.println(num4 != num5);
     System.out.println(num4 <= num5);
     System.out.println(num4 >= num5);
     
     // Logical Operator 
     
     double num6 = 5.345d;
     double num7 = 8.34d;
     
     System.out.println(num6 < 10 && num7 > 10);
     System.out.println(num6 < 10 || num7 > 10);
     System.out.println(!(num6 < 10 && num7 > 7));
     
     // Ternary Operator 
     
       // 1. If statement
          int  num8 = 3;
          if (num8 >= 3)
          {
              System.out.println("true");
              
          }
    
      // 2. If statement 
          int num9 = 9;
          if(num9 >= 5)
          {
              System.out.println("True");
          }
          else
          {
              System.out.println("False");
          }
      // 3. Nested If statement
         int num10 = 19;
         if(num10 > 10)
         {
             System.out.println("True");
         }
         else if(num10 > 13)
         {
             System.out.println("True");
         }
         else
         {
             System.out.println("False");
         }
 }
}