package ups.bdd.utility;

import cucumber.api.Scenario;
import cucumber.api.java.Before;


public class BeforeAction {

	@Before
	public void beforeActions(Scenario scene) {
		
		System.out.println("My 1st Execution");
		InvokeDriver.callDriver();
		System.out.println("Driver trigger Successfully");
		System.out.println("My Secnario Name Is ::"+scene.getName());
		
		
	}
	
	
}
