package com;


public class pathPages {

	static String Url="https://www.pluralsight.com/paths";
	static String title="Java Programming Learning Path | Pluralsight";

	public void goTo() {

		Browser.goTo(Url);		
	}

    public PathPage getPathPage(String page){
    	switch (page) {
		case "Java":
			
			return Pages.javaPathPage();

		}
    	return null;
    }
    
	public Boolean isAt() {
		return Browser.title().equals(title);
	}

	
}
