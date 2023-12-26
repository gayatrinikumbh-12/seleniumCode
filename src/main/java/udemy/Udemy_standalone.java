package udemy;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import web.pageObject.HomePage;
import web.pageObject.LoginPage;


public class Udemy_standalone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		//System.setProperty("webdriver.chrome.driver", "path/to/chromedriver");

		 
		WebDriver driver = new  ChromeDriver();
		
		
		String productName = "ZARA COAT 3";
			
		//WebDriverManager.chromedriver().setup();
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//driver.get("https://rahulshettyacademy.com/client");
		//driver.get("https://rahulshettyacademy.com/client");
		//LandingPage landingPage = new LandingPage(driver);
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.goTo();
		loginpage.LoginApp("anshika@gmail.com", "Iamking@000");
		
		
		driver.close();
		
	}

}
