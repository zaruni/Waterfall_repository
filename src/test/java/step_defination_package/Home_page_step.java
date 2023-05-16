package step_defination_package;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import page_action_package.Home_page_action_class;
import page_action_package.Login_page_action_class;
import utility_package.base_class_Testingtroopers;
import utility_package.test_data_class_Testingtroopers;

public class Home_page_step extends base_class_Testingtroopers {
	Home_page_action_class home_page_action_class = new Home_page_action_class ();
	Login_page_action_class login_page_action_class =new Login_page_action_class ();
	
	@Given("^open Demoblaze \"([^\"]*)\" Application URL$")
	public void open_Demoblaze_Application_URL(String URL) throws Throwable {
		TestingTroopersURL(URL); 
	    
	}

	@Then("^verify Login link in homepage is displaying$")
	public void verify_Login_link_in_homepage_is_displaying() throws Throwable {
		home_page_action_class.verifyLoginlinkinhomepageisdisplaying();  
	    
	}
	@Then("^click login link in homepage header$")
	public void click_login_link_in_homepage_header() throws Throwable {
		home_page_action_class.clickloginlinkinhomepageheader();
	}	   
	@Then("^click Login link in homepage header$")
	public void click_Login_link_in_homepage_header() throws Throwable {
		home_page_action_class.clickloginlinkinhomepageheader();
	}
		
	@Then("^Verify Login page closes successfully$")
	public void verify_Login_page_closes_successfully() throws Throwable {
		home_page_action_class.VerifyLoginpageclosessuccessfully(); 
}
	@Then("^UserName Password click login$")
	public void UserName_Password_click_login() throws Throwable {
		login_page_action_class.usercard(test_data_class_Testingtroopers.Username, test_data_class_Testingtroopers.Passwors);
	}		
		
}
	
		
		   
