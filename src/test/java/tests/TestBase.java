package tests;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.interactions.Actions;

import org.testng.annotations.BeforeSuite;

import utility.BrowseFactory;

public class TestBase {

	public static WebDriver driver;
	public static Actions action;

	// Store current project workspace location in a string variable ‘path’
	protected static String workingDir = System.getProperty("user.dir");
	protected static String driverPath = workingDir + "\\drivers\\geckodriver.exe";


	@BeforeSuite
	public void browsersetup() throws Exception {
		BrowseFactory.browsersetup("firefox");

	}

	
	

}
