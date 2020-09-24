package com.atmecs.automationSite;

import org.testng.annotations.Test;

import browser.SetUp;
import pageActions.YoutubeClass;

public class Youtube extends SetUp {
	@Test(priority = 4)
	public void youtube() throws InterruptedException {

		YoutubeClass video = new YoutubeClass();
		video.youtube();

	}

}
