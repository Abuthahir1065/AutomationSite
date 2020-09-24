package pageActions;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;


import browser.SetUp;
import constant.Constant;
import helper.HelperClass;
import reader.PropertyReader;

public class YoutubeClass extends SetUp {
	Properties Location_path, Data_path;

	public void youtube() {
		Location_path = PropertyReader.readProperty(Constant.LOCATOR_FILE_PATH);
		Data_path = PropertyReader.readProperty(Constant.DATA_FILE_PATH);
		HelperClass.elementClick(driver, Location_path.getProperty("YoutubeXpath"));

		String parent = driver.getWindowHandle();

		Set<String> s = driver.getWindowHandles();

		// Now iterate using Iterator
		Iterator<String> I1 = s.iterator();

		while (I1.hasNext()) {

			String child_window = I1.next();

			if (!parent.equals(child_window)) {
				driver.switchTo().window(child_window);

				System.out.println(driver.switchTo().window(child_window).getTitle());

				driver.close();
			}

		}
		// switch to the parent window
		driver.switchTo().window(parent);

	}

}
