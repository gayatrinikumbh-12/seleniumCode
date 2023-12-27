package pageObject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.utils_Class;

public class HomePage extends utils_Class{

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = ".mb-3")
	WebElement Visiblity;
	
	
	
	@FindBy(css = ".mb-3")
	List<WebElement> products;
	
	
	@FindBy(css = "[routerlink*='cart']")
	WebElement cart;
	
	By ProductBy =By.cssSelector(".mb-3");
	
	By container =By.cssSelector("#toast-container");
	
	By buffer =By.cssSelector(".ng-animating");
	
	By addToCart = By.cssSelector(".card-body button:last-of-type");

	//waitForElementToAppear( Visiblity );
	
	
	public List<WebElement > GetProductList()
	{
		waitForElementToAppear(ProductBy);
		
		
		return products;
		
		
	}
	
	public WebElement getProductByName(String productName)
	{
		
		
		WebElement prod = null;
		for (WebElement product : products) {
		    if (product.findElement(By.cssSelector("b")).getText().equals(productName)) {
		        prod = product;
		        break;
		    }
		}

		if (prod != null) {
		    //
			//prod.findElement(By.cssSelector(".card-body button:last-of-type")).click();
			JSClick(prod.findElement(addToCart));
		}

		return prod;
	}
	
	
	
	public void addProductToCart()
	{
		
		waitForElementToAppear(container);
		
		waitForElementToDisAppear(buffer);
		
		cart.click();
	}
	
	
	
}

