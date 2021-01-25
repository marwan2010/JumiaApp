package tests;

import org.testng.Assert;

import org.testng.annotations.BeforeClass;

import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;

public class Add_product_to_cart_Test extends TestBase {

	HomePage homeObject;
	LoginPage loginObject;
	String baseUrl = "https://www.jumia.com.eg/";

	@BeforeClass
	public void Open_Categories_Dropdown() {
		homeObject = new HomePage(driver);
		driver.navigate().to(baseUrl);
		//homeObject.ClickClosePop();
		// homeObject.click_home();
		homeObject.Open_Categoires_DropDown();
		homeObject.select_And_Browse_Categoey();

	}

	@Test(priority = 0)
	public void Select_Product_And_Add_to_Cart() throws InterruptedException {

		Thread.sleep(4000);
		homeObject.Click_add_Cart_Btn();
		Thread.sleep(2000);

	}

	@Test(priority = 1)
	public void Open_cart_And_view_added_products() {

		homeObject.Open_Shopping_Cart();
		Assert.assertEquals(true, homeObject.item_list.isDisplayed());
	}

}
