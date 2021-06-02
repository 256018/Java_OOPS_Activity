import java.util.*;
class Company
{
    private String name;
    private String employees;
    private String teamlead;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setEmployees(String employess)
    {
        this.employees = employess;
    }
    public String getEmployees()
    {
        return employees;
    }
    public void setTeamLead(String teamlead)
    {
        this.teamlead = teamlead;
    }
    public String getTeamLead()
    {
        return teamlead;
    }
}
public class CompanyMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Company object = new Company();
        System.out.println("Enter Company Name");
        String name = sc.nextLine();
        System.out.println("Enter Employees Name seprated by commas");
        String employees = sc.nextLine();
        System.out.println("Enter Team Lead Name");
        String teamlead = sc.nextLine();
        object.setName(name);
        object.setEmployees(employees);
        object.setTeamLead(teamlead);
        System.out.println("Company Details");
        System.out.println("Name: "+ object.getName());
        System.out.println("Employees: "+ object.getEmployees());
        System.out.println("Team Lead: "+ object.getTeamLead());
        sc.close();
    }
}
