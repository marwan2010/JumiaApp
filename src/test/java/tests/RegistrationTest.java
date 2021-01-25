package tests;

import org.testng.annotations.Test;

import org.testng.annotations.BeforeClass;
import java.io.IOException;
import org.testng.annotations.DataProvider;
import Pages.AccountPage;
import Pages.HomePage;
import utility.ExcellReader;

public class RegistrationTest extends TestBase {

	HomePage homeObject;
	AccountPage createObj;

	@BeforeClass
	public void OpenBrowser() {

		homeObject = new HomePage(driver);
		createObj = new AccountPage(driver);
		driver.get("https://www.jumia.com.eg/");

	}
	
	@DataProvider(name = "ExcelData")
	public Object[][] userRegisterData() throws IOException {
		// get data from Excel Reader class
		ExcellReader ER = new ExcellReader();

		return ER.getExcelData();
	}
 

	@Test(priority = 0)
	public void Open_Registration_Page()

	{
		homeObject.ClickClosePop();
		homeObject.click_account_Dropdown();
		createObj.click_On_New_Account();

	}

	
	@Test(priority = 0, dataProvider = "ExcelData")
	public void Test_valid_Registration(String user_email) {

		createObj.enter_FName_Txt("Mohamed");
		createObj.enter_laName_Txt("Marwan");
		createObj.enter_email_Txt(user_email);
		createObj.enter_Password_Txt("password");
		createObj.enter_phone_Txt("01008898020");
		createObj.click_On_Terms_Chk();
		// createObj.click_on_submit_btm();

	}

}
