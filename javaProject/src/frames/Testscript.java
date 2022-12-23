package frames;

//import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Testscript extends Base_class
{
	@Test
	public void demoqa()
	{
	   wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys("vade");
	   Reporter.log("username enterered...",true);
		driver.findElement(By.id("userEmail")).sendKeys("vade@sambar.com");
		Reporter.log("Email  entered...",true);
		driver.findElement(By.id("currentAddress")).sendKeys("Sumadura Darshini");
		Reporter.log("current Addr  entered...",true);
		driver.findElement(By.id("permanentAddress")).sendKeys("GD BAR");
		Reporter.log("permanent Addr  entered...",true);
		driver.findElement(By.id("submit")).submit();;
		Reporter.log("All the data is submitted...",true);		   	   	   	   
			   
			   
			   
			   
	}

}
