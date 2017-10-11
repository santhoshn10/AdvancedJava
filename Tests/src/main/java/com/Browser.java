package com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Browser {


	static WebDriver driver=new FirefoxDriver();

	public static void goTo(String Url) {
		driver.get(Url);
	}

	public static String title() {
		// TODO Auto-generated method stub
		return driver.getTitle();
	}

	public static void close() {
		driver.close();
	}


}
