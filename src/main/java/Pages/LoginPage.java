package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PagesBase {

	public LoginPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	

	@FindBy(xpath = "//input[@type='email']")
	WebElement email;
	@FindBy(xpath = "//input[@type='password']")
	WebElement password;

	@FindBy(xpath ="//button[@type='submit'])")
	WebElement btn_submit;


	public void enter_email(String value)

	{
		setTextElementText(email, value);
	}

	public void enter_password(String value)

	{
		setTextElementText(password, value);
	}
	
	public void Click_Sbmit()

	{

		clickButton(btn_submit);
	}



}
