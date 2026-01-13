package Week10;


/**
 * Write a description of class ManagementStu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManagementStu extends Student
{
     public ManagementStu(int rollNo, String name, double marks)
  {
    super(rollNo, name, marks);
  }


  @Override
  public String calculateResult()
  {
    super.calculateResult();
    return getMarks() >= 45 ? "Pass (Management)" : "Fail (Management)";
  }

  
  public String calculateResult(int graceMarks)
  {
    double total = getMarks() + graceMarks;
    return total >= 45 ? "Pass with Grace (Management)" : "Fail (Management)";
  }
}