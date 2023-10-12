package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ClickingDownloadInvoiceInFeedbackTab {
	
		//Declaration
		//Address of Invoice web element
		@FindBy(xpath="(//input[@class='btn btn-primary btn-block btn-flat btn btn-success'])[1]")
		private WebElement Invoicebtn;
				
		//initialization
		
		public ClickingDownloadInvoiceInFeedbackTab(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		//utilization
		
		//business logic
		public void InvoiceButton()
		{
			Invoicebtn.click();
		}

}
