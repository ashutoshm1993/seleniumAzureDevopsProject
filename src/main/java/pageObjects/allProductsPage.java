package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class allProductsPage {
	public WebDriver driver;
	
	By AssortedCoffee = By.xpath("//h2[contains(text(),'Assorted Coffee')]");
	
	
	public allProductsPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAssortedCoffeeProduct() {
		return driver.findElement(AssortedCoffee);
	}
	
	
	
}
