import java.util.Date;

public class TestData 
{
	public StaffMember[] testStaff;
	public Event testEvent;
	public TestData()
	{
		String[] inPosition = { StaffMember.WAITER };
		String[] inPosition1 = { StaffMember.BARTENDER };
		String[] inPosition2 = { StaffMember.ASSISTANT };
		String[] inPosition3 = { StaffMember.COOK };
		String[] inLocations = { "Oxford" };
		Date[] inTimeSlots = { new Date() };
		StaffMember[] inTestStaff = { new StaffMember(10, inPosition, inLocations, inTimeSlots, false, 0, false, 5, 5), 
				new StaffMember(10, inPosition1, inLocations, inTimeSlots, false, 0, false, 5, 5), 
				new StaffMember(10, inPosition2, inLocations, inTimeSlots, false, 0, false, 5, 5),
				new StaffMember(10, inPosition3, inLocations, inTimeSlots, false, 0, false, 5, 5)};
		testStaff = inTestStaff;
		testEvent = new Event(new Date(), "Oxford", 1, 1, 1, 1);
	}
}
