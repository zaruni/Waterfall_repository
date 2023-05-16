package page_action_package;

import org.testng.Assert;

import page_locator_package.Profile_page_locator_class;
import utility_package.base_class_Testingtroopers;

public class Profile_page_action_class extends  base_class_Testingtroopers{
	Profile_page_locator_class profile_page_locator_class  = new Profile_page_locator_class ();
	
    public void verifyusercanloginsuccessfully() throws Exception {
    	Thread.sleep(5000);
    	boolean profilevalidation = profile_page_locator_class.profilepage.isDisplayed();
    	Assert.assertTrue(profilevalidation);
    }
}
