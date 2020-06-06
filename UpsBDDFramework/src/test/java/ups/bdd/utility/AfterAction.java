package ups.bdd.utility;

import cucumber.api.java.After;

public class AfterAction {

@After
	
	public void afterAction() throws Exception {
	Thread.sleep(10000);
	InvokeDriver.tearDown();
	System.out.println("Application TearDown Successfully");
	
	
}

}
