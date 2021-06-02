import java.util.*;
class EmployeeMain
{
    private String name;
    private String address;
    private String mobile;
    public void setName(String name)
    {
        this.name = name;
    }
    public String getName()
    {
        return name;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    public void setMobile(String mobile)
    {
        this.mobile = mobile;
    }
    public String getMobile()
    {
        return mobile;
    }
}
public class Activity1EmployeeMain
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        EmployeeMain object = new EmployeeMain();
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Address");
        String address=sc.nextLine();
        System.out.println("Enter Mobile");
        String mobile=sc.nextLine();
        object.setName(name);
        object.setAddress(address);
        object.setMobile(mobile);
        System.out.println("Employee Details");
        System.out.println("Name: "+ object.getName());
        System.out.println("Address: "+ object.getAddress());
        System.out.println("Mobile: "+ object.getMobile());
        sc.close();
    }
}