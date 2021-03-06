package com;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Test;

public class UnitTest {
	
	@Test
	public void canGoToHomePage(){
		
		Pages.HomePage().goTo();
		assertTrue(Pages.HomePage().isAt());
		
	}
	
	@Test
	public void canGoToJavaPathPage(){
		
		Pages.pathPages().goTo();
		PathPage pathPage=Pages.pathPages().getPathPage("Java");
		pathPage.goTo();
	    Assert.assertTrue(pathPage.isAtPathPage("Java"));
	}
	
	
	@AfterClass
	public static void cleanup(){
		Browser.close();
	}
	

}
