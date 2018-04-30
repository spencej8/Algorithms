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
		StaffMember[] inTestStaff = { new StaffMember(10, inPosition, inLocations, inTimeSlots, false, 0, false, 50, 5), 
				new StaffMember(10, inPosition1, inLocations, inTimeSlots, false, 0, false, 50000, 5), 
				new StaffMember(10, inPosition2, inLocations, inTimeSlots, false, 0, false, 5000, 5),
				new StaffMember(10, inPosition3, inLocations, inTimeSlots, false, 0, false, 500, 5)};
		
		//20 person test
		//16 people needed
		//all 20 requested and available
		//4 of each position needed, 5 of each position in list
		StaffMember[] testStaff2 = { new StaffMember(5, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(15, inPosition, inLocations, inTimeSlots, true, 0, false, 1, 5),
				new StaffMember(25, inPosition, inLocations, inTimeSlots, true, 0, false, 3, 4),
				new StaffMember(35, inPosition, inLocations, inTimeSlots, true, 0, false, 4, 1),
				new StaffMember(45, inPosition, inLocations, inTimeSlots, true, 0, false, 4, 2),
				new StaffMember(6, inPosition1, inLocations, inTimeSlots, true, 0, false, 2, 5),
				new StaffMember(16, inPosition1, inLocations, inTimeSlots, true, 0, false, 3, 2),
				new StaffMember(26, inPosition1, inLocations, inTimeSlots, true, 0, false, 3, 4),
				new StaffMember(36, inPosition1, inLocations, inTimeSlots, true, 0, false, 4, 2),
				new StaffMember(46, inPosition1, inLocations, inTimeSlots, true, 0, false, 1, 1),
				new StaffMember(7, inPosition2, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(17, inPosition2, inLocations, inTimeSlots, true, 0, false, 5, 3),
				new StaffMember(27, inPosition2, inLocations, inTimeSlots, true, 0, false, 3, 3),
				new StaffMember(37, inPosition2, inLocations, inTimeSlots, true, 0, false, 2, 2),
				new StaffMember(47, inPosition2, inLocations, inTimeSlots, true, 0, false, 3, 3),
				new StaffMember(8, inPosition3, inLocations, inTimeSlots, true, 0, false, 3, 4),
				new StaffMember(18, inPosition3, inLocations, inTimeSlots, true, 0, false, 4, 5),
				new StaffMember(28, inPosition3, inLocations, inTimeSlots, true, 0, false, 2, 5),
				new StaffMember(38, inPosition3, inLocations, inTimeSlots, true, 0, false, 4, 1),
				new StaffMember(48, inPosition3, inLocations, inTimeSlots, true, 0, false, 1, 5)};
		
		//5 person test
		//0 people needed
		StaffMember[] testStaff3 = { new StaffMember(1, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
				new StaffMember(2, inPosition1, inLocations, inTimeSlots, true, 0, false, 50, 5),
				new StaffMember(3, inPosition2, inLocations, inTimeSlots, true, 0, false, 501, 5),
				new StaffMember(4, inPosition3, inLocations, inTimeSlots, true, 0, false, 25, 5),
				new StaffMember(5, inPosition1, inLocations, inTimeSlots, true, 0, false, 5, 5)};
		
		//10 person test
		//need ten waiters
		//all different weights
		StaffMember[] testStaff4 = { new StaffMember(5, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
		new StaffMember(15, inPosition, inLocations, inTimeSlots, true, 0, false, 50, 5),
		new StaffMember(25, inPosition, inLocations, inTimeSlots, true, 0, false, 501, 5),
		new StaffMember(35, inPosition, inLocations, inTimeSlots, true, 0, false, 25, 5),
		new StaffMember(45, inPosition, inLocations, inTimeSlots, true, 0, false, 5, 5),
		new StaffMember(6, inPosition, inLocations, inTimeSlots, true, 0, false, 3, 5),
		new StaffMember(16, inPosition, inLocations, inTimeSlots, true, 0, false, 435, 5),
		new StaffMember(26, inPosition, inLocations, inTimeSlots, true, 0, false, 7, 5),
		new StaffMember(36, inPosition, inLocations, inTimeSlots, true, 0, false, 52, 5),
		new StaffMember(46, inPosition, inLocations, inTimeSlots, true, 0, false, 1, 5)};
		
		testStaff = testStaff2;
		testEvent = new Event(timeSlot, "Oxford", 3, 3, 3, 3);
		
	}
}
