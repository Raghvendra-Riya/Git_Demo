package Com.Selenium;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToSpecificWindow {

	public static void main(String[] args) throws InterruptedException {
		 
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        
        driver.get("https://opensource-demo.orangehrmlive.com/web/auth/login");
        
        Thread.sleep(4000);
		
        driver.findElement(By.xpath("//a[contains(@href,'https://www.linkedin.com/company/orangehrm/mycompany/')]")).click();
        driver.findElement(By.xpath("(//a[contains(@href,'https://www.facebook.com/OrangeHRM/')])[1]")).click();
//        driver.findElement(By.xpath("(//a[contains(@href,'https://www.facebook.com/OrangeHRM/')])[2]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'https://twitter.com/orangehrm?lang=en')]")).click();
        driver.findElement(By.xpath("//a[contains(@href,'https://www.youtube.com/c/OrangeHRMInc')]")).click();

        List<String> windlist=new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windlist.get(3));  
        System.out.println("finally swithed to second tab:");
       
    
          
	}
}

