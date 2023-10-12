package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Facebook_LoginPage {

	//Declaration
	//Address of email textfield
	@FindBy(id="email")
	private WebElement emailtf;
	
	@FindBy(name="pass")
	private WebElement passwordtf;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement loginbtn;
	
	//initialization
	
	public Facebook_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	//utilization
	//getter method for all private element

	public WebElement getEmailtf() {
		return emailtf;
	}

	public WebElement getPasswordtf() {
		return passwordtf;
	}

	public WebElement getLoginbtn() {
		return loginbtn;
	}
	
	//business logic
	public void emailTextField(String data)
	{
		emailtf.sendKeys(data);
	}
	public void passwordTextField(String data)
	{
		passwordtf.sendKeys(data);
	}
	public void LoginButton()
	{
		loginbtn.click();
	}
}
