package Com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTestPom {

	WebDriver driver;
	
	@Test(priority=0)
	public void setUp() throws InterruptedException {
		
	 	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.get("https://www.saucedemo.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(4000);
	}
	
	
	@Test(priority=1)
	public void loginCredential() {
		
//	 LoginPageWithOutPageFactory fatchData=new LoginPageWithOutPageFactory(driver);  //create an object of LoginPageForPom class for interact with those properites and behaviour

	 
	 LoginPageWithPageFactory  fatchData=new LoginPageWithPageFactory(driver);
	 
	 fatchData.loginData("standard_user", "secret_sauce");
	 
//	 fatchData.getUserName("raghu");
//	 fatchData.getPassord("1234");
	 fatchData.clickOnLoginBtn();
	 driver.close();
	}
}
