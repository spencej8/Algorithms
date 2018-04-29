public class Executable extends LinkedList<StaffMember>
{
	public static final double RATE = 7, EXP = 5, SKIP = 3;
	LinkedList<StaffMember> waitersChosen = new LinkedList<StaffMember>();
	LinkedList<StaffMember> bartendersChosen = new LinkedList<StaffMember>();
	LinkedList<StaffMember> cooksChosen = new LinkedList<StaffMember>();
	LinkedList<StaffMember> assistantsChosen = new LinkedList<StaffMember>();
	static int numWaiters = 0;
	static int numBartenders = 0;
	static int numCooks = 0;
	static int numAssistants = 0;
	
	public static void main(String[] args) {
		Executable main = new Executable();
		TestData data = new TestData();
		main.getEventStaff(data.testEvent, data.testStaff);
	}

	//COMPLETE!
	public void getEventStaff(Event e, StaffMember[] staffList) { 
		waitersChosen.addToHead(new StaffMember());
		bartendersChosen.addToHead(new StaffMember());
		cooksChosen.addToHead(new StaffMember());
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
						numWaiters++;
					}
					else if(employee.getPosition(StaffMember.BARTENDER))
					{
						this.insertMember(bartendersChosen, employee, bartendersChosen.size, e.getNumOfBartendersNeeded());
						numBartenders++;
					}
					else if(employee.getPosition(StaffMember.COOK))
					{
						this.insertMember(cooksChosen, employee, cooksChosen.size, e.getNumOfCooksNeeded());
						numCooks++;
					}
					else
					{
						this.insertMember(assistantsChosen, employee, assistantsChosen.size, e.getNumOfServerAssistantsNeeded());
						numAssistants++;
					}
				}
			}
		}
		Node wnode = waitersChosen.getHead();
		Node bnode = bartendersChosen.getHead();
		Node cnode = cooksChosen.getHead();
		Node anode = assistantsChosen.getHead();
		System.out.println("Waiters: ");
		for(int i = 0; i < numWaiters; i++)
		{
			if(wnode.next != null)
			{
				System.out.println(wnode.next.element);
				wnode = wnode.next;
			}
		}
		System.out.println("Bartenders: ");
		for(int i = 0; i < numBartenders; i++)
		{
			if(bnode.next != null)
			{
				System.out.println(bnode.next.element);
				bnode = bnode.next;
			}
		}
		System.out.println("Cooks: ");
		for(int i = 0; i < numCooks; i++)
		{
			if(cnode.next != null)
			{
				System.out.println(cnode.next.element);
				cnode = cnode.next;
			}
		}
		System.out.println("Assistants: ");
		for(int i = 0; i < numAssistants; i++)
		{
			if(anode.next != null)
			{
				System.out.println(anode.next.element);
				anode = anode.next;
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
			if(temp.next != null)
			{
				Node toAdd = new Node(s, temp.next);
				temp.next = toAdd;
			}
			else
			{
				Node toAdd = new Node(s, null);
				temp.next = toAdd;
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
