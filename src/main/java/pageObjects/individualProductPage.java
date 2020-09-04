package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class individualProductPage {
	public WebDriver driver;
	
	By addtocart = By.xpath("//button[@name='add-to-cart']");
	By producttitle = By.xpath("//h1[@class='product_title entry-title']");
	
	
	public individualProductPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public WebElement getAssortedCoffeeProduct() {
		return driver.findElement(addtocart);
	}
	
	public WebElement getProductTitle() {
		return driver.findElement(producttitle);
	}
	
	
	
}
