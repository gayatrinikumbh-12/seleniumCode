package pageObject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import utils.utils_Class;

public class CartPage extends utils_Class{

	WebDriver driver;
	
	public CartPage(WebDriver driver) {
		
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	
	}

	
	@FindBy(css = ".cartSection h3")
	List<WebElement> cartProducts;
	
	@FindBy(css = ".totalRow button")
	WebElement cart;
	
	
	
	
	public void cartProducts(String productName) throws InterruptedException
	{
	
		//List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match = false;

		for (WebElement cartProduct : cartProducts) {
		    if (cartProduct.getText().equalsIgnoreCase(productName)) {
		        match = true;
		        break;
		    }
		}
	
		
	//Assert.assertTrue(match);
	Thread.sleep(5000);	
		
		
	}
	
	public void ClickOnCart()
	{
		waitForElementToBeClickable(cart);
		JSClick(cart);
		
	}
	
	/*
	 * 
		List<WebElement> cartProducts = driver.findElements(By.cssSelector(".cartSection h3"));
		Boolean match = false;

		for (WebElement cartProduct : cartProducts) {
		    if (cartProduct.getText().equalsIgnoreCase(productName)) {
		        match = true;
		        break;
		    }
		}
	
		
	Assert.assertTrue(match);
	Thread.sleep(5000);	
	WebElement cart = driver.findElement(By.cssSelector(".totalRow button"));
	WebDriverWait waitex = new WebDriverWait(driver, Duration.ofSeconds(30));
	waitex.until(ExpectedConditions.elementToBeClickable(cart));
	
	//WebElement element = driver.findElement(By.id("yourElementId"));
	JavascriptExecutor executor = (JavascriptExecutor) driver;
	executor.executeScript("arguments[0].click();", cart);
	//cart.click();
	*/
	 

	

}
