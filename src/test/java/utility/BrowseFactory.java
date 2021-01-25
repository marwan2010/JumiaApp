package utility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;


import tests.TestBase;



public class BrowseFactory extends TestBase{
	
	@Parameters("browserName")
	public static void browsersetup( @Optional("firefox")String browserName) throws Exception{
		//Check if parameter passed from TestNG is 'firefox'
		if(browserName.equalsIgnoreCase("firefox")){
			//Mention the location of GeckoDriver in localsystem
			System.setProperty("webdriver.gecko.driver", driverPath);
			// Object is created- Chrome browser is opened
			driver= new FirefoxDriver();
			
		}
		//Check if parameter passed as 'chrome'
		else if(browserName.equalsIgnoreCase("chrome")){
			//set path to chromedriver.exe
			// WebDriverManager.chromedriver().setup();
			//create chrome instance
			driver = new ChromeDriver();
		}
		else{
			//If no browser passed throw exception
			throw new Exception("We do not Support this Browser");
		}
		
		// maximize browser
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().setScriptTimeout(30, TimeUnit.SECONDS);
		
	}
	
	

	
	

}
