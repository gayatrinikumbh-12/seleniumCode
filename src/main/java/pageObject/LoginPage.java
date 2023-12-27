package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utils_Class;

public class LoginPage extends utils_Class{

	
WebDriver driver;
	
	public LoginPage(WebDriver driver)
	{
		super(driver);
		//initialization
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
		
	@FindBy(id = "userEmail")
	WebElement userName;
	
	@FindBy(id = "userPassword")
	WebElement userPass;
	
	@FindBy(id = "login")
	WebElement loginBtn;
	
	
	//LandingPage landingPage = new LandingPage(driver);

	
	public void goTo()
	{
		driver.get("https://rahulshettyacademy.com/client");
		
	}
	
	public void LoginApp(String id, String Pass)
	{
		userName.sendKeys(id);
		userPass.sendKeys(Pass);
		loginBtn.click();
		
	}
	
	
	
}
