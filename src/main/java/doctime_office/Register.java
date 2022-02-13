package doctime_office;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Register {
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "c:\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.get("https://appdev.doctime.com.bd/login");
        Thread.sleep(1000);
        
        //#########################login using id/pass ##########################
      
        WebElement username=driver.findElement(By.name("email or phone number"));
        WebElement password=driver.findElement(By.name("password"));
        WebElement login=driver.findElement(By.className("btn-text"));
     
        username.sendKeys("");
        password.sendKeys("");
        login.click();
        Thread.sleep(5000);
        if(driver.getPageSource().contains("Welcome")) {
			System.out.println("Login Success full");
		} else {
			System.out.println("Login Fail");
		}
        Thread.sleep(1000);

        
        //################## Patient Registration page (accept check box kaj kore nah) #################
      
        driver.get("https://appdev.doctime.com.bd/registration/patient");
        //First Name 
	    WebElement patient_first_name  = driver.findElement(By.id("first_name"));
	    patient_first_name.sendKeys("test");
	    
	    //Last Name
	    WebElement patient_last_name = driver.findElement(By.id("last_name"));
	    patient_last_name.sendKeys("islam");
	    
	    //Mobile Number
	    WebElement mobile = driver.findElement(By.id("mobile"));
	    mobile.sendKeys("01795780200");
	    
	    //Password 
	    WebElement member = driver.findElement(By.id("password"));
	    member.sendKeys("islam44");
	    
	    //Privacy Policy  xpath  
	    WebElement patient_reg = driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/main/div/div/div[2]/span/form/div[2]/button\r\n"
	    		+ ""));
	    patient_reg.click();
	    Thread.sleep(1000);
	    
	    if(driver.getPageSource().contains("Mobile Verification")) {
			System.out.println(" Register Success full");
		} else {
			System.out.println("Register Fail");
		}
	    
	    
	    
	    //######################### OTP ##########################
	    
	    driver.get("https://appdev.doctime.com.bd/registration/verify-otp");
	    Thread.sleep(1000);
	    
	    
	    
	    
	    //######################### personal-info page ##########################
        
        driver.get("https://appdev.doctime.com.bd/registration/patient/personal-info");
        Thread.sleep(1000);
     
                
        //Gender select
        Select gender = new Select(driver.findElement(By.id("gender")));
        gender.selectByVisibleText("Female");
        
        //District select
        Select district = new Select(driver.findElement(By.id("district_id")));
        district.selectByVisibleText("Comilla");
        
        //Gmail  not working
        WebElement mail = driver.findElement(By.id("email"));
        mail.clear();
        mail.sendKeys("test@yahoo.com");
        
        //complate registration
        WebElement com_reg=driver.findElement(By.xpath("/html/body/div[1]/div/div/div/div/main/div/div/div/div/span/form/div[4]/button"));
        com_reg.click();
        Thread.sleep(1000);
        
        
        //######################### Picture uplode  page ##########################
        driver.get("https://appdev.doctime.com.bd/registration/upload-profile-picture");
        Thread.sleep(1000);
        
        //######################### Main deshboard ##########################
        
        driver.get("https://appdev.doctime.com.bd/");
	
	
	}

}
