package Com.Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PropertiesFileWithPageFactory {
	
	WebDriver driver;
	
	
	public PropertiesFileWithPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	//Create a webelement locators
	
	@FindBy(xpath="//input[@name='username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@name='password']")
	public WebElement password;
	
	@FindBy(xpath="//button[text()=' Login ']")
	public WebElement loginBtn;
	
	
	 public void loginCredentails(String uName,String pWord) {
		 userName.sendKeys(uName);
		 password.sendKeys(pWord);
	 }
	 
	 public void loginButton() {
		 loginBtn.click();
	 }

}
