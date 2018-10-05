package br.felipewisniewski.tests;

import static br.felipewisniewski.core.DriverFactory.getDriver;
import static br.felipewisniewski.core.DriverFactory.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import br.felipewisniewski.pages.PageCreateLogin;

public class TestCreateLogin {

	private PageCreateLogin newUser = new PageCreateLogin();
	
	@Before
	public void startTest() {
		getDriver().get("https://seubarriga.wcaquino.me");
		getDriver().manage().window().setSize(new Dimension(1200, 765));
	}

	@After
	public void endsTest() {
		killDriver();	
	}	
	
	@Test
	public void testCreateNewLogin() {
		newUser.clickNewUserButton();
		newUser.setName("James Gosling");
		newUser.setEmail("james_gosling@sum.com");
		newUser.setPassword("1234");
		newUser.clickRegisterButton();
		
		Assert.assertEquals("Usuário inserido com sucesso", newUser.getConfirmAlert());		
	}
}
