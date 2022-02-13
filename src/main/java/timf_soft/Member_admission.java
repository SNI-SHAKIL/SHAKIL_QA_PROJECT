package timf_soft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Member_admission {
	
	public static void main(String[] args) throws InterruptedException {

		//successfull add member
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

      driver.get("https://timf.imikrof.com/s/member_information_create");
      
      				//MEMBER

    //Samity Name	:
      Select Samity = new Select(driver.findElement(By.id("samity")));
      Samity.selectByVisibleText("0062-001-001 Komolpur");

    //Member Name	:
      WebElement member = driver.findElement(By.id("m_member_name"));
      member.sendKeys("test");

    //Member Surname  Name	:
      WebElement member_ser_name = driver.findElement(By.id("m_member_sure_name"));
      member_ser_name.sendKeys("Surname  test");

    //Primary Product	:
      Select primary_product = new Select(driver.findElement(By.id("cbo_primary_product")));
      primary_product.selectByVisibleText("Micro Credit - MC");

    //Gender :
      Select gender = new Select(driver.findElement(By.name("m_gender")));
      gender.selectByVisibleText("Female");

      // calander success
      WebElement dateBox = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[1]/div[1]/form[1]/section[1]/div[1]/div[1]/div[2]/div[3]/div[2]/table[1]/tbody[1]/tr[4]/td[4]/input[1]"));
      dateBox.sendKeys("2001-02-17");
//		
//	 //Calander : xpath a input dile o kaj kore na dilo kaj kore
//      WebElement calander = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[3]/div[2]/table/tbody/tr[4]/td[4]"));
//	  calander.click();
	  
//	//month 	:
//      Select month = new Select(driver.findElement(By.className("ui-datepicker-month")));
//      month.selectByVisibleText("May");
//	  
//    //year 	:
//      Select year = new Select(driver.findElement(By.className("ui-datepicker-year")));
//      year.selectByVisibleText("1925");
//	  
//    //day 	:
//      Select day = new Select(driver.findElement(By.className("ui-state-default")));
//      day.selectByVisibleText("10");

        
     // Marital Status: 
      Select marital = new Select(driver.findElement(By.id("txt_marital_status")));
      marital.selectByVisibleText("Unmarried");

    //Mother Name	:
      WebElement mother_name = driver.findElement(By.id("m_mother_name"));
      mother_name.sendKeys("Mother name test");

    //Father Name	:
      WebElement father_name = driver.findElement(By.name("f_father_name"));
      father_name.sendKeys("Father name test");

      //Smart Card:
      WebElement smart_card = driver.findElement(By.name("m_smart_card"));
      smart_card.sendKeys("5698765432");

   // Education Lavel: 
      Select education= new Select(driver.findElement(By.id("m_education_label")));
      education.selectByVisibleText("Graduation");

    //Mobile No:
      WebElement mobile = driver.findElement(By.id("m_mobile_no"));
      mobile.sendKeys("01795780200");

     //Passbook No: 
      WebElement passbook = driver.findElement(By.id("passbook_no"));
      passbook.sendKeys("2");
      
      				//CONATCT DETAILS

      //Present Address:
      //Divison :
      Select presene_address= new Select(driver.findElement(By.name("present_divison")));
      presene_address.selectByVisibleText("Rangpur");
      Thread.sleep(500);

    //District  :
      Select district= new Select(driver.findElement(By.name("present_district")));
      district.selectByVisibleText("Dinajpur");
      Thread.sleep(500);

    //Thana :
      Select thana= new Select(driver.findElement(By.name("present_thana")));
      thana.selectByVisibleText("Dinajpur Sadar");
      Thread.sleep(500);

    //Union  :
      Select union= new Select(driver.findElement(By.name("present_union")));
      union.selectByVisibleText("Dinajpur Pourosova");
      Thread.sleep(500);

    //Village  :
      Select village= new Select(driver.findElement(By.name("present_village_block")));
      village.selectByVisibleText("Bahadurbazar");
      Thread.sleep(500);

    //Working Area :  
      Select working_area= new Select(driver.findElement(By.name("present_working_area")));
      working_area.selectByVisibleText("BAHADUR BAZAR");
      Thread.sleep(1000);

      //Additional Address
      WebElement address = driver.findElement(By.className("present_additional_house"));
      address.sendKeys("386/1 dhaka");
      Thread.sleep(500);
      
    //check_box 
      WebElement check_box = driver.findElement(By.id("same_as_present_address"));
      check_box.click();
      
      				//GARDIAN INFO

    //Religion  :  
      Select religion= new Select(driver.findElement(By.id("m_religion")));
      religion.selectByVisibleText("Muslim");

      //GARDIAN INFO

      //Gardian Name :
      WebElement gardian_name = driver.findElement(By.name("m_member_gardian_name"));
      gardian_name.sendKeys("Gardian Name test");
      
   // calander success
      WebElement gar_dateBox = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[7]/div[2]/div[2]/table/tbody/tr[2]/td[2]/input"));
      gar_dateBox.sendKeys("1980-02-17");

    // Gardian Smart Card:
      WebElement gardian_smart_card = driver.findElement(By.name("m_gardian_smart_card"));
      gardian_smart_card.sendKeys("9871234567");

    //Gardian Mobile No:
      WebElement gardian_mobile = driver.findElement(By.id("m_gardian_mobile_no"));
      gardian_mobile.sendKeys("01795780200");

    //Relation:
      WebElement relation = driver.findElement(By.id("m_gardian_relation"));
      relation.sendKeys("Father");
      
      Thread.sleep(1000);
      //profile pic
      
//      //uplode pic   
//        WebElement uplode = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[9]/div[2]/table/tbody/tr/td[2]/input"));
//        uplode.sendKeys("C:\\Users\\SNI_SHAKIL\\Downloads\\miyako.PNG");
//        

      WebElement save = driver.findElement(By.xpath("/html/body/div[2]/div/section/div/div/div/form/section/div/div/div[2]/div[12]/table/tbody/tr/td/button\r\n"
      		+ ""));
      save.click();





	}


}
