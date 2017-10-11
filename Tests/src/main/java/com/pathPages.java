package com;

import org.openqa.selenium.By;

public class pathPages {

	static String Url="https://www.pluralsight.com/paths";
	static String title="Java Programming Learning Path | Pluralsight";

	public void goTo() {

		Browser.goTo(Url);		
	}

	public void goToJavaPathPages() {
		
		Browser.driver.findElement(By.xpath("//div[@id='pathContent']/div[67]/a/div/div[2]")).click();
		
	}

	public Boolean isAt() {
		return Browser.title().equals(title);
	}

	
}
