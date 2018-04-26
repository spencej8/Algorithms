import java.util.Date;

public class StaffMember 
{
	private int employeeID;
	private String[] position;
	private String[] locationsAbleToWork;
	private Date[] availableTimeSlots;
	private boolean requestedEvent;
	private int consecutiveSkips;
	private boolean isSuspended;
	private int rating;
	private int experience;
	private double weight;
	
	public StaffMember(int employeeID, String[] position, String[] locationsAbleToWork, 
			Date[] availableTimeSlots, boolean requestedEvent, int consecutiveSkips, 
			boolean isSuspended, int rating, int experience) {	
		this.employeeID = employeeID;
		this.position = position;
		this.locationsAbleToWork = locationsAbleToWork;
		this.availableTimeSlots = availableTimeSlots;
		this.requestedEvent = requestedEvent;
		this.consecutiveSkips = consecutiveSkips;
		this.isSuspended = isSuspended;
		this.rating = rating;
		this.experience = experience;
		this.setWeight();
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public boolean getPosition(String pos) {
		pos.trim(); pos.toLowerCase();
		for (String x : position) {
			if (x.equals(pos)) 
				return true;
		}
		return false;
	}

	public boolean getLocationsAbleToWork(String loc) {
		loc.trim(); loc.toLowerCase();
		for (String x : locationsAbleToWork) {
			if (x.equals(loc))
				return true;
		}
		return false;
	}

	public boolean getAvailableTimeSlots(Date eventDate) {
		for (Date x : availableTimeSlots) {
			if (x == eventDate)
				return true;
		}
		return false;
	}

	public boolean getRequestedEvent() {
		return requestedEvent;
	}

	public int getConsecutiveSkips() {
		return consecutiveSkips;
	}

	public boolean getIsSuspended() {
		return isSuspended;
	}

	public int getRating() {
		return rating;
	}

	public int getExperience() {
		return experience;
	}

	private double setWeight() {
		return this.weight = (this.rating * 10) + (this.experience * 7) + (this.consecutiveSkips * 3);
	}
	
	public double getWeight() {
		return setWeight();
	}

}
