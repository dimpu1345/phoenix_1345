package Exceldatafetch;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class Signup extends base_classs2
{
	@Test
	public void signup() throws EncryptedDocumentException, IOException {
		
		String FirstName=Generic_excel.getdata("Sheet1", 0, 0);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("userName")))).sendKeys(FirstName);
		String email=Generic_excel.getdata("Sheet1",1,0);
		driver.findElement(By.id("userEmail")).sendKeys(email);
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		String current=Generic_excel.getdata("Sheet1",2,0);
		
		driver.findElement(By.id("currentAddress")).sendKeys(current);
		String permanent=Generic_excel.getdata("Sheet1",3,0);
		driver.findElement(By.id("permanentAddress")).sendKeys(permanent);
		driver.findElement(By.id("submit")).submit();
	}
}