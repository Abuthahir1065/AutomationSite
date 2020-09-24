package com.atmecs.automationSite;

import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.FaceBookClass;

public class Facebook extends SetUp {

	@Test(priority = 2)
	public void facebook() throws InterruptedException {

		FaceBookClass handle = new FaceBookClass();
		handle.facebook();

	}
}
