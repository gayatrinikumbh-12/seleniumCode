package utils;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class utils_Class {
	
	WebDriver driver;
	public utils_Class(WebDriver driver)
	{
		this.driver=driver;
		
	}

	

	public void waitForElementToAppear(By findby)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(findby));
		
	
	}
	
	

	public void waitForElementToBeClickable(WebElement element)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	
	}
	
	
	public void waitForElementToDisAppear(By findby)
	{
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(findby));
		
	
	}
	
	public void JSClick(WebElement element)
	{
		
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", element);
		
	
	}
	
	public void ActionSendKeys(WebElement element,String s)
	{
		
		Actions a = new Actions(driver);
		a.sendKeys(element, s).build().perform();
		
	
	}
	
	public String gettext(WebElement element)
	{
		
		return element.getText();
		
	
	}
}
