package verification;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HardAssert {
	@Test
	public void verify()
	{
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	 WebDriver driver =new FirefoxDriver();
	 driver.get("https://facebook.com");
	 driver.manage().window().maximize();
	 String title=driver.getTitle();
	 Assert.assertEquals(title, "Facebook – log in or sign up");
	 driver.findElement(By.id("email")).sendKeys("123");
	 driver.findElement(By.id("pass")).sendKeys("456");
	 driver.findElement(By.name("login")).click();
	}
}
			 
	 


