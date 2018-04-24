import java.util.Date;
import java.util.LinkedList;

public class StaffMember 
{
	public StaffMember(LinkedList<String> inPosition, LinkedList<String> inLocationsAbleToWork, 
			LinkedList<Date> inAvailableTimeSlots, boolean inIsRequested, int inConsecutiveSkips, 
			boolean inIsSuspended, int inRating, int inExperience)
	{
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
	public LinkedList<String> position;
	
	public LinkedList<String> locationsAbleToWork;
	
	public LinkedList<Date> availableTimeSlots;
	
	public boolean isRequested;
	
	public int consecutiveSkips;
	
	public boolean isSuspended;
	
	public int rating;
	
	public int experience;
	
	private double weight;
	
	public void setWeight()
	{
		this.weight = this.rating * 10 + this.experience * 7 + this.consecutiveSkips * 3;
	}
	
	public double getWeight()
	{
		return weight;
	}
}
