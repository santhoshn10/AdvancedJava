package com;

import static org.junit.Assert.assertTrue;

import org.junit.After;
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
		Pages.pathPages().goToJavaPathPages();
	    Assert.assertTrue(Pages.pathPages().isAt());
	}
	
	
	@AfterClass
	public static void cleanup(){
		Browser.close();
	}
	

}
