package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import utils.utils_Class;

public class OrderPage extends utils_Class {

	WebDriver driver;
	public OrderPage(WebDriver driver) {
		super(driver);
		this.driver=driver;
		// TODO Auto-generated constructor stub
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = ".hero-primary")
	WebElement confirmMessage ;
	
	
	public void textMsg()
	{
		
		gettext(confirmMessage);
	}
	
	public void validateMsg()
	{
		String Actual , UI;
		UI=gettext(confirmMessage);
		
	}
	
	
	/*
	 * //submit.click();
	Thread.sleep(3000);
	String confirmMessage = driver.findElement(By.cssSelector(".hero-primary")).getText();
	Assert.assertTrue(confirmMessage.equalsIgnoreCase("THANKYOU FOR THE ORDER."));
	//driver.close();
	
	driver.quit();
	*/
	 
}
