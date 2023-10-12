package popUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;
import generic_Library.WebDriverUtilities;

public class Alter_Popup {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/product.php?product=java");
		WebElement plus=driver.findElement(By.xpath("//i[@class='fa fa-plus']"));
		Actions a=new Actions(driver);
		a.doubleClick(plus).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[text()=' Add to Cart']")).click();
		//Alert a1=driver.switchTo().alert();
		WebDriverUtilities utl=new WebDriverUtilities();
		utl.alter(driver);
		Thread.sleep(3000);
		//System.out.println(a1.getText());
		//a1.accept();
		//a1.dismiss();
	}

}
