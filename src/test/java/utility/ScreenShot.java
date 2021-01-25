package utility;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShot {
	
	public static void CaputreScreenShot(WebDriver driver ,String screenshotName) {
		// Convert web driver object to TakeScreenshot
		TakesScreenshot scrShot = ((TakesScreenshot) driver);
		try {

			// Call getScreenshotAs method to create image file

			File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);

			// Move image file to new destination

			File DestFile = new File(".//ScreenShot//" + screenshotName + ".png");
			// Copy file at destination
			FileUtils.copyFile(SrcFile, DestFile);
			System.out.print("ScreenShot Taken");
		} catch (IOException e) {
			e.printStackTrace();
			System.out.print("Expection While taking ScreenShot Taken" + e.getMessage());
		}
	}

}
