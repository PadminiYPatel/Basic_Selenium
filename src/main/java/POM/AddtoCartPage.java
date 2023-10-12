package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddtoCartPage {
			//Declaration
			//Address of plus icon
			@FindBy(xpath="//i[@class='fa fa-plus']")
			private WebElement plusbtn;
					
			//Address of add to cart 
			@FindBy(xpath="//button[text()=' Add to Cart']")
			private WebElement addtocartbtn;
			
			//initialization
			
			public AddtoCartPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			//utilization
			//business logic
			public void addtoCart()
			{
				addtocartbtn.click();
			}
			public WebElement getPlusbtn() {
				return plusbtn;
			}
}