package Week10;


/**
 * Write a description of class ScienceStu here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ScienceStu extends Student
{
    public ScienceStu(int rollNo, String name, double marks) 
{
    super(rollNo, name, marks);
}

    @Override
    public String calculateResult()
{
    String baseResult = super.calculateResult();
    return getMarks() >= 50 ? "Pass (Science)" : "Fail (Science)";
}

    public String calculateResult(int graceMarks) 
{
    double total = getMarks() + graceMarks;
    return total >= 50 ? "Pass with Grace (Science)" : "Fail (Science)";
}
}