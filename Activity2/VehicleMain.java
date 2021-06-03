import java.util.*;
class Vehicle
{
    protected String make;
    protected String vehicleNumber;
    protected String fuelType;
    protected int fuelCapacity;
    protected int cc;
    public Vehicle(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc)
    {
        this.make = make;
        this.vehicleNumber = vehicleNumber;
        this.fuelType = fuelType;
        this.fuelCapacity = fuelCapacity;
        this.cc = cc;
    }

    public void displayMake()
    {
        System.out.println("Maker of vehicle is: " + this.make);
    }

    public void displayBasicInfo()
    {
        displayMake();
        System.out.println("Vehicle Number is: " + this.vehicleNumber);
        System.out.println("Fuel Type is: " + this.fuelType);
        System.out.println("Fuel Capacity is: " + this.fuelCapacity);
        System.out.println("Vehicle cc is: " + this.cc);
    }

    public void displayDetailInfo()
    {

    }
}

class TwoWheeler extends Vehicle
{
    private boolean kickStartAvailable;
    public TwoWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) 
    {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
    }

    public void setKickStartAvailable(boolean kickStartAvailable)
    {
        this.kickStartAvailable = kickStartAvailable;
    }
    public boolean getKickStartAvailable()
    {
        return this.kickStartAvailable;
    }
    public void displayDetailInfo()
    {
        System.out.println("---Basic Information---");
        super.displayBasicInfo();
        System.out.println("---Detail Information---");
        System.out.println("Kick Start Available: " + kickStartAvailable);
    }
}

class FourWheeler extends Vehicle
{
    private String audioSystem;
    private int numberOfDoors;
    public FourWheeler(String make, String vehicleNumber, String fuelType, int fuelCapacity, int cc) 
    {
        super(make, vehicleNumber, fuelType, fuelCapacity, cc);
    }

    public void setAudioSystem(String audioSystem)
    {
        this.audioSystem = audioSystem;
    }
    public String getAudioSystem()
    {
        return this.audioSystem;
    }

    public void setnumberOfDoors(int numberOfDoors)
    {
        this.numberOfDoors = numberOfDoors;
    }
    public int getNumberOfDoors()
    {
        return this.numberOfDoors;
    }

    public void displayDetailInfo()
    {
        System.out.println("---Basic Information---");
        super.displayBasicInfo();
        System.out.println("---Detail Information---");
        System.out.println("Audio System: " + this.getAudioSystem());
        System.out.println("Number of Doors: " + this.getNumberOfDoors());
    }
}
public class VehicleMain 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Press 1 for Four Wheeler");
        System.out.println("Press 2 for Two Wheeler");
        System.out.println("Enter your choice: ");
        int choice = sc.nextInt();
        if(choice == 1)
        {
            System.out.println("Enter Maker of Vehicle: ");
            String make = sc.next();
            System.out.println("Enter Vehicle Number: ");
            String vehicleNumber = sc.next();
            System.out.println("Enter Fuel Type: ");
            String fuelType = sc.next();
            System.out.println("Enter Fuel Capacity: ");
            int fuelCapacity = sc.nextInt();
            System.out.println("Enter cc of Vehicle: ");
            int cc = sc.nextInt();
            System.out.println("Enter Audio System ");
            String audioSystem = sc.next();
            System.out.println("Enter Number of Doors: ");
            int numberOfDoors = sc.nextInt();
            FourWheeler object = new FourWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc);
            object.setAudioSystem(audioSystem);
            object.setnumberOfDoors(numberOfDoors);
            object.displayDetailInfo();
        }
        else
        {
            System.out.println("Enter Maker of Vehicle: ");
            String make = sc.next();
            System.out.println("Enter Vehicle Number: ");
            String vehicleNumber = sc.next();
            System.out.println("Enter Fuel Type: ");
            String fuelType = sc.next();
            System.out.println("Enter Fuel Capacity: ");
            int fuelCapacity = sc.nextInt();
            System.out.println("Enter cc of Vehicle: ");
            int cc = sc.nextInt();
            System.out.println("Kick Start Available: ");
            boolean kickStartAvailable = sc.nextBoolean();
            TwoWheeler object = new TwoWheeler(make, vehicleNumber, fuelType, fuelCapacity, cc);
            object.setKickStartAvailable(kickStartAvailable);
            object.displayDetailInfo();
        }
        sc.close();
    }
}
