package scrollBar;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling_WithoutCoordinates {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		WebElement career=driver.findElement(By.xpath("//a[text()='Careers']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView();",career);
		js.executeScript("arguments[0].click();",career);
		//Thread.sleep(3000);
		//js.executeScript("arguments[0].click();",career);
		//career.click();
		

	}

}
