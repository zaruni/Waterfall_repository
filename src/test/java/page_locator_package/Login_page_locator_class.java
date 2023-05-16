package page_locator_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.base_class_Testingtroopers;

public class Login_page_locator_class extends base_class_Testingtroopers {

	public Login_page_locator_class() {
	    PageFactory.initElements(driver, this);
		}
		@FindBy (id="logInModalLabel")
	public WebElement  Loginlink  ;
		@FindBy (id="logInModalLabel")
		public WebElement  Logintextindisplay  ;
		@FindBy (id="loginusername")
		public WebElement loginpage  ;
		@FindBy (id="loginpassword")
		public WebElement  passwordfieldinloginpage  ;
		@FindBy (xpath="//button[text()='Log in']")
		public WebElement  Loginbutton   ;
		@FindBy (xpath = "/html/body/div[3]/div/div/div[3]/button[1]")
		public WebElement closebutton ;
		@FindBy (id = "loginusername")
		public WebElement username ;
		@FindBy (id = "loginpassword")
		public WebElement password;
		@FindBy (xpath = "//button[text()='Log in']")
		public WebElement loginbuttonlink ;
		@FindBy (xpath = "//button[text()='Log in']")
		public WebElement Loginbuttonlink ;
		@FindBy (id = "logInModalLabel")
		public WebElement login ;
		@FindBy (id = "loginusername")
		public WebElement usernamee ;
		@FindBy (id = "loginpassword")
		public WebElement passwordd ;
		@FindBy (xpath = "//button[text()='Log in']")
		public WebElement loginbuttonn ;
}
