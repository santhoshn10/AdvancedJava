package com;

import org.openqa.selenium.support.PageFactory;

public class Pages {

	public static HomePage HomePage() {
		return new HomePage();
	}

	public static pathPages pathPages() {
		// TODO Auto-generated method stub
		return new pathPages();
	}

	public static PathPage javaPathPage() {
        PathPage javaPathPage= new JavaPathPage();
        PageFactory.initElements(Browser.driver, javaPathPage);
		return javaPathPage;
	}


	
}
