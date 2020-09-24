package com.atmecs.automationSite;

import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.LinkedInClass;

public class LinkedIn extends SetUp {
	@Test(priority = 6)
	public void gplus() throws InterruptedException {

		LinkedInClass link = new LinkedInClass();
		link.linkedIn();

	}

}
