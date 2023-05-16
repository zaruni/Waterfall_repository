package page_locator_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.base_class_Testingtroopers;

public class Home_page_locator_class extends base_class_Testingtroopers{
	public Home_page_locator_class() {
    PageFactory.initElements(driver, this);
	}
	@FindBy (id="login2")
public WebElement   verifyLoginlinkinhomepageisdisplaying  ;
	@FindBy (id="login2")
    public WebElement  clickloginlinkinhomepageheader   ;
    @FindBy (xpath = "//a[text()='Log in']")
	public WebElement loginlink;
    @FindBy (id = "login2")
   	public WebElement Loginpageclosesuccessfully;
   	
}

  
      

