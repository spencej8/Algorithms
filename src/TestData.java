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
		Date timeSlot = new Date();
		Date[] inTimeSlots = { timeSlot };
		//Easy 4 person test
		StaffMember[] inTestStaff = { new StaffMember(10, inPosition, inLocations, inTimeSlots, false, 0, false, 5, 5), 
				new StaffMember(10, inPosition1, inLocations, inTimeSlots, false, 0, false, 5, 5), 
				new StaffMember(10, inPosition2, inLocations, inTimeSlots, false, 0, false, 5, 5),
				new StaffMember(10, inPosition3, inLocations, inTimeSlots, false, 0, false, 5, 5)};
		
		//20 person test
		//16 people needed
		//all 20 requested and available
		//4 of each position needed, 5 of each position in list
		StaffMember[] testStaff2 = { new StaffMember(5, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(15, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(25, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(35, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(45, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(6, inPosition1, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(16, inPosition1, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(26, inPosition1, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(36, inPosition1, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(46, inPosition1, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(7, inPosition2, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(17, inPosition2, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(27, inPosition2, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(37, inPosition2, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(47, inPosition2, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(8, inPosition3, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(18, inPosition3, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(28, inPosition3, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(38, inPosition3, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(48, inPosition3, inLocations, inTimeSlots, true, 0, false, 5, 5)};
		
		testStaff = testStaff2;
		testEvent = new Event(timeSlot, "Oxford", 4, 4, 4, 4);
	}
}
