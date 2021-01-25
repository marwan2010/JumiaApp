package Pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends PagesBase {

	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	@FindBy(className = "cls")
	WebElement cls;

	@FindBy(id = "dpdw-login")
	WebElement account_link;

	@FindBy(xpath = "//a[contains(@href,'/customer/account/create/')]")
	WebElement create_account;

	@FindBy(id = "dpdw-flyout")
	WebElement home_link;

	@FindBy(xpath = "//span[contains(@class,'text')]")
	List<WebElement> item_cat;

	@FindBy(className = "s-itm")
	List<WebElement> sub_itm;

	@FindBy(xpath = "//button[@name='op'] ")
	public List<WebElement> addcart_btn;

	@FindBy(id = "ci")
	public WebElement bask_cart;

	@FindBy(className = "items")
	public WebElement item_list;

	@FindBy(className = "flyout")

	WebElement home;

	public void click_account_Dropdown()

	{

		action.moveToElement(account_link).click().perform();

	}

	public void Click_create_account()

	{
		js.executeScript("arguments[0].click();", create_account);

		// action.moveToElement(create_account).click().perform();
	}

	public void ClickClosePop()

	{
		if (isDisplayed(cls))
			clickButton(cls);
	}

	public void Open_Categoires_DropDown()

	{
		// action.moveToElement(home_link).click().perform();
		action.moveToElement(item_cat.get(6)).perform();
		//System.out.println("openURL"+item_cat.get(6).getText());

	}

	public void select_And_Browse_Categoey()

	{

		action.moveToElement(sub_itm.get(1)).click().perform();

	}

	public void Click_add_Cart_Btn()

	{
		js.executeScript("arguments[0].click();", addcart_btn.get(1));
		// action.moveToElement(addcart_btn.get(1)).perform();
		// clickButton();

	}

	public void Open_Shopping_Cart()

	{
		// js.executeScript("arguments[0].click();", bask_cart);
		action.moveToElement(bask_cart).perform();
		clickButton(bask_cart);

	}

	public void click_home()

	{
		action.moveToElement(home_link).perform();

	}
}
