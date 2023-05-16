package page_action_package;

import org.testng.Assert;

import page_locator_package.Login_page_locator_class;
import utility_package.base_class_Testingtroopers;
import utility_package.test_data_class_Testingtroopers;

public class Login_page_action_class extends base_class_Testingtroopers{
	Login_page_locator_class login_page_locator_class = new Login_page_locator_class () ;
	
	public void verifyLoginpageisdisplayed() {
		login_page_locator_class.Loginlink.click();	
	}
	
	public void VerifyLoginTextdisplayinLoginpage() {
		login_page_locator_class.Logintextindisplay.click();
	}
	public void  Verifyusernamefielddisplayinloginpage() throws Exception {
		Thread.sleep(5000);
		boolean velidationusername = login_page_locator_class.loginpage.isDisplayed();
		Assert.assertTrue(velidationusername);
	}
	public void Verifypasswordfielddisplayinloginpage() throws Exception {
		Thread.sleep(5000);
		boolean  velidationpassword = login_page_locator_class .passwordfieldinloginpage.isDisplayed();
		Assert.assertTrue(velidationpassword);
	}
	public void VerifyLoginbuttondisplayinloginpage() throws Exception {
		Thread.sleep(3000);
		boolean verifyloginbutton = login_page_locator_class.Loginbutton.isDisplayed();
		Assert.assertTrue(verifyloginbutton);
	}
	public void clickclosebutton() {
		login_page_locator_class .closebutton.click();
	}
	public void usercard(String h ,String j) {
		 login_page_locator_class.username.sendKeys(test_data_class_Testingtroopers.Username);
		 login_page_locator_class.password.sendKeys(test_data_class_Testingtroopers.Passwors);
		 login_page_locator_class.loginbuttonlink.click();
	}
	public void clickloginbutton() throws Exception {
		 login_page_locator_class.Loginbuttonlink.click();
		 driver.switchTo().alert().accept();
		 Thread.sleep(3000);
	}
	public void VerifyusercanRedirectedtologinpage() throws Exception  {
		
		 boolean validationlogin = login_page_locator_class.login.isDisplayed();
		 Assert.assertTrue(validationlogin);
	}
	public void usercardential(String I ,String U) throws Exception {
		login_page_locator_class.usernamee.sendKeys(test_data_class_Testingtroopers.InvalidUsername);
		login_page_locator_class.passwordd.sendKeys(test_data_class_Testingtroopers.Passwors);
		login_page_locator_class.loginbuttonn.click();
		Thread.sleep(5000);
		driver.switchTo().alert().accept();
	}
}