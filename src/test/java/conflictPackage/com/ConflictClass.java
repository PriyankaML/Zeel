package conflictPackage.com;

import org.testng.annotations.Test;

public class ConflictClass {
	
	@Test
	public void getConflictMethod()
	{
		System.out.println("Conflict NOT SOLVED");
		System.out.println("Conflict got SOLVED");
	}

}
