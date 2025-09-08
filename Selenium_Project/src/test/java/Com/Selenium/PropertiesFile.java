package Com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.Selenium.utility.ReadConfigFile;

public class PropertiesFile {


	WebDriver driver;
	public ReadConfigFile fatchPropertiesData=new ReadConfigFile();

	@Test(priority=0)
	public void setUp() throws InterruptedException {
		
	 	 System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		 driver=new ChromeDriver();
		 
		 driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	}
	
	@Test(priority=1)
	public void loginData() {
		
		PropertiesFileWithPageFactory readData=new PropertiesFileWithPageFactory(driver);
	

//		String a=fatchPropertiesData.properties.getProperty("UserName");
//		String b=fatchPropertiesData.properties.getProperty("PassWord");
		
		readData.loginCredentails(fatchPropertiesData.getUserName(),fatchPropertiesData.getPassword() );
		readData.loginButton();
		
	}
	  
}
