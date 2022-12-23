package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomClass {
	@FindBy(id="email")
	private WebElement user_name;
	
	public PomClass(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	public void username(String user)
	{
		user_name.sendKeys(user);
	}

}
