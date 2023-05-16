package page_locator_package;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utility_package.base_class_Testingtroopers;

public class Profile_page_locator_class extends base_class_Testingtroopers {

	public Profile_page_locator_class() {
	    PageFactory.initElements(driver, this);
}
	@FindBy (xpath="//a[text()='Welcome Ruma']")
	public WebElement profilepage  ;
	
}