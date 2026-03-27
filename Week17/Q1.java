package Week17;
import javax.swing.*;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
  public static void main(String[] args)
  {
    JFrame f = new JFrame("Library Not");
    f.setTitle("Library Notice");
    f.setSize(400,300);
    f.setVisible(true);
    
    JLabel label = new JLabel("Library Opens at 7:00 AM");
    label.setBounds(100,50,180,30);
    
    f.add(label);
    f.setLayout(null);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }
    
}