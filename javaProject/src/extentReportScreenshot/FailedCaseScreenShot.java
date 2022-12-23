package extentReportScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class FailedCaseScreenShot {
	
   public static WebDriver driver;
   @Test
	public void  passscreenshot() throws IOException
	{
		ExtentHtmlReporter reporter=new ExtentHtmlReporter("./ExtentReport/extent.html");
		ExtentReports reports=new ExtentReports();
		reports.attachReporter(reporter);
		ExtentTest test=reports.createTest("ExtentTest");
		System.setProperty("webdriver.gecko.driver","./softwares/geckodriver.exe");
		driver=new FirefoxDriver();
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
			test.log(Status.FAIL,"Homepage is not displayed");
			test.addScreenCaptureFromPath(screenshotpic());
			
		}
		driver.close();
		test.log(Status.INFO,"Application is closed");
		reports.flush();

	}

	
	public static String screenshotpic() throws IOException
	{ 
		String path="C:\\Users\\Rajashekar B\\Documents\\seleniumscreenshot\\pic.jpeg";
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src= ts.getScreenshotAs(OutputType.FILE);
		File dst=new File(path);
		FileHandler.copy(src, dst);
		
		return path;
	}
		
	}	
	


