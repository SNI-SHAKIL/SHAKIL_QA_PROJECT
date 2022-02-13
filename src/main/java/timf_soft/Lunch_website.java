package timf_soft;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Lunch_website {
	
	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver	();
		driver.manage().window().maximize();
		
		driver.navigate().to("https://timf.imikrof.com");
	      
	}

}
