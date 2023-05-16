package step_defination_package;

import cucumber.api.java.en.Then;
import page_action_package.Login_page_action_class;
import utility_package.base_class_Testingtroopers;
import utility_package.test_data_class_Testingtroopers;

public class Login_page_step extends base_class_Testingtroopers {
	Login_page_action_class login_page_action_class =  new Login_page_action_class ();
	

	@Then("^verify Login page is displayed$")
	public void verify_Login_page_is_displayed() throws Throwable {
		login_page_action_class.verifyLoginpageisdisplayed(); 
	    
	}
	@Then("^Verify Log in Text display in Login page$")
	public void verify_Log_in_Text_display_in_Login_page() throws Throwable {
		  
		login_page_action_class.VerifyLoginTextdisplayinLoginpage();  

}
	@Then("^Verify username field display in login page$")
	public void verify_username_field_display_in_login_page() throws Throwable {
		login_page_action_class .Verifyusernamefielddisplayinloginpage();
	}
	@Then("^Verify password field display in login page$")
	public void verify_password_field_display_in_login_page() throws Throwable {
		login_page_action_class.Verifypasswordfielddisplayinloginpage();  
	}
	@Then("^Verify Login button display in login page$")
	public void verify_Login_button_display_in_login_page() throws Throwable {
		login_page_action_class.VerifyLoginbuttondisplayinloginpage(); 
	}
	@Then("^click close button$")
	public void click_close_button() throws Throwable {
		login_page_action_class.clickclosebutton(); 
	}
	
	@Then("^click log in button$")
	public void click_log_in_button() throws Throwable {
		login_page_action_class.clickloginbutton();
	}   
	
	    
	@Then("^Verify user can Redirected to login page$")
	public void verify_user_can_Redirected_to_login_page() throws Throwable {
		login_page_action_class.VerifyusercanRedirectedtologinpage();
	}
    @Then("^Enter invalid usernameandpassword and click login button$")
public void Enter_invalid_usernameandpassword_and_click_login_button() throws Throwable {
    	login_page_action_class.usercardential(test_data_class_Testingtroopers.InvalidUsername,test_data_class_Testingtroopers.Passwors);
    }
}
