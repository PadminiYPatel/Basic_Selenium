package Assignments;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class='Pke_EE']")).sendKeys("Mobile");
		driver.findElement(By.xpath("//button[@class='_2iLD__']")).click();
		driver.findElement(By.xpath("//div[text()='APPLE iPhone 14 (Blue, 128 GB)']")).click();
		
		Set<String> child=driver.getWindowHandles();
		for(String b:child)
		{
			driver.switchTo().window(b);
		}
		WebElement value=driver.findElement(By.xpath("//span[text()='APPLE iPhone 14 (Blue, 128 GB)']/../../../../..//div[@class='_3I9_wc _2p6lqe']"));
		System.out.println(value.getText());
		
	}
}
