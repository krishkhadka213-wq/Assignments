package Week7;


/**
 * Write a description of class Result here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Result
{
    int Subject1;
    int Subject2;
    int Subject3;

    public Result(int s1, int s2, int s3)
    {
        this.Subject1 = s1;
        this.Subject2 = s2;
        this.Subject3 = s3;
    }

    public int calculateTotal()
    {
        return Subject1 + Subject2 + Subject3;
    }

    public double calculatePercentage()
    {
        int total = calculateTotal();
        return (total / 300.0) * 100;
    }

    public void displayResult()
    {
        System.out.println("Marks: Subject1 = " + Subject1 + ", Subject2 = " + Subject2 + ", Subject3 = " + Subject3);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Percentage: " + calculatePercentage());
    }
}