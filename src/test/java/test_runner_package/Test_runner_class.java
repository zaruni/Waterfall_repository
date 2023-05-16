package test_runner_package;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import utility_package.base_class_Testingtroopers;

@CucumberOptions(features = {"src/test/resources/Testing_troopers_folder"},
plugin = {"json:target/cucumber.json"},
glue = "step_defination_package" ,tags = {"@ElementDisplayed ,@CloseLoginpage ,@Login"})


public class Test_runner_class extends AbstractTestNGCucumberTests {
	@BeforeTest
	public void TestingTroopersOpenURL() {
		base_class_Testingtroopers Testeren = new base_class_Testingtroopers(); 
		Testeren.TestingtroopersBrowser();
}	
	@AfterTest
	public void TestingTroopersCloseURL() {
		base_class_Testingtroopers 	Testeren = new base_class_Testingtroopers(); 
		Testeren.driver.quit();
	}
}