package Week17;
import javax.swing.*;


/**
 * Write a description of class MainLauncher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MainLauncher
{
    public static void main(){
        SwingUtilities.invokeLater(() ->{
            Q5 s1 = new Q5("101", "Ram", "Java");
            Q5 s2 = new Q5("102", "Shyam", "Java");
            Q5 s3 = new Q5("103", "Haro", "Java");
            new IDCardWindow(s1).setVisible(true);
            new IDCardWindow(s2).setVisible(true);  
        });
    }
}