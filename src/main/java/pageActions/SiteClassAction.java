package pageActions;

import java.util.Properties;

import browser.SetUp;
import constant.Constant;
import helper.HelperClass;
import reader.PropertyReader;

public class SiteClassAction extends SetUp {

	Properties Location_path, Data_path;

	public void fillform() throws InterruptedException {
		Location_path = PropertyReader.readProperty(Constant.LOCATOR_FILE_PATH);
		Data_path = PropertyReader.readProperty(Constant.DATA_FILE_PATH);

		HelperClass.ElementSendKeys(driver, Location_path.getProperty("FirstNameXpath"),
				Data_path.getProperty("FirstName"));
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("LastNameXpath"),
				Data_path.getProperty("LastName"));
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("TextAreaXpath"),
				Data_path.getProperty("Address"));
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("MailXpath"), Data_path.getProperty("Email"));
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("PhoneNoXpath"),
				Data_path.getProperty("PhoneNo"));
		HelperClass.elementClick(driver, Location_path.getProperty("GenderXpath"));
		HelperClass.selectElementById(driver, Location_path.getProperty("HobbiesId"));
		HelperClass.elementClick(driver, Location_path.getProperty("LanguageXpath"));

		HelperClass.elementClick(driver, Location_path.getProperty("ArabicXpath"));
		HelperClass.elementClick(driver, Location_path.getProperty("EnglisgXpath"));
		HelperClass.selectFromDropDown(driver, Location_path.getProperty("SkillsXpath"),
				Location_path.getProperty("SkillsValue"));
		HelperClass.selectFromDropDown(driver, Location_path.getProperty("CountryXpath"),
				Location_path.getProperty("CountryValue"));

		HelperClass.elementClick(driver, Location_path.getProperty("CountryComboBoxXpath"));
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("SelectValueXpath"),
				Location_path.getProperty("SelectedValue"));
		HelperClass.enterElement(driver, Location_path.getProperty("ValueXpath"));

		HelperClass.selectFromDropDown(driver, Location_path.getProperty("YearXpath"),
				Location_path.getProperty("SelectedYear"));

		HelperClass.selectFromDropDown(driver, Location_path.getProperty("MonthXpath"),
				Location_path.getProperty("SelectedMonth"));
		HelperClass.selectFromDropDown(driver, Location_path.getProperty("DayXpath"),
				Location_path.getProperty("SelectedDay"));

		Thread.sleep(3000);
		HelperClass.ElementSendKeys(driver, Location_path.getProperty("PasswordXpath"),
				Data_path.getProperty("Password"));

		HelperClass.ElementSendKeys(driver, Location_path.getProperty("PasswordConfirmXpath"),
				Data_path.getProperty("ConfirmPassword"));
		HelperClass.elementClick(driver, Location_path.getProperty("SubmitButton"));

	}

}
