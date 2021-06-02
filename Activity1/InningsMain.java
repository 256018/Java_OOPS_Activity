import java.util.*;
class Innings
{
    private String teamname;
    private String inningsname;
    private int run;
    public void setTeamName(String teamname)
    {
        this.teamname = teamname;
    }
    public String getTeamName()
    {
        return teamname;
    }
    public void setInningsName(String inningsname)
    {
        this.inningsname = inningsname;
    }
    public String getInningsName()
    {
        return inningsname;
    }
    public void setRun(int run)
    {
        this.run = run;
    }
    public int getRun()
    {
        return run;
    }
    public void displayInningsDetails()
    {
        System.out.println("Name: " + this.getTeamName());
        System.out.println("Scored: " + this.getRun());
        System.out.println(this.getInningsName());
        if(this.inningsname.equals("First"))
        {
            run =run+1;
            System.out.println("Need "+ run +" to win");
        }
        else
        {
            System.out.println("Match ended");
        }
    }
}
public class InningsMain 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        Innings object = new Innings();
        System.out.println("Enter Team Name");
        String teamname=sc.nextLine();
        System.out.println("Enter Innings Name");
        String inningsname=sc.nextLine();
        System.out.println("Enter Run");
        int run=sc.nextInt();
        object.setTeamName(teamname);
        object.setInningsName(inningsname);
        object.setRun(run);
        object.displayInningsDetails();
        sc.close();
    }
}
