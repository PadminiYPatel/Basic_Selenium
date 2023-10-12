package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoAppPage {
			//Declaration
			//Address of course web element
			@FindBy(id="COURSE")
			private WebElement Coursebtn;
			
			@FindBy(xpath="//a[text()='FEEDBACK']")
			private WebElement Feedbackbtn;
			
			@FindBy(name="addresstype")
			private WebElement selectDd;
					
			//initialization
			
			public SkillraryDemoAppPage(WebDriver driver)
			{
				PageFactory.initElements(driver, this);
			}
			//utilization
			
			public WebElement getCoursebtn() {
				return Coursebtn;
			}
		
			public WebElement getSelectDd() {
				return selectDd;
			}

			//business logic
			public void feedbackButton()
			{
				Feedbackbtn.click();
			}
			
}
