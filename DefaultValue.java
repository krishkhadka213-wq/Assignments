
/**
 * Write a description of class DefaultValue here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefaultValue
{
    byte byteValue;
    short shortValue;
    int intValue;
    long longValue;
    float floatValue;
    double doubleValue;
    char charValue;
    boolean booleanValue;
    
    public static void main(String[] args)
    {   
        DefaultValue defaults = new DefaultValue();
        
        System.out.println("Default byte value  " + defaults.byteValue);
        System.out.println("Default short value  " + defaults.shortValue);
        System.out.println("Default int value  " + defaults.intValue);
        System.out.println("Default long value  " + defaults.longValue);
        System.out.println("Default float value  " + defaults.floatValue);
        System.out.println("Default double value  " + defaults.doubleValue);
        System.out.println("Default char value  " + defaults.charValue);
        System.out.println("Default boolean value  " + defaults.booleanValue);
    }
}