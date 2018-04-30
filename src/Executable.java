public class Executable extends LinkedList<StaffMember>
{
	public static final double RATE = 7, EXP = 5, SKIP = 3; // These are arbitrary numbers
	LinkedList<StaffMember> waitersChosen = new LinkedList<StaffMember>();
	LinkedList<StaffMember> bartendersChosen = new LinkedList<StaffMember>();
	LinkedList<StaffMember> cooksChosen = new LinkedList<StaffMember>();
	LinkedList<StaffMember> assistantsChosen = new LinkedList<StaffMember>();
	
	public static void main(String[] args) {
		Executable main = new Executable();
		TestData data = new TestData();
		main.getEventStaff(data.testEvent, data.testStaff);
	}

	//Adds all necessary event staff
	public void getEventStaff(Event e, StaffMember[] staffList) { 
		waitersChosen.addToHead(new StaffMember());
		bartendersChosen.addToHead(new StaffMember());
		cooksChosen.addToHead(new StaffMember());
		assistantsChosen.addToHead(new StaffMember());
		
		for(StaffMember employee : staffList)
		{
			if(!employee.getIsSuspended())
			{
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
		System.out.println("WAITERS");
		System.out.println(waitersChosen.toString() + "\n");
		System.out.println("BARTENDERS");
		System.out.println(bartendersChosen.toString()+ "\n");
		System.out.println("COOKS");
		System.out.println(cooksChosen.toString()+ "\n");
		System.out.println("ASSISTANTS");
		System.out.println(assistantsChosen.toString()+ "\n");
	}

	// Insert a single staff member into a list of staff members
	public void insertMember(LinkedList<StaffMember> list, StaffMember s, int listLength, int requiredStaff) {
		Node temp = list.getHead();
		if (isPreferred(s, temp.element)) {
			while (temp.next != null && isPreferred(s, temp.next.element)) {
				temp = temp.next;
			}
			if(temp.next != null)
			{
				Node toAdd = new Node(s, temp.next);
				temp.next = toAdd;
				list.size++;
			}
			else
			{
				Node toAdd = new Node(s, null);
				temp.next = toAdd;
				list.size++;
			}
			if (list.size > requiredStaff) {
				list.removeHead();
			}
		}
	}

	// Calculate the weight of the given staff member
	public double calculateWeight(StaffMember s, double rateValue, double expValue, double skipValue) {
		double newWeight = (s.getRating() * rateValue) + (s.getExperience() * expValue) + (s.getConsecutiveSkips() * skipValue);
		s.setWeight(newWeight);
		return s.getWeight();
	}
	
	// Check availability of passed in staff member
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

	// Check to see if given staff member a is more heavily weighted than member b
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

	// Random bool generator
	public boolean getRandom() {
		int temp = (int)(Math.random() * 2 + 1);
		if (temp == 1)
			return true;
		else
			return false;
	}

}
