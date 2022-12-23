package scipts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
public class Base_class_P {
	
	
		public static WebDriver driver;
		public static WebDriverWait wait;
		
		@BeforeMethod

		public void openapp()
		{
			System.setProperty("webdriver.chrome.driver","./softwares/chromedriver.exe");
			driver =new ChromeDriver();
			Reporter.log("Browser launched",true);
			driver.manage().window().maximize();
			driver.get("https://demoqa.com/text-box");
			wait=new WebDriverWait(driver, 30);
			Reporter.log("Application launched",true);
		}
		
		@AfterMethod
		public void closeapp()
		{
			
			driver.close();
		}
	}



