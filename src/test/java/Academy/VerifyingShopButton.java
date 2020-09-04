package Academy;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjects.HomePage;
import resources.Base;

public class VerifyingShopButton extends Base {
	public WebDriver driver;
	
	@BeforeTest
	public void initialize() throws IOException {
		driver = initializeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
	}
	
	@Test
	public void verifyShopButtonDisplay() throws IOException 
	{
	
		HomePage h = new HomePage(driver);
		Assert.assertTrue(h.getshopbutton().isDisplayed());
			
	}
	@AfterTest
	public void tearDown() {
		driver.close();
	}

	
	
}
