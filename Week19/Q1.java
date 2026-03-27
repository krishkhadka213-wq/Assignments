package Week19;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1 extends JFrame
{
   public Q1()
   {
       setTitle("Student Registration");
       setSize(500, 350);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setLocationRelativeTo(null);
       setLayout(new BorderLayout());
       // titel pannel    
       JPanel titlePanel = new JPanel();
       JLabel title = new JLabel("Student Registraton Form");
       title.setFont(new Font("Arial", Font.BOLD, 18));
       titlePanel.add(title);
       add(titlePanel, BorderLayout.NORTH);
       setVisible(true);
   }
   public static void main(String[] args)
   {
       SwingUtilities.invokeLater( () -> 
       {
           new Q1();
       });
   }
}
