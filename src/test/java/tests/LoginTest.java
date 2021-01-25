package tests;


import org.testng.annotations.Test;


import Pages.AccountPage;



public class LoginTest extends TestBase {

	
	AccountPage loginObj;


	@Test(priority = 0)

	public void Test_valid_login() {
		driver.navigate().to("https://www.jumia.com.eg/customer/account/login");
		loginObj = new AccountPage(driver);
		loginObj.enter_email_Txt("email1000@email.com");
		loginObj.enter_Password_Txt("password");
		//loginObj.click_on_login_submit();

	}
	

}
