package Week19;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class StudentDashboardUI here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StudentDashboardUI extends JFrame
{
    public StudentDashboardUI(){
        setTitle("Admin Dashboard");
        setSize(900, 600);
        setLayout(new BorderLayout());
        
        //Header Panel
        
        JPanel headerPanel = new JPanel();
        headerPanel setLayout(new FlowLayout(FLowLayout.LEFT));   
        //Footer Panel
        
        JPanel footerPanel = new JPanel();
        
        add(headerPanel, BorderLayout.NORTH);
        add(footerPanel, BorderLayout.SOUTH);
        
    }
}