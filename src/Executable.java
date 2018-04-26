public class Executable 
{
	
	public static void main(String[] args) {
		// Implement here.
	}

	public void getEventStaff(Event e, StaffList sl) { 
		// Implement here.
	}

	public void insertMember(LinkedList<staffMember> list, StaffMember s, int length, int required) {
		StaffMember temp = list.peek();
		int location;
		for (int i = 0; i < list.size(); i++) {
			if (isPreferred(s, list[i++])) {
				location++;
			}
		}
	}
	
	// COMPLETE!
	public boolean isAvailable(Event e, StaffMember s) {
		if (!s.isSuspended) {
			if (s.getAvailableTimeSlots(e.getTimeOfEvent()) == true) {
				if (s.getLocationsAbleToWork(e.location) == true)
					return true;
				else
					return false;
			}
			else
				return false;
		}
		else
			return false;
	}

	// COMPLETE!
	public boolean isPreferred(StaffMember a, StaffMember b) {
		if (a.getWeight() > b.getWeight())
			return true;
		else if (a.getWeight() == b.getWeight()) {
			if (a.getRequestedEvent() == true && b.getRequestedEvent() == false)
				return true;
			else if (a.getRequestedEvent() == false && b.getRequestedEvent() == true)
				return false;
			else 
				return getRandom(); // This calculates the chances of person A getting the job. 1 = A, any other number = B
		} 
		else
			return false;	
	}

	// COMPLETE!
	public boolean getRandom() {
		int temp = (int)(Math.random() * 2 + 1);
		if (temp == 1)
			return true;
		else
			return false;
	}

}
