package testCase;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunction.CommonFunctions;
import pageObjectModel.SettingsHolidaySettingsPOM;

public class SettingsHolidaySettingsTC extends CommonFunctions
{
	@Test
	public void toggleMenu() throws InterruptedException 
	{
		PageFactory.initElements(driver,SettingsHolidaySettingsPOM.class);
//		SettingsHolidaySettingsPOM.toggleMenu.click();
//		
//		SettingsHolidaySettingsPOM.companyButton.click();
		SettingsHolidaySettingsPOM.settingsMenu.click();
		System.out.println("Settings main menu is clicked");
	
		SettingsHolidaySettingsPOM.holidaySettings.click();
		System.out.println("Holiday Settings submenu is clicked");
		
		SettingsHolidaySettingsPOM.createHistory.click();
		System.out.println("Create history button is clicked");
		
		SettingsHolidaySettingsPOM.holidayName.click();
		SettingsHolidaySettingsPOM.holidayName.sendKeys(properties.getProperty("userName"));
		
		SettingsHolidaySettingsPOM.holidayType.click();
		Actions actions = new Actions(driver);
        actions.sendKeys((properties.getProperty("holidayType")), Keys.ENTER).perform();
		//SettingsHolidaySettingsPOM.holidayType.submit();
        
        SettingsHolidaySettingsPOM.createHolidayDescription.sendKeys(properties.getProperty("description"));
        SettingsHolidaySettingsPOM.selectDate.sendKeys(properties.getProperty("selectDate"));
	}

}
