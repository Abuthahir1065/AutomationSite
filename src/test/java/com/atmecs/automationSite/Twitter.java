package com.atmecs.automationSite;

import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.TwitterClass;

public class Twitter extends SetUp {
	@Test(priority = 3)
	public void twitter() throws InterruptedException {

		TwitterClass tweet = new TwitterClass();
		tweet.twitter();

	}
}
