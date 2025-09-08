package Com.Selenium;

import org.testng.annotations.Test;

public class GroupsConceptTestNG {

	@Test(groups="Software Company", priority=1 ,enabled=true)   //set enabled= true so it will execute otherwise set enabled=false then it will not execute
	public void Tcs()
	{
	System.out.println("this is Tata Consultancy Service");
	}
	
	@Test(groups="Software Company",invocationCount=4,description="this method execute 4 times")    //by default priority set 0 so first execute this Method
	public void Wipro()
	{
		System.out.println("This is regarding MNC Company");
	}
	
	@Test(groups="Automobile Company")
	public void punch() {
		System.out.println("this is reated to automobile"); 
	}
	
	@Test(groups="Automobile Company")
	public void creata() {
		System.out.println("becoming more powerful in Market");
	}
}
