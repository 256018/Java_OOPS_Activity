import java.util.*;
class Customer
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
public class CustomerMain 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String name,address,mobile;
        Customer object = new Customer();
        System.out.println("Enter Name Enter Address Enter Mobile seprated by comma");
        String input = sc.nextLine();
        String[] arrOfStr = input.split(",");
        name = arrOfStr[0];
        address = arrOfStr[1];
        mobile = arrOfStr[2];
        object.setName(name);
        object.setAddress(address);
        object.setMobile(mobile);
        System.out.println("Customer Details");
        System.out.println("Name: "+ object.getName());
        System.out.println("Address: "+ object.getAddress());
        System.out.println("Mobile: "+ object.getMobile());
        sc.close();
    }
}
