package br.felipewisniewski.core;

import static br.felipewisniewski.core.DriverFactory.getDriver;
import static br.felipewisniewski.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.Dimension;

import br.felipewisniewski.pages.PageLogin;

public class TestBase {
	
	private PageLogin login = new PageLogin();
		
	@Before
	public void startTest() {
		getDriver().get("https://seubarriga.wcaquino.me");
		getDriver().manage().window().setSize(new Dimension(1200, 765));
		
		login.setEmail("james_gosling@sum.com");
		login.setPassword("1234");
		login.login();
	}

	@After
	public void endsTest() {
		if(TestSettings.CLOSE_BROWSER) {
			killDriver();
		}			
	}	
}
