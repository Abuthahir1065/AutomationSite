package com.atmecs.automationSite;

import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.SiteClassAction;

public class Automation_Site extends SetUp {

	@Test(priority = 1)
	public void fillform() throws InterruptedException {

		SiteClassAction fill = new SiteClassAction();
		fill.fillform();

	}
}
