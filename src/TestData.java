import java.util.Date;

public class TestData 
{
	public StaffMember[] testStaff;
	public Event testEvent;
	Date timeSlot = new Date();
	Date timeSlot2 = new Date();
	Date timeSlot3 = new Date();
	Date timeSlot4 = new Date();
	public TestData()
	{
		employeeGenerator(500);
		testEvent = new Event(timeSlot, "Oxford", 4, 4, 4, 4);
		
	}
	
	public void employeeGenerator(int numWanted) {
		StaffMember[] list = new StaffMember[numWanted];
		for(int i = 0; i < numWanted; i++) {
			list[i] = new StaffMember(i, getPositions(), getLocations(), getTimeSlots(), true, getNumSkips(), false, getRating(), getExperience());
		}
		testStaff = list;
	}
	
	public String[] getPositions() {
		String[] positions = { "Waiter", "Bartender", "Cook", "Assistant" };
		int numPositions = 1 + (int)(Math.random() * ((4-1) + 1));
		String[] result = new String[numPositions];
		for(int i = 0; i < numPositions; i++) {
			int position = 1 + (int)(Math.random() * ((numPositions-1) + 1));
			result[i] = positions[position-1];
		}
		return result;
	}
	
	public String[] getLocations() {
		String[] locations = { "Oxford", "Cincinnatti", "Cleveland", "Columbus" };
		int numLocations = 1 + (int)(Math.random() * ((4-1) + 1));
		String[] result = new String[numLocations];
		for(int i = 0; i < numLocations; i++) {
			int location = 1 + (int)(Math.random() * ((numLocations-1) + 1));
			result[i] = locations[location-1];
		}
		return result;
	}
	
	public Date[] getTimeSlots() {
		Date[] timeSlots = {timeSlot, timeSlot2, timeSlot3, timeSlot4};
		int numTimeSlots = 1 + (int)(Math.random() * ((4-1) + 1));
		Date[] result = new Date[numTimeSlots];
		for(int i = 0; i < numTimeSlots; i++) {
			int timeSlot = 1 + (int)(Math.random() * ((numTimeSlots-1) + 1));
			result[i] = timeSlots[timeSlot-1];
		}
		return result;
	}
	
	public int getNumSkips() {
		int numSkips = 1 + (int)(Math.random() * ((10-1) + 1));
		return numSkips;
	}
	
	public int getRating() {
		int rating = 1 + (int)(Math.random() * ((5-1) + 1));
		return rating;
	}
	
	public int getExperience() {
		int experience = 1 + (int)(Math.random() * ((5-1) + 1));
		return experience;
	}
	
	
	
	
}
