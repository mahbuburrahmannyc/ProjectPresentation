package ups.bdd.stepdefinition;

import org.openqa.selenium.JavascriptExecutor;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import ups.bdd.actionpage.UpsActionPage;
import ups.bdd.utility.InvokeDriver;

public class UpsStepDefinition {
		 
	UpsActionPage PageAction = new UpsActionPage();
	
	@Given("^User open browser$")
	public void user_open_browser() throws Throwable {
		PageAction.openBrowser();
	}

	@When("^The user navigate to the UPS home page \"([^\"]*)\"$")
	public void the_user_navigate_to_the_UPS_home_page(String arg1) throws Throwable {
		PageAction.openBrowser();
	}

	@Then("^User click on log in icon$")
	public void user_click_on_log_in_icon() throws Throwable {
		PageAction.ClickLogin();
	}

	@Then("^User enter User ID \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void user_enter_User_ID_and_Password(String arg1, String arg2) throws Throwable {
		PageAction.EnterIdPass(arg1, arg2);
	}

	@Then("^User click login button$")
	public void user_click_login_button() throws Throwable {
		PageAction.ClickLogInButton();
	}

	@Then("^User must login to the UPS account successfully$")
	public void user_must_login_to_the_UPS_account_successfully() throws Throwable {
		
	}

	@Then("^User Enter valid tracking number \"([^\"]*)\"$")
	public void user_Enter_valid_tracking_number(String arg1) throws Throwable {
		PageAction.EnterTrackNum(arg1);
	}

	@Then("^Submit search$")
	public void submit_search() throws Throwable {
		PageAction.SearchTrackNum();
	JavascriptExecutor js = (JavascriptExecutor)InvokeDriver.driver;
			js.executeScript("window.scrollBy(0,450)");
	}
	@Then("^User click on Shipment Progress$")
	public void user_click_on_Shipment_Progress() throws Throwable {
		PageAction.ShipmentProgress();
	}

	@Then("^User click on Detailed view tab$")
	public void user_click_on_Detailed_view_tab() throws Throwable {
		PageAction.DetailedTab();
	}

	@Then("^User Hover over to Proof of Delivery to verify then exit out of it\\.$")
	public void user_Hover_over_to_Proof_of_Delivery_to_verify_then_exit_out_of_it() throws Throwable {
		PageAction.ProofDelivery();
	JavascriptExecutor js = (JavascriptExecutor)InvokeDriver.driver;
			js.executeScript("window.scrollBy(0,-450)");
	}

	@Then("^User log out by clicking log out icon$")
	public void user_log_out_by_clicking_log_out_icon() throws Throwable {
		JavascriptExecutor js = (JavascriptExecutor)InvokeDriver.driver;
			js.executeScript("window.scrollBy(0,-450)");
		PageAction.LogOut();
		
	}

	@Then("^Validate logout page and user close the browser$")
	public void validate_logout_page_and_user_close_the_browser() throws Throwable {
	 
		PageAction.validation();
		
	}
}
