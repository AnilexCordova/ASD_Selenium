package pageObjectModel;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsHolidaySettingsPOM 
{
//	@FindBy(xpath = "//div[@class='hamburger w-7 h-6 2xl:h-[38px] 2xl:w-[50px] rounded-md 2xl:rounded-xl bg-white bg-opacity-10 flex justify-center items-center p-[6px]']")
//	public static WebElement toggleMenu;
//	
//	@FindBy(xpath = "//div[@class='flex items-center justify-between']//parent::button[@type='button']")
//	public static WebElement companyButton;
	
	@FindBy(xpath = "(//div//following::ul)//p[text()='Settings']")
	public static WebElement settingsMenu;
	
	@FindBy(xpath = "//a[text()='Holiday Settings']")
	public static WebElement holidaySettings;
	
	@FindBy(xpath = "//span[text()='Create Holiday ']")
	public static WebElement createHistory;
	
	@FindBy(xpath = "//input[@placeholder='Enter Holiday Name']")
	public static WebElement holidayName;
	
	@FindBy(xpath = "(//input[@type='search'])[1]")
	public static WebElement holidayType;
	
	@FindBy(xpath = "//textarea[@rows='4']")
	public static WebElement createHolidayDescription;
	
	@FindBy(xpath = "//input[@placeholder='Select Date']")
	public static WebElement selectDate;

}
