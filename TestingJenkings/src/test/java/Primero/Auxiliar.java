package Primero;

import org.junit.Test;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class Auxiliar {

	@Test
	public void HtmlUnitTest() {
		
		HtmlUnitDriver Htdriver = new HtmlUnitDriver();
		Htdriver. get("https://google.com/");
		String pageTitle = Htdriver.getTitle();
		System.out.println(pageTitle);
		
	}
	
}
