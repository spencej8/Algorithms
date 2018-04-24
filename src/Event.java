import java.util.Date;

public class Event 
{
	public Date timeOfEvent;
	public String location;
	public int numOfBartendersNeeded;
	public int numOfServersNeeded;
	public int numOfServerAssistantsNeeded;
	public int numOfCooksNeeded;
	
	public Event(Date timeOfEvent, String location, int numOfBartendersNeeded, int numOfServersNeeded, 
			int numOfServerAssistantsNeeded, int numOfCooksNeeded) {
		this.timeOfEvent = timeOfEvent;
		this.location = location;
		this.numOfBartendersNeeded = numOfBartendersNeeded;
		this.numOfServersNeeded = numOfServersNeeded;
		this.numOfServerAssistantsNeeded = numOfServerAssistantsNeeded;
		this.numOfCooksNeeded = numOfCooksNeeded;
	}

}
