package Com.Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageWithPageFactory {

	WebDriver driver;
	
	public LoginPageWithPageFactory(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By userName=By.xpath("//input[@id='user-name']");
	By password=By.xpath("//input[@id='password']");
	By loginBtn=By.xpath("//input[@id='login-button']");
	
	public void getUserName(String uName)
	{
		driver.findElement(userName).sendKeys(uName);
	}
	
	public void getPassord(String pwd)
	{
		driver.findElement(password).sendKeys(pwd);
	}
	
	public void clickOnLoginBtn() {
		driver.findElement(loginBtn).click();
	}
	
	public void loginData(String Name,String pass) {
		driver.findElement(userName).sendKeys(Name);
		driver.findElement(password).sendKeys(pass);

		
	}
}
