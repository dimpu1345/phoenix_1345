package frames;
import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Reporter;
public class TS2 extends BC2
{
	@Test
   public void openapplication() 
	{
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("email")))).sendKeys("Emailaddress");
	    Reporter.log("email enterered...",true);
		driver.findElement(By.id("pass")).sendKeys("password");
		Reporter.log("password  entered...",true);
		driver.findElement(By.name("login")).click();
		Reporter.log("All the data is submitted...",true);
   }
}