package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPOM 
{
	@FindBy(id = "floating_filled_email")
	public static WebElement emailAddress;
	
	@FindBy(id = "floating_filled_password")
	public static WebElement password;
	
	@FindBy(xpath = "//button/span[text()='Sign In']")
	public static WebElement signIn;

}
