package com;

public class Travel {
	
	
	
// 1)	We Need To Check Driver is belongs to Car Category or not
	public boolean isCarDriver(Driver driver) {
		return driver.getCategory().equalsIgnoreCase("Car");
	}
	
	
// 2)	We are getting driverId;

	public String retrivebyDerivedId(Driver[] drivers, int driverId) {
		for (int i = 0; i < drivers.length; ++i) {
			if (drivers[i].getId() == driverId) {
				return "Driver name is " + drivers[i].getName() + " Belonging to the Category " + drivers[i].getCategory()
						+ " traveled " + drivers[i].getDistance() + " Km so Far ";
			}
		}
		return "driver not available";
	}
	
	
// 3) WE are getting count of Driver
	public int retriveCountofDriver(Driver[]drivers , String category) {
		int count = 0;
		for(int i=0; i<drivers.length; ++i) {
			if(drivers[i].getCategory().equalsIgnoreCase(category)) {
				count++;
			}
			
		}
		return count;
		
	}
	
	
	
// 4)	We Are getting Driver
	
	public Driver[] retriveDriver(Driver[] drivers , String category) {
		int count =  retriveCountofDriver(drivers , category);
		Driver[] result  = new Driver[count];
		int index = 0;
		
		for(int i=0; i<drivers.length; ++i) {
			if(drivers[i].getCategory().equalsIgnoreCase(category)) {
				result[index]=drivers[i];
				index++;
			}
		}
		return result;
		
	}
	
	
	
	
	
	
	
// 5) We are Getting Maximum distance travelled by driver
	
	public Driver RetriveMaximumDistanceTravelledDriver(Driver[] drivers) {
		
		Driver maxDriver = drivers[0];
		
		for(int i=0; i<drivers.length; ++i) {
			if(drivers[i].getDistance() > maxDriver.getDistance()) {
				maxDriver = drivers[i];
			}
			
		}
		return maxDriver;
		
	}
	
	
	
	

}
