package com;

public class TestDriver {
	
	
	
	public static void main(String []args) {
		Driver[] driverList  = new Driver[4];
		
		driverList[0] = new Driver(1,"Saudhager","Car", 17000);
		driverList[1] = new Driver(2 , "Ram" , "Auto" , 12000);
		driverList[2] = new Driver(3, "Krishna" , "car" , 21000);
		driverList[3] = new Driver(4,"Jhon" , "Lorry" , 35000);
		
		Travel travel = new Travel();
		
		System.out.println(travel.isCarDriver(driverList[0]));
		
		System.out.println(travel.retrivebyDerivedId(driverList, 4));
		
		System.out.println("Count of Drivers of Given Category : "+travel.retriveCountofDriver(driverList, "car"));
		
		Driver[] carDrivers = travel.retriveDriver(driverList, "Car");
		System.out.print("Car Drivers  are : ");
		
		for(int i=0; i<carDrivers.length; ++i) {
			System.out.println(carDrivers[i].getName() + " - " + carDrivers[i].getDistance());
			
		}
		
		Driver maxDriver = travel.RetriveMaximumDistanceTravelledDriver(driverList);
		System.out.println("Driver travlled max distance is " + maxDriver.getName() + "(" + maxDriver.getDistance() + " Kms) ");
		
		
		
	}

}
