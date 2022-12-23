package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class Hello {
	@Test
	public void script() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		PomClass pmc = new PomClass(driver);
		pmc.username("Hi");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		pmc.username("Hello");
		
	}

}
