package step_defination_package;

import cucumber.api.java.en.Then;
import page_action_package.Profile_page_action_class;
import utility_package.base_class_Testingtroopers;

public class Profile_page_step extends base_class_Testingtroopers{
	Profile_page_action_class profile_page_action_class = new Profile_page_action_class();
	@Then("^verify user can login successfully$")
	public void verify_user_can_login_successfully() throws Throwable {
		 profile_page_action_class .verifyusercanloginsuccessfully(); 
	}	    

}
