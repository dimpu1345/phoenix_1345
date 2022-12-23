package groupExecution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParametrsExample 
{
	@Parameters({"url","key","value"})
	@Test
	public void sample(String url,String key,String value)
	{
		System.setProperty(key, value);
		WebDriver driver =new FirefoxDriver();
		driver.get(url);
	}
	

}
