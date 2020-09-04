package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	public WebDriver driver;
	
	By logo = By.xpath("//img[@class='astra-logo-svg']");
	By allProductslink = By.xpath("//a[contains(text(),'All Products')]");
	By shopButton = By.xpath("(//span[contains(text(),'Shop 1Now')])[1]");
	
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public WebElement getLogo() {
		return driver.findElement(logo);
	}
	
	public WebElement getProductslink() {
		return driver.findElement(allProductslink);
	}
	
	public WebElement getshopbutton() {
		return driver.findElement(shopButton);
	}
	
}
