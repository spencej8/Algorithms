import java.util.Date;

public class Event 
{
	private Date timeOfEvent;
	private String location;
	private int numOfBartendersNeeded;
	private int numOfServersNeeded;
	private int numOfServerAssistantsNeeded;
	private int numOfCooksNeeded;
	
	public Event(Date timeOfEvent, String location, int numOfBartendersNeeded, 
		int numOfServersNeeded, int numOfServerAssistantsNeeded, int numOfCooksNeeded) {
		this.timeOfEvent = timeOfEvent;
		this.location = location;
		this.numOfBartendersNeeded = numOfBartendersNeeded;
		this.numOfServersNeeded = numOfServersNeeded;
		this.numOfServerAssistantsNeeded = numOfServerAssistantsNeeded;
		this.numOfCooksNeeded = numOfCooksNeeded;
	}

	public Date getTimeOfEvent() {
		return timeOfEvent;
	}

	public String getLocation() {
		return location;
	}

	public int getNumOfBartendersNeeded() {
		return numOfBartendersNeeded;
	}

	public int getNumOfServersNeeded() {
		return numOfServersNeeded;
	}

	public int getNumOfServerAssistantsNeeded() {
		return numOfServerAssistantsNeeded;
	}

	public int getNumOfCooksNeeded() {
		return numOfCooksNeeded;
	}

}
