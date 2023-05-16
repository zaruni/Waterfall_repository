package page_action_package;

import org.testng.Assert;

import page_locator_package.Home_page_locator_class;
import utility_package.base_class_Testingtroopers;

public class Home_page_action_class extends base_class_Testingtroopers {
	Home_page_locator_class  home_page_locator_class  =  new Home_page_locator_class();	
	
	public void verifyLoginlinkinhomepageisdisplaying() throws Exception {
		Thread.sleep(3000);
		boolean validationloginlink = home_page_locator_class.verifyLoginlinkinhomepageisdisplaying.isDisplayed();
		Assert.assertTrue(validationloginlink);
	}
	public void clickloginlinkinhomepageheader() {
	
		home_page_locator_class.clickloginlinkinhomepageheader.click();
}
	
	
	public void clickLoginlinkinhomepageheader() {
		 home_page_locator_class.loginlink.click();
	}
    public void  VerifyLoginpageclosessuccessfully() throws Exception  {
    	Thread.sleep(5000);
    	 boolean validation = home_page_locator_class.Loginpageclosesuccessfully.isDisplayed();
    	 Assert.assertTrue(validation);
    }
}
