package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import pageObjects.allProductsPage;
import pageObjects.individualProductPage;
import resources.Base;

public class VerifyingProductName extends Base {
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void verifyProductName() throws IOException 
	{
	
		HomePage h = new HomePage(driver);
		h.getProductslink().click();
		allProductsPage p = new allProductsPage(driver);
		p.getAssortedCoffeeProduct().click();
		individualProductPage i = new individualProductPage(driver);
		String ProductName=i.getProductTitle().getText();
		Assert.assertEquals(ProductName, "Assorted Coffee");
			
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

	
	
}
