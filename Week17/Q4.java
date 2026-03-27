package Week17;
import javax.swing.*;
import java.awt.*;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4 extends JFrame
{
    public Q4()
    {
       setTitle("Student ID Card Preview");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        String htmlText = "<html>" +
                         "<body style='text-align: center;'>" +
                         "<h2>STUDENT ID CARD</h2>" +
                         "<hr>" +
                         "<br>" +
                         "<b>Name:</b><br>" +
                         "Krish Khadka<br>" +
                         "<br>" +
                         "<b>Module:</b><br>" +
                         "Computing<br>" +
                         "<br>" +
                         "<b>College:</b><br>" +
                         "Islington College<br>" +
                         "<hr>" +
                         "</body>" +
                         "</html>";

        JLabel idLabel = new JLabel(htmlText);
        idLabel.setHorizontalAlignment(JLabel.CENTER);
        idLabel.setFont(new Font("Arial", Font.PLAIN, 14));

        add(idLabel);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Q4().setVisible(true);
        });
    }  
    }