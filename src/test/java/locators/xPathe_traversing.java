package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class xPathe_traversing {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		
		WebDriver driver=new EdgeDriver();
		
		driver.manage().window().maximize();
		//driver.get("https://www.amazon.com/s?k=semsung+mobiles&crid=35QF2SFGOF45X&sprefix=semsung+mobi%2Caps%2C1593&ref=nb_sb_noss_2");
		//WebElement value=driver.findElement(By.xpath("//span[text()='SAMSUNG Galaxy A14 4G LTE (128GB + 4GB) Unlocked Worldwide (Only T-Mobile/Mint/Metro USA Market) 6.6\" 50MP Triple Camera + (15W Wall Charger) (Green (SM-A145M/DS))']/../../../../../..//span[@class='a-price-whole']"));
		
		driver.get("https://www.amazon.com/s?k=lenovo+laptops+discounts&crid=23OC8EV10HAMU&sprefix=lenovo+laptop+discounts%2Caps%2C354&ref=nb_sb_noss_1");
		WebElement value=driver.findElement(By.xpath("(//span[text()='Lenovo IdeaPad 3 14\" FHD Laptop for Study and Work, 20GB RAM, 1TB NVMe SSD, Intel Dual Core Processor, Webcam, WiFi 6, HDMI, SD Card Reader, Windows 11 Home, CUE Accessories']/../../../../../..//span[@aria-hidden='true'])[2]"));
		System.out.println(value.getText());

	}

}
