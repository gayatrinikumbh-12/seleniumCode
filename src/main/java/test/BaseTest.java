package test;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import web.pageObject.CartPage;
import web.pageObject.HomePage;
import web.pageObject.LoginPage;
import web.pageObject.OrderPage;
import web.pageObject.PaymentPage;

public class BaseTest {

	WebDriver driver = null ;
	
	HomePage homepage ;
	LoginPage loginpage ;
	CartPage crtpage  ;
	PaymentPage paymentpage;
	OrderPage orderpage ;
	public void initializer () throws IOException
	{
		
		Properties p = new Properties();
		String path = System.getProperty("user.dir")+"\\GlobalData.properties";
		FileInputStream fs = new FileInputStream(path);
		p.load(fs);
		p.getProperty("Browser");
		
		
		String BrowserValue = p.getProperty("Browser");
		
		switch(BrowserValue)
		{
			case "CHROME":   driver = new ChromeDriver();
							
							break;
				
			case "EDGE":	driver = new EdgeDriver();
							
							break;
			
		}
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	}
	
	@BeforeClass
	public void LaunchApplication()
	{
		LoginPage loginpage = new LoginPage(driver);
		
		loginpage.goTo();
	}
	
	
	
	
	
}
