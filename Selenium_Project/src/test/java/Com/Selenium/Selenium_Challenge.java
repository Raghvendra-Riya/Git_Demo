package Com.Selenium;


import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



  public class Selenium_Challenge {

	public static void main(String[] args) throws InterruptedException, IOException {
		
	//@Test(enabled=true)
//	public void demo() throws InterruptedException
//	{
//	
	 // System Property for Chrome Driver
       System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Documents\\chromedriver.exe");

      // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        //Dynamic wait
        driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       
        driver.get("https://www.rediff.com/");
        driver.findElement(By.xpath("//a[text()='Sign in']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[text()='Log In']")).click();
        Thread.sleep(2000);
        Alert a=driver.switchTo().alert();
        System.out.println(a.getText());
        a.accept();  //click on ok button
        a.dismiss(); //cancle the button
        a.getText(); //et some text element
        a.sendKeys("fill some value");
        System.out.print("successfully done");
        
        
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("perform where i have mouse hovering"))).build().perform();   //perform mouse hovering opeartion
        
        act.clickAndHold(driver.findElement(By.xpath("source element"))).moveToElement(driver.findElement(By.xpath("target Element")))
        .release()
        .build()
        .perform();      //perform drag and drop oppration
        
        
       act.doubleClick();  //perform double click operation
       
       act.contextClick(driver.findElement(By.xpath("Perfrom right click opeartin")));  //perform right click opeartion
       
    //creating XPATH USING contains and starts-with and ends-with
       
    //input[contains(@class,'acttextbox')];
       

   //Dynamic id : input
   //  id=test_123;
   
    //check with contains
    driver.findElement(By.xpath("input[contains(@id,'test_')]"));
       
     //starts-with  
    //id=test_789
    //id=test_356
    driver.findElement(By.xpath("//input[starts-with(@id,'test_')]"));    
	
	//ends-with
   
    //id=test_356 
	driver.findElement(By.xpath("//input[ends-with(@id,'_356')]"));
	
	//sign in text by using contains
	driver.findElement(By.xpath("//a[contains(text(),'sign in')]"));
	
	
	//handle multiple window
	String parentWindow=driver.getWindowHandle();
	Set<String> Window=driver.getWindowHandles();
	Iterator<String> itr=Window.iterator();
	 while(itr.hasNext())
	 {
	    String childwindow=itr.next();
	    if(!parentWindow.equals("childwindow")) {
		driver.switchTo().window(childwindow);   
		   
		//perform some opeartion   
	    }      
	 }
	 driver.switchTo().window(parentWindow);// again back to parent window
	 
	
	
	// takeScreenShot in selenium //
	//capture full page screenshot
   //step 1: convert webdriver object to TakeScreenShot interface
	
	TakesScreenshot screen=((TakesScreenshot)driver);
	
	//step 2: call getScrenShotAs method to create image file
	
	  File src=screen.getScreenshotAs(OutputType.FILE);
	  File des=new File("set location where we have to store image or scrrenshot");
	
	//setp3: copy image file to destination file
	  
	  FileUtils.copyFile(src,des);
	  
	  
	  
	
	
	
	
	
	
	
	}
          
        
	

}
