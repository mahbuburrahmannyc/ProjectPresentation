package ups.bdd.actionpage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import ups.bdd.elementspage.UpsSearchElements;
import ups.bdd.utility.InvokeDriver;

public class UpsActionPage {
	 
	UpsSearchElements PageElement;
	
	public UpsActionPage () {
		PageElement=new UpsSearchElements();
		PageFactory.initElements(InvokeDriver.driver, PageElement);
	}
	
	public void openBrowser()throws Exception{
		
		InvokeDriver.driver.manage().window().maximize();
		InvokeDriver.driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		InvokeDriver.driver.get("https://www.ups.com/us/en/Home.page?");
		
	}
	public void ClickLogin() throws Exception{
			Thread.sleep(3000);
		PageElement.LogInBox.click();
	
}
	public void EnterIdPass(String arg1, String arg2) throws Exception{
			Thread.sleep(3000);
		PageElement.UserIDBox.sendKeys(arg1);
		PageElement.PasswordBox.sendKeys(arg2);
		
	}
	
	public void ClickLogInButton() throws Exception{
			Thread.sleep(3000);
		PageElement.LogInButton.click();
	}
	
	public void EnterTrackNum(String arg1) throws Exception{
			Thread.sleep(3000);
		PageElement.TrackBox.sendKeys(arg1);
	}
	
	public void SearchTrackNum() throws Exception{
			Thread.sleep(3000);
		PageElement.TrackBox.submit();
			Thread.sleep(3000);
		
	}
	
	public void ShipmentProgress() throws Exception {
		Thread.sleep(3000);
		PageElement.ShipmentProgress.click();
	}
	
	public void DetailedTab() throws Exception {
		Thread.sleep(3000);
		PageElement.DetailedView.click();
	}
	
	public void ProofDelivery() throws Exception {
		Thread.sleep(3000);
		PageElement.ProofDelivery.click();
		Thread.sleep(3000);
		PageElement.IconX.click();
	}
	
	public void LogOut() throws Exception{
			Thread.sleep(5000);
		
		PageElement.LogOutBox.click();
			System.out.println("Page Title is :"+InvokeDriver.driver.getTitle());
	}
	public void validation() {
		String expectedPageTitle="Tracking | UPS - United States";
		String actualPageTitle=InvokeDriver.driver.getTitle();
		Assert.assertEquals(expectedPageTitle, actualPageTitle);
	}
}