package com.atmecs.automationSite;

import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.GooglePlusClass;

public class GooglePlus extends SetUp {

	@Test(priority = 5)
	public void gplus() throws InterruptedException {

		GooglePlusClass object = new GooglePlusClass();
		object.googlePlusMethod();

	}

}
