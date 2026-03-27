package Week19;
import javax.swing.*;
import java.awt.*;
import javax.swing.JLabel;
import java.awt.Dimension;

public class StudentForm extends JFrame
{
   public StudentForm()
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
       // sidebar
       JPanel sidebar = new JPanel();
       sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       sidebar.setLayout(new BoxLayout(sidebar, BoxLayout.Y_AXIS));
       String[] btnTxts = {"Add", "Edit", "Delete", "Update"};
       sidebar.add(Box.createVerticalGlue());
       for (String text : btnTxts)
       {
           JButton btn = new JButton(text);
           btn.setMaximumSize(new Dimension(75, 40));
           sidebar.add(btn);
           sidebar.add(Box.createVerticalStrut(10));
           
       }
       sidebar.add(Box.createVerticalGlue());
       // form panel
       JPanel formPanel = new JPanel();
       formPanel.setLayout(new BoxLayout(formPanel, BoxLayout.Y_AXIS));
       sidebar.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
       // name pannel
       JPanel row1 = new JPanel();
       row1.setLayout(new BoxLayout(row1, BoxLayout.X_AXIS));
       row1.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblName  = new JLabel("Name:");
       lblName.setPreferredSize(new Dimension(75, 25)); // minimum size
       JTextField textName = new JTextField(15);
       textName.setMaximumSize(new Dimension(220, 25)); // set Maximum Size
       row1.add(lblName);
       row1.add(Box.createHorizontalStrut(10));
       row1.add(textName);
       // gender panel 
    
       JPanel row2 = new JPanel();
       row2.setLayout(new BoxLayout(row2, BoxLayout.X_AXIS));
       row2.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblGender  = new JLabel("Gender:");
       lblGender.setPreferredSize(new Dimension(75, 25));
       ButtonGroup gender = new ButtonGroup();
       JRadioButton male  = new JRadioButton("Male");
       JRadioButton female  = new JRadioButton("Female");
       JRadioButton other = new JRadioButton("Other");
       gender.add(male);
       gender.add(female);
       gender.add(other);
       row2.add(lblGender);
       row2.add(Box.createVerticalStrut(10));
       row2.add(male);
       row2.add(Box.createVerticalStrut(10));
       row2.add(female);
       row2.add(Box.createVerticalStrut(10));
       row2.add(other);
       
       JPanel row3 = new JPanel();
       row3.setLayout(new BoxLayout(row3,BoxLayout.X_AXIS));
       row3.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblCourse = new JLabel("Course :");
       lblCourse.setPreferredSize(new Dimension(75, 25));
       String[] courseList= {"Computer Science", "Networking", "Ai"};
       JComboBox<String> CourseCombo = new JComboBox(courseList);
       CourseCombo.setMaximumSize(new Dimension(220, 25));
       row3.add(lblCourse);
       row3.add(Box.createHorizontalStrut(10));
       row3.add(CourseCombo);
       
       JPanel row4 = new JPanel();
       row4.setLayout(new BoxLayout(row4, BoxLayout.X_AXIS));
       row4.setAlignmentX(Component.LEFT_ALIGNMENT);
       JLabel lblHobbies  = new JLabel("Hobbies:");
       lblHobbies.setPreferredSize(new Dimension(75, 25));
       String[] HobbiesList= {"Reading", "Sport", "Sleeping"};
       ButtonGroup Hobbies = new ButtonGroup();
       JCheckBox Reading  = new JCheckBox("Reading");
       JCheckBox Sports  = new JCheckBox("Sports");
       JCheckBox Sleeping = new JCheckBox("Sleeping");
       Hobbies.add(Reading);
       Hobbies.add(Sports);
       Hobbies.add(Sleeping);
       row4.add(lblHobbies);
       row4.add(Box.createVerticalStrut(10));
       row4.add(Reading);
       row4.add(Box.createVerticalStrut(10));
       row4.add(Sports);
       row4.add(Box.createVerticalStrut(10));
       row4.add(Sleeping);
       
    
       formPanel.add(row1);
       formPanel.add(Box.createVerticalStrut(10));
       formPanel.add(row2);
       formPanel.add(Box.createVerticalStrut(10));
       formPanel.add(row3);
       formPanel.add(row4);
       add(titlePanel, BorderLayout.NORTH);
       add(sidebar, BorderLayout.WEST);
       add(formPanel, BorderLayout.CENTER);
       setVisible(true);
   }
   public static void main(String[] args)
   {
       SwingUtilities.invokeLater( () -> 
       {
           new StudentForm();
       });
   }
}