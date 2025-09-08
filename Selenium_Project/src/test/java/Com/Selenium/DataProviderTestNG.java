package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.beust.jcommander.Parameter;

public class DataProviderTestNG {
 
	WebDriver driver;
	
   @Test
	public void lunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		 driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/users/sign_in");
	
	}
    
     @Test(dataProvider="testData")
     public void signInData(String email,String passWord) {
    	
    	driver.findElement(By.xpath("//input[@id='user_email_login']")).sendKeys(email);
    	driver.findElement(By.xpath("//input[@id='user_password']")).sendKeys(passWord);
    	driver.findElement(By.xpath("//input[@id='user_submit']")).click();

     }
     
     @DataProvider(name="testData")
    	 public Object[][] dataProviderfun(){
    	  Object[][] retrunData=new Object[2][2];
    	  
    	  retrunData[0][0]="raghu@123";
    	  retrunData[0][1]="123";
    	  
    	  retrunData[1][0]="Riya@123";
    	  retrunData[1][1]="567";
    	  
			return retrunData;
    	 
    	 }
    	 
    	 
     
     
     
     
}
