package Week12;
import java.util.*;

public class Array
{
    public static void main(String[] args)
    {
        ArrayList arrList = new ArrayList();
        
        System.out.println(arrList.isEmpty());
        arrList.add(10);
        arrList.add(60);
        arrList.add(40);
        
        System.out.println(arrList);
        arrList.add(0,100);
        System.out.println(arrList);
        
        System.out.println(arrList.isEmpty());
        
        System.out.println(arrList.size());
        
        arrList.remove(0);
        
        System.out.println(arrList);
        
        System.out.println(arrList.get(0));
        
        arrList.set(0,87);
        
        System.out.println(arrList);
        
        //contains indexof
        
        System.out.println(arrList.contains(87)); //true or false
        
        System.out.println(arrList.indexOf(20)); // -1
        
        System.out.println(arrList);
        
        //traversing an array element
        
        for(int Array : arrList)
        {
            System.out.println(Array);
        }
        
        //Iterator interface
        
        
        
        
        
        
    }
}