package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPaths {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("bhdjbj");
		driver.findElement(By.xpath("//input[contains(@name,'pass')]")).sendKeys("jjj");
		driver.findElement(By.xpath("//a[contains(text(),'Forgotten')]")).click();

	}

}
