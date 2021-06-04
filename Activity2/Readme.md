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


**Question 2**
Create a class HotelRoom 

Include the following protected data members / attributes:

hotelName –of type String

numberOfSqFeet –of type Integer

hasTV -of type Boolean

hasWifi –of type Boolean

Include the following public methods :Create a constructor that initializes all the data 

memberspublicHotelRoom(StringhotelName,IntegernumberOfSqFeet,BooleanhasTV,BooleanhasWifi)

"calculateTariff" –Calculates cost using the number of sq feets and cost per sq feet and returns an Integer.

"getRatePerSqFeet" -This method returns an Integer. In this case, it always returns 0 

Create a class DeluxeRoom that extends HotelRoom

Include the following protected attributes / data members:

ratePerSqFeet –of type Integer.

Include the following public methods :Include a constructor that sets ratePerSqFeet as 10.

publicHotelRoom(StringhotelName,IntegernumberOfSqFeet,BooleanhasTV,BooleanhasWifi)

"getRatePerSqFeet" –returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.

Create a class DeluxeACRoom that extends DeluxeRoom Include the following public methods :

Include a constructor that sets ratePerSqFeet as 12.

Create a class SuiteACRoom that extends HotelRoom Include the following private attributes / data members:

ratePerSqFeet –of type Integer.Include the following public methods :Include a constructor that sets ratePerSqFeet as 15.

publicHotelRoom(StringhotelName,IntegernumberOfSqFeet,BooleanhasTV,BooleanhasWifi)

getRatePerSqFeet –returns (ratePerSqFeet + 2) if wifi is present, else returns ratePerSqFeet.

Create a Main class to test the above classes.

**Sample Input Output 1:**

Hotel Tariff Calculator

1. Deluxe Room

2. Deluxe AC Room

3. Suite AC Room

Select Room Type:1

Hotel Name:Taj

Room Square Feet Area:3200

Room has TV (yes/no):yes

Room has Wifi (yes/no):yes

Room Tariff per day is:38400
