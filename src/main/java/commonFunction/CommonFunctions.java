package commonFunction;

import java.io.FileInputStream;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import pageObjectModel.LoginPOM;

public class CommonFunctions 
{
	public static WebDriver driver;
	public static Properties properties;
	
	@BeforeTest
	public void main() throws Exception
	{
		FileInputStream stream = new FileInputStream("loyaltri.properties");
		properties = new Properties();
		properties.load(stream);
		driver = new ChromeDriver();
		//return properties;
	
		//propertyFiles();
		String url = properties.getProperty("URL");

		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
		
		//-----------------------------------Login Starts--------------------------------
		
		PageFactory.initElements(driver, LoginPOM.class);
		
		LoginPOM.emailAddress.click();
		LoginPOM.emailAddress.sendKeys(properties.getProperty("userName"));
		LoginPOM.password.click();
		LoginPOM.password.sendKeys(properties.getProperty("password"));
		LoginPOM.signIn.click();
	}		
	
//	@AfterTest(enabled = true)
//	public void close() throws Exception 
//	{
//		driver.close();
//	}

}
