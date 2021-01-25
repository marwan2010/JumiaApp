package Pages;




import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends PagesBase {

	public AccountPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(id = "fi-firstName")
	WebElement firstName;
	
	@FindBy(id = "fi-lastName")
	WebElement lastName;
	
	@FindBy(id = "fi-email")
	WebElement email;
	
	@FindBy(id = "fi-password")
	WebElement password;
	
	@FindBy(id = "fi-phone")
	WebElement phone;
	
	@FindBy(xpath = "//form[@id='authForm']/div[4]/div/label")
	WebElement terms;
	
	@FindBy(xpath = "//*[@id=\"dpdw-login-box\"]/div/div[2]/a")
	WebElement btn_create;
	
	@FindBy(xpath="//*[@id=\"authForm\"]/div[7]/button")
	WebElement test;
	
	@FindBy(xpath="	//*[@id=\"authForm\"]/button")
	WebElement login_submit;
	

   


	public void enter_FName_Txt(String value)

	{
		setTextElementText(firstName,value);

	}
	
	public void enter_laName_Txt(String value)

	{
		setTextElementText(lastName,value);

	}
	
	public void enter_Password_Txt(String value)

	{
	
		setTextElementText(password,value);
	}
	
	public void enter_email_Txt(String value)

	{
	
		setTextElementText(email,value);
	}
	
	public void enter_phone_Txt(String value)

	{
	
		setTextElementText(phone,value);
	}
	
	public void click_On_Terms_Chk() 

	{
		
		 clickButton(terms);
		
	}
	
	public void click_On_New_Account() 

	{
		
		 clickButton(btn_create);
		
	}
	

	public void click_on_submit_btm() 

	{
		
		 clickButton(test);
		
	}
	
	public void click_on_login_submit() 

	{
		
		 clickButton(login_submit);
		
	}


public void ClearBrowserCache()
{
 
//wait 7 seconds to clear cookies.
}

}
