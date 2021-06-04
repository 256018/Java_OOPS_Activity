**Question 1**
Create a class Vehicle 

Include the following protected data members / attributes:

make –of type String

vehicleNumber –of type String

fuelType –of type String

fuelCapacity -of type Integer

cc –of type Integer

Include the following public methods Create a constructor that initializes all the data members 

public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)

"displayMake" – Display the make of the vehicle.

"displayBasicInfo" –display basic information of the vehicle.

"displayDetailInfo" –An empty method.

Create a class TwoWheeler that extends Vehicle 

Include the following private attributes / data members:kickStartAvailable –of type Boolean.

Include the following public methods Include appropriate constructors."displayDetailInfo" –displays the availability of kick start.

Create a class FourWheelerthat extends Vehicle 

Include the following private attributes / data members:

audioSystem –of type String.

numberOfDoors –of type Integer.

Include the following public methodsInclude appropriate constructors.

"displayDetailInfo" -displays the audio system and number of doors.

Include getter setters for all the classes.

Create a main class to test the classes defined above.

**Sample Input Output 1:**

1.Four Wheeler

2.Two Wheeler

Enter Vehicle 

Type:1

Vehicle Make:Volvo

Vehicle Number:TN01BR9689

Fuel Type:

1.Petrol

2.Diesel

Fuel Capacity:40

Engine CC:1960

Audio System:Beats

Number of Doors:5

**Volvo**

---Basic Information---

Vehicle Number:TN01BR9689

Fuel Capacity:40

Fuel Type:Diesel

CC:1960

---Detail Information---

Audio System:Beats

Number of Doors:5
