public class Executable extends LinkedList
{
	int size;
	
	LinkedList<StaffMember> staffList = new LinkedList<StaffMember>();
	
	public static void main(String[] args) {
		// Implement here.
	}

	public void getEventStaff(Event e, StaffMember[] staffList) { 
		
	}

	// COMPLETE!
	public void insertMember(LinkedList<StaffMember> list, StaffMember s, int length, int required) {
		Node temp = list.head;
		if (isPreferred(s, temp.element)) {
			while (temp.next != null && isPreferred(s, temp.next.element)) {
				temp = temp.next;
			}
			//need to increment in getEventStaff
			if (size < length) {
				s = temp.next.element; 
			}
		}
		
	}
	
	// COMPLETE!
	public boolean isAvailable(Event e, StaffMember s) {
		if (!s.getIsSuspended()) {
			if (s.getAvailableTimeSlots(e.getTimeOfEvent()) == true) {
				if (s.getLocationsAbleToWork(e.getLocation()) == true)
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
