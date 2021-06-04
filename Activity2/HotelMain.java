import java.util.*;
class HotelRoom
{
    protected String hotelName;
    protected int numberOfSqFeet;
    protected boolean hasTV;
    protected boolean hasWifi;
    HotelRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi)
    {
        this.hotelName = hotelName;
        this.numberOfSqFeet = numberOfSqFeet;
        this.hasTV = hasTV;
        this.hasWifi = hasWifi;
    }
    public void calculateTariff()
    {
        System.out.println();
    }
    public int getRatePerSqFeet()
    {
        return 0;
    }
}
class DeluxeRoom extends HotelRoom
{
    protected int ratePerSqFeet;
    DeluxeRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
    {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet = 10;
    }
    public int getRatePerSqFeet()
    {
        if(this.hasWifi == true)
        {
            return ratePerSqFeet + 2;
        }
        return ratePerSqFeet;
    }
    public void calculateTariff()
    {
        System.out.println("Room Tariff per day is: " + (super.numberOfSqFeet)*(getRatePerSqFeet()));
    }
}
class DeluxeACRoom extends DeluxeRoom
{
    DeluxeACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
    {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        super.ratePerSqFeet = 12;
    }
    public int getRatePerSqFeet()
    {
        if(this.hasWifi == true)
        {
            return ratePerSqFeet + 2;
        }
        return ratePerSqFeet;
    }
    public void calculateTariff()
    {
        System.out.println("Room Tariff per day is: " + (super.numberOfSqFeet)*(getRatePerSqFeet()));
    }
}
class SuiteACRoom extends HotelRoom
{
    protected int ratePerSqFeet;
    SuiteACRoom(String hotelName, int numberOfSqFeet, boolean hasTV, boolean hasWifi) 
    {
        super(hotelName, numberOfSqFeet, hasTV, hasWifi);
        ratePerSqFeet = 15;
    }
    public int getRatePerSqFeet()
    {
        if(this.hasWifi == true)
        {
            return ratePerSqFeet + 2;
        }
        return ratePerSqFeet;
    }
    public void calculateTariff()
    {
        System.out.println("Room Tariff per day is: " + (super.numberOfSqFeet)*(getRatePerSqFeet()));
    }
}
public class HotelMain 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Deluxe Room");
        System.out.println("Press 2 for Deluxe AC Room");
        System.out.println("Press 3 for Suite AC Room");
        System.out.println("Enter your choice");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println("Enter Hotel Name");
            String hotelName = sc.next();
            System.out.println("Enter Number Of Sq Feet");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("Room has TV (true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("Room has WiFi (true/false)");
            boolean hasWifi = sc.nextBoolean();
            DeluxeRoom object = new DeluxeRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            object.calculateTariff();
        }
        else if(choice == 2)
        {
            System.out.println("Enter Hotel Name");
            String hotelName = sc.next();
            System.out.println("Enter Number Of Sq Feet");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("Room has TV (true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("Room has WiFi (true/false)");
            boolean hasWifi = sc.nextBoolean();
            DeluxeACRoom object = new DeluxeACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            object.calculateTariff();
        }
        else
        {
            System.out.println("Enter Hotel Name");
            String hotelName = sc.next();
            System.out.println("Enter Number Of Sq Feet");
            int numberOfSqFeet = sc.nextInt();
            System.out.println("Room has TV (true/false)");
            boolean hasTV = sc.nextBoolean();
            System.out.println("Room has WiFi (true/false)");
            boolean hasWifi = sc.nextBoolean();
            SuiteACRoom object = new SuiteACRoom(hotelName, numberOfSqFeet, hasTV, hasWifi);
            object.calculateTariff();
        }
        sc.close();
    }
}