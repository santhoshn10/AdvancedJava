package com;

public class HomePage {

	static String Url="http://pluralsight.com";
	static String title="Pluralsight | Unlimited Online Developer, IT and Creative Training";

	public void goTo() {

		Browser.goTo(Url);		
	}

	public boolean isAt() {
		return Browser.title().equals(title);
	}

}
