package basic_Programing;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;

public class LaunchingBrowsers {

	public static void main(String[] args) throws Throwable {
		//driver related statements
		WebDriverManager.edgedriver().setup();
		
		//opens empty browser
		WebDriver driver=new EdgeDriver();
		Thread.sleep(3000);

		//for maximize
		driver.manage().window().maximize();
		String title=driver.getTitle();
		String url=driver.getCurrentUrl();
		
		System.out.println(title);
		System.out.println(url);
		driver.close();
	}

}
