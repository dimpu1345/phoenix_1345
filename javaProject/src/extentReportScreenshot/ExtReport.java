package extentReportScreenshot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.github.dockerjava.api.model.Driver;

public class ExtReport {
	@Test
	public void Screenshot()
	{
	ExtentHtmlReporter report=new ExtentHtmlReporter("./ExtentReport/extent.html");
	ExtentReports reports=new ExtentReports();
	reports.attachReporter(report);
	ExtentTest test=reports.createTest("ExtentTest");
	System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	test.log(Status.INFO,"FIREFOX BROWSER IS LAUNCHED");
	driver.get("https://www.youtube.com");
	test.log(Status.INFO,"APPLICATION IS LAUNCHED");
	String title = driver.getTitle();
	if(title.equals("Youtube"))
	{
		test.log(Status.PASS,"Home page is displayed");
	}
	else
	{
		test.log(Status.FAIL,"Home page is not displayed");
		
	}
	driver.close();
	test.log(Status.INFO,"Application is closed");
	reports.flush();

	
	
	
	
	
	

}
}
