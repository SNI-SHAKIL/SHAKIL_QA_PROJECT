package timf_soft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver	();
		driver.manage().window().maximize();
		
	
		  driver.get("https://timf.imikrof.com");
	      WebElement username = driver.findElement(By.id("email"));
	      username.sendKeys("");
	      
	      WebElement pass = driver.findElement(By.id("password"));
	      pass.sendKeys("");
	      
	      WebElement login = driver.findElement(By.xpath("/html/body/section/div/div/div[3]/div/div[3]/form/div/div[3]/input\r\n"
	      		+ ""));
	      login.click();
	}

}
