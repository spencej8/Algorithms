public class Executable extends LinkedList<StaffMember>
{
	public static final double RATE = 7, EXP = 5, SKIP = 3;
	public LinkedList<StaffMember> staffList = new LinkedList<StaffMember>();
	public static void main(String[] args) {
		Executable main = new Executable();
		TestData data = new TestData();
		main.getEventStaff(data.testEvent, data.testStaff);
	}

	//COMPLETE!
	public void getEventStaff(Event e, StaffMember[] staffList) { 
		LinkedList<StaffMember> waitersChosen = new LinkedList<StaffMember>();
		waitersChosen.addToHead(new StaffMember());
		LinkedList<StaffMember> bartendersChosen = new LinkedList<StaffMember>();
		bartendersChosen.addToHead(new StaffMember());
		LinkedList<StaffMember> cooksChosen = new LinkedList<StaffMember>();
		cooksChosen.addToHead(new StaffMember());
		LinkedList<StaffMember> assistantsChosen = new LinkedList<StaffMember>();
		assistantsChosen.addToHead(new StaffMember());
		
		for(StaffMember employee : staffList)
		{
			if(!employee.getIsSuspended())
			{
				//TODO: Replace constants with inputed weights
				calculateWeight(employee, RATE, EXP, SKIP);
				if(employee.getRequestedEvent() || isAvailable(e, employee))
				{
					if(employee.getPosition(StaffMember.WAITER))
					{
						insertMember(waitersChosen, employee, waitersChosen.size, e.getNumOfServersNeeded());
					}
					else if(employee.getPosition(StaffMember.BARTENDER))
					{
						this.insertMember(bartendersChosen, employee, bartendersChosen.size, e.getNumOfBartendersNeeded());
					}
					else if(employee.getPosition(StaffMember.COOK))
					{
						this.insertMember(cooksChosen, employee, cooksChosen.size, e.getNumOfCooksNeeded());
					}
					else
					{
						this.insertMember(assistantsChosen, employee, assistantsChosen.size, e.getNumOfServerAssistantsNeeded());
					}
				}
			}
		}
		System.out.println("Done");
	}

	// COMPLETE!
	public void insertMember(LinkedList<StaffMember> list, StaffMember s, int listLength, int requiredStaff) {
		Node temp = list.getHead();
		if (isPreferred(s, temp.element)) {
			while (temp.next != null && isPreferred(s, temp.next.element)) {
				temp = temp.next;
			}
			//need to increment in getEventStaff
			if (list.getSize() < listLength) {
				s = temp.next.element; 
			}
		}
		
	}

	// COMPLETE!
	public double calculateWeight(StaffMember s, double rateValue, double expValue, double skipValue) {
		double newWeight = (s.getRating() * rateValue) + (s.getExperience() * expValue) + (s.getConsecutiveSkips() * skipValue);
		s.setWeight(newWeight);
		return s.getWeight();
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
