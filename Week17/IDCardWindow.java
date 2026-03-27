package Week17;
import javax.swing.*;


/**
 * Write a description of class IDCardWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IDCardWindow extends JFrame
{
    IDCardWindow(Q5 std)
    {
      JLabel l = new JLabel(std.getFormattedHTMLText(), JLabel.CENTER);
      add(l);
      setSize(450,300);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
}
