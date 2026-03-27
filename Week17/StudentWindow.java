package Week17;
import javax.swing.*;
import java.awt.*;

/**
 * Write a description of class StudentWindow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentWindow extends JFrame
{
    StudentWindow(){
        setTitle("Student Profile");
        setSize(400,300);
    }
    
    public static void main(String[] args){
    SwingUtilities.invokeLater(() -> {
     StudentWindow sw = new StudentWindow();
        sw.setDefaultCloseOperation(StudentWindow.EXIT_ON_CLOSE);
        JLabel l = new JLabel("Demo", JLabel.CENTER);
        sw.add(l);
        sw.setVisible(true);
    });
}
}
   
    
