package utility_package;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;



public class base_class_Testingtroopers {
	public static WebDriver driver ;
	public static Properties stwpro ;
	
	public  base_class_Testingtroopers() {
		try {
			FileInputStream TestingtroopersFile = new FileInputStream(System.getProperty("user.dir")+ "\\src\\test\\java\\Configuration_package\\Configuration file.properties");
			 stwpro = new  Properties();
			stwpro.load(TestingtroopersFile);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("please check your code");
			e.printStackTrace();
		}
	}
      public void TestingtroopersBrowser() {
    	  String Browser = stwpro.getProperty("TestingTroopersBrowser1");
    	  if(Browser.equalsIgnoreCase("Edge")) {
    		// System.setProperty("webdrive.chrome.driver",(System.getProperty("user.dir")+"\\Waterfall_ Driver\\chromedriver.exe"));
			   // driver = new ChromeDriver(); 
			    System.setProperty("webdrive.edge.driver",(System.getProperty("user.dir")+"\\Driver_edge\\msedgedriver.exe"));
			    EdgeOptions co = new EdgeOptions();
			    co.addArguments("--remote-allow-origin=*");
			    driver = new EdgeDriver(co); 
			    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds( test_data_class_Testingtroopers .implicitlyWait));
			    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(test_data_class_Testingtroopers.pageLoadTimeout));
			  driver.manage().window().maximize();    
			  driver.manage().deleteAllCookies();    	 
		 }
    		  
    		  
    	  
    	  else if(Browser.equalsIgnoreCase("Chrome")) ;
    		  
    	  }
     public static void TestingTroopersURL(String URL) {
    	driver.get(stwpro.getProperty("URLQA")); 
      }
}
