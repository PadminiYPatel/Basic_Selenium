package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	//Declaration
	//Address of facebook web element
	@FindBy(xpath="(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
			
	//initialization
	
	public TestingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	
	//business logic
	public void fbIconWebelement()
	{
		fbIcon.click();
	}

	public WebElement getFbIcon() {
		return fbIcon;
	}

}
