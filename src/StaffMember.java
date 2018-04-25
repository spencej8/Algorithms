import java.util.Date;

public class StaffMember 
{
	public int employeeID;
	public String[] position;
	public String[] locationsAbleToWork;
	public Date[] availableTimeSlots;
	public boolean requestedEvent;
	public int consecutiveSkips;
	public boolean isSuspended;
	public int rating;
	public int experience;
	private double weight;
	
	public StaffMember(int employeeID, String[] inPosition, String[] inLocationsAbleToWork, 
			Date[] inAvailableTimeSlots, boolean inIsRequested, int inConsecutiveSkips, 
			boolean inIsSuspended, int inRating, int inExperience) {	
		this.employeeID = employeeID;
		position = inPosition;
		locationsAbleToWork = inLocationsAbleToWork;
		availableTimeSlots = inAvailableTimeSlots;
		isRequested = inIsRequested;
		consecutiveSkips = inConsecutiveSkips;
		isSuspended = inIsSuspended;
		rating = inRating;
		experience = inExperience;
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
