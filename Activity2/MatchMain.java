import java.util.*;
abstract class Match
{
    private int currentscore;
    private int currentover;
    private int target;
    public void setCurrentScore(int currentscore)
    {
        this.currentscore = currentscore;
    }
    public int getCurrentScore()
    {
        return this.currentscore;
    }
    public void setCurrentOver(int currentover)
    {
        this.currentover = currentover;
    }
    public int getCurrentOver()
    {
        return this.currentover;
    }
    public void setTarget(int target)
    {
        this.target = target;
    }
    public int getTarget()
    {
        return this.target;
    }
    abstract public float calculateRunRate();
    abstract public int calculateBalls();
    abstract public void display();
}
class  ODIMatch extends Match
{
    float runrate;
    int noofballs;
    ODIMatch(int currentscore, int currentover, int target)
    {
        super.setCurrentScore(currentscore);
        super.setCurrentOver(currentover);
        super.setTarget(target);
    }
    public float calculateRunRate()
    {
        runrate = (float)(super.getTarget() - super.getCurrentScore())/(50 - super.getCurrentOver());
        return runrate;
    }
    public int calculateBalls()
    {
        noofballs = (50 - super.getCurrentOver())*6;
        return noofballs;
    }
    public void display()
    {
        System.out.println("Need " + (super.getTarget() - super.getCurrentScore()) + " " + "runs in " + noofballs + " balls to win");
        System.out.println("Required Runrate: " + runrate);
    }
}
class  TestMatch extends Match
{
    float runrate;
    int noofballs;
    TestMatch(int currentscore, int currentover, int target)
    {
        super.setCurrentScore(currentscore);
        super.setCurrentOver(currentover);
        super.setTarget(target);
    }
    public float calculateRunRate()
    {
        runrate = (float)(super.getTarget() - super.getCurrentScore())/(90 - super.getCurrentOver());
        return runrate;
    }
    public int calculateBalls()
    {
        noofballs = (90 - super.getCurrentOver())*6;
        return noofballs;
    }
    public void display()
    {
        System.out.println("Need " + (super.getTarget() - super.getCurrentScore()) + " " + "runs in " + noofballs + " balls to win");
        System.out.println("Required Runrate: " + runrate);
    }
}
class  T20Match extends Match
{
    float runrate;
    int noofballs;
    T20Match(int currentscore, int currentover, int target)
    {
        super.setCurrentScore(currentscore);
        super.setCurrentOver(currentover);
        super.setTarget(target);
    }
    public float calculateRunRate()
    {
        runrate = (float)(super.getTarget() - super.getCurrentScore())/(20 - super.getCurrentOver());
        return runrate;
    }
    public int calculateBalls()
    {
        noofballs = (20 - super.getCurrentOver())*6;
        return noofballs;
    }
    public void display()
    {
        System.out.println("Need " + (super.getTarget() - super.getCurrentScore()) + " " + "runs in " + noofballs + " balls to win");
        System.out.println("Required Runrate: " + runrate);
    }
}
public class MatchMain 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type ODI for ODI match");
        System.out.println("Type T20 for T20 match");
        System.out.println("Type TEST for TEST match");
        System.out.println("Enter your choice");
        String choice = sc.next();
        if(choice.equals("ODI"))
        {
            System.out.println("Enter current score");
            int currentscore = sc.nextInt();
            System.out.println("Enter current over");
            int currentover = sc.nextInt();
            System.out.println("Enter target score");
            int target = sc.nextInt();
            ODIMatch object = new ODIMatch(currentscore, currentover, target);
            object.calculateRunRate();
            object.calculateBalls();
            object.display();
        }
        else if(choice.equals("T20"))
        {
            System.out.println("Enter current score");
            int currentscore = sc.nextInt();
            System.out.println("Enter current over");
            int currentover = sc.nextInt();
            System.out.println("Enter target score");
            int target = sc.nextInt();
            T20Match object = new T20Match(currentscore, currentover, target);
            object.calculateRunRate();
            object.calculateBalls();
            object.display();
        }
        else
        {
            System.out.println("Enter current score");
            int currentscore = sc.nextInt();
            System.out.println("Enter current over");
            int currentover = sc.nextInt();
            System.out.println("Enter target score");
            int target = sc.nextInt();
            TestMatch object = new TestMatch(currentscore, currentover, target);
            object.calculateRunRate();
            object.calculateBalls();
            object.display();
        }
        sc.close();
    }
}
