package test.cases;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.CartPage;
import pageObject.HomePage;
import pageObject.LoginPage;
import pageObject.OrderPage;
import pageObject.PaymentPage;







public class Utest {

	//public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

	@Test
	public void appTest() throws InterruptedException
	{
	
		System.out.println("hello");
		
		
		String productName ="ZARA COAT 3";//"QWERTY"; //
		
		//WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/client");
		
		
		
		
		//driver.get("https://rahulshettyacademy.com/client");
		//driver.get("https://rahulshettyacademy.com/client");
		//LandingPage landingPage = new LandingPage(driver);
		
		HomePage homepage = new HomePage(driver);
		LoginPage loginpage = new LoginPage(driver);
		CartPage crtpage = new CartPage(driver);
		PaymentPage paymentpage = new PaymentPage(driver);
		OrderPage orderpage = new OrderPage(driver);
		
		
		loginpage.goTo();
		loginpage.LoginApp("anshika@gmail.com", "Iamking@000");
		homepage.GetProductList();
		
		homepage.getProductByName(productName);
		homepage.addProductToCart();
		
		crtpage.cartProducts(productName);
		crtpage.ClickOnCart();
		
		paymentpage.paymentMethod();
		paymentpage.click_Submit();
		
		orderpage.textMsg();
		orderpage.validateMsg();
		//driver.close();
		driver.quit();
	}

}
