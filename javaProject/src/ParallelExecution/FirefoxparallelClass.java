package ParallelExecution;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirefoxparallelClass {
	public static WebDriver driver;
	@BeforeMethod
	public void openapp() 
	{
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void script() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.findElement(By.id("email")).sendKeys("123456");
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void closeapp()
	{
		driver.close();
	}

}
