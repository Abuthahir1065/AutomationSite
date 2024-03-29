package helper;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {

	static WebDriver driver;

	public HelperClass(WebDriver driver) {
		this.driver = driver;
	}

	public static void elementClick(WebDriver driver, String xpath) {
		driver.findElement(By.xpath(xpath)).click();

	}

	public static void selectElementById(WebDriver driver, String idPath) {
		driver.findElement(By.id(idPath)).click();
	}

	public static void ElementSendKeys(WebDriver driver, String xpath, String key) {
		driver.findElement(By.xpath(xpath)).sendKeys(key);
	}

	public static void enterElement(WebDriver driver, String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		element.click();
		Actions click = new Actions(driver);

		click.sendKeys(Keys.ENTER).perform();

	}

	public static void selectFromDropDown(WebDriver driver, String xpath, String value) {
		Select choose = new Select(driver.findElement(By.xpath(xpath)));
		choose.selectByValue(value);

	}

}
