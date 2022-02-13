package timf_soft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Report_search {
	
	public static void main(String[] args) throws InterruptedException {
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
	      
	      driver.get("https://timf.imikrof.com/REPORT_PKSF_POMIS_3");
	      Thread.sleep(1000);
	      
	      //Report Level	:
	      Select report_level = new Select(driver.findElement(By.name("report_level")));
	      report_level.selectByVisibleText("Branch");
	      
	      //Branch 	:
	      Select branch = new Select(driver.findElement(By.name("cbo_branch")));
	      branch.selectByVisibleText("0062 - Pirgacha Branch");
	      
	      // Select Month
	      Select month = new Select(driver.findElement(By.name("cbo_month")));
		  month.selectByVisibleText("January");
	      
		  //Year :
		  Select year = new Select(driver.findElement(By.name("cbo_year")));
		  year.selectByVisibleText("2022");
		  
		  //click show button
		  WebElement show = driver.findElement(By.xpath("/html/body/section/div/div/div/div[2]/div/table/tbody/tr/td[9]/button"
		  		+ ""));
		  show.click();

	     

		

	}

}
