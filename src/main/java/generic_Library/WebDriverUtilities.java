package generic_Library;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class WebDriverUtilities {
	
public void alter(WebDriver driver) {
	driver.switchTo().alert().accept();
}

public void alt(WebDriver driver) {
	driver.switchTo().alert().accept();
}
public void waitMethod(WebDriver driver,int num)
{
	driver.manage().timeouts().implicitlyWait(num,TimeUnit.SECONDS);
}
public void rc(WebDriver driver,WebElement ele)
{
	Actions a=new Actions(driver);
	a.contextClick(ele).perform();
}
public void alter1(WebDriver driver)
{
	driver.switchTo().alert().dismiss();
	}
}