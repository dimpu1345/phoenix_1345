package scipts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

import frames.Base_class;

public class TS_1 extends Base_class_P 
{
	
	@Test(dataProvider="SignupCredentials",dataProviderClass = DataProviderClass.class)
	
	public void signup(String Firstname,String email,String current,String permanent)
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys("vade");
		driver.findElement(By.id("userEmail")).sendKeys(email);
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,300)");
		driver.findElement(By.id("currentAddress")).sendKeys(current);
		driver.findElement(By.id("permanentAddress")).sendKeys(permanent);
		driver.findElement(By.id("submit")).submit();
			
	}
}
