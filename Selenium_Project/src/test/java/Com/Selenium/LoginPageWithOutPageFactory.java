package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageWithOutPageFactory {

	WebDriver driver;
	
	public LoginPageWithOutPageFactory(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//input[@id='user-name']")
	 public WebElement userName;
	
	@FindBy(xpath="//input[@id='password']")
	public WebElement password;
	
	@FindBy(xpath="//input[@id='login-button']")
	public WebElement loginBtn;
	
	
//	By userName=By.xpath("//input[@id='user-name']");
//	By password=By.xpath("//input[@id='password']");
//	By loginBtn=By.xpath("//input[@id='login-button']");
	
	public void getUserName(String uName)
	{
		userName.sendKeys(uName);
	}
	
	public void getPassord(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void loginData(String Name,String pass) {
		 userName.sendKeys(Name);
		 password.sendKeys(pass);

		
	}
}
