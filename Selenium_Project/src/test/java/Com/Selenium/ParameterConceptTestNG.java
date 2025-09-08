package Com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterConceptTestNG {
	 static WebDriver driver;
	
	 
	@Parameters({"browser"})
	@BeforeTest
	public void setUp(String browser)
	{	    
		if(browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
		driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\HP\\Documents\\geckodriver.exe");
			driver=new FirefoxDriver();	
		}
		driver.manage().window().maximize();
	}
	
	@Parameters({"url"})
	@Test
	public void openUrl(String url) {
		driver.get(url);
	
	}
	
	@Test(priority=1)
	public void checkTitle() throws InterruptedException
	{   
		Thread.sleep(5000);
		String title=driver.getTitle();
        System.out.println("getting title is :"+title);
	}
	
//	
//	@AfterTest
//	public void closeBrowser() {
//	driver.close();
//	}
//	
//	
//	
	

}
