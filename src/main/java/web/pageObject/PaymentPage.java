package web.pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import utils.utils_Class;

public class PaymentPage extends utils_Class{

	WebDriver driver;
	public PaymentPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css = "[placeholder='Select Country']")
	WebElement SelectCountry ;
	
	//@FindBy(id = ".ta-results")
	//WebElement result;
	
	@FindBy(xpath = "(//button[contains(@class,'ta-item')])[2]")
	WebElement cartItem;
	
	@FindBy(xpath = "//a[@class='btnn action__submit ng-star-inserted']")
	WebElement submit;
	
	@FindBy(xpath = "//section[@class='ta-results list-group ng-star-inserted']")
	WebElement Drop_result;
	
	//By result =By.id(".ta-results");
	
	public void paymentMethod() 
	{
		ActionSendKeys(SelectCountry, "India");
		waitForElementToBeClickable(Drop_result);
		cartItem.click();
	
	}

	public void click_Submit() throws InterruptedException
	{
		Thread.sleep(3000);
		JSClick(submit);
	
	}
}

/*
Actions a = new Actions(driver);
a.sendKeys(driver.findElement(By.cssSelector("[placeholder='Select Country']")), "india").build().perform();

waitex.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".ta-results")));

driver.findElement(By.xpath("(//button[contains(@class,'ta-item')])[2]")).click();
Thread.sleep(3000);
WebElement submit = driver.findElement(By.xpath("//a[@class='btnn action__submit ng-star-inserted']"));
executor.executeScript("arguments[0].click();", submit);
*/