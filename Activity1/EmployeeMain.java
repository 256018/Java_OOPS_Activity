import java.util.*;
class Employee
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
    public void displayInfo()
    {
        System.out.println("Employee Details");
        System.out.println("Name: " + this.getName());
        System.out.println("Address: " + this.getAddress());
        System.out.println("Mobile: " + this.getMobile());
    }
}

public class EmployeeMain
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Employee object = new Employee();
        System.out.println("Enter Name");
        String name=sc.nextLine();
        System.out.println("Enter Address");
        String address=sc.nextLine();
        System.out.println("Enter Mobile");
        String mobile=sc.nextLine();
        object.setName(name);
        object.setAddress(address);
        object.setMobile(mobile);
        object.displayInfo();
        System.out.println("Verify and Update the details");
        while(true)
        {
            System.out.println("Press 1 To Update Employee Name");
            System.out.println("Press 2 To Update Employee Address");
            System.out.println("Press 3 To Update Employee Mobile");
            System.out.println("Press 4 To Show Details/Exit");
            System.out.println("Enter your choice");
            int choice = sc.nextInt();
            sc.nextLine();
            if(choice == 1)
            {
                System.out.println("Current Name is: " + object.getName());
                System.out.println("Enter new Name");
                object.setName(sc.nextLine());
            }
            if(choice == 2)
            {
                System.out.println("Current Address is: " + object.getAddress());
                System.out.println("Enter new Address");
                object.setAddress(sc.nextLine());
            }
            if(choice == 3)
            {
                System.out.println("Current Mobile is: " + object.getMobile());
                System.out.println("Enter new Mobile");
                object.setMobile(sc.nextLine());
            }
            if(choice == 4)
            {
                object.displayInfo();
                break;
            }
        }
        sc.close();
    }
}