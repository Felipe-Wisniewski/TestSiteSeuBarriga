package br.felipewisniewski.tests;

import static br.felipewisniewski.core.Driver.getDriver;
import static br.felipewisniewski.core.Driver.killDriver;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;

import br.felipewisniewski.core.Mass;
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
		newUser.setName(Mass.userName);
		newUser.setEmail(Mass.userEmail);
		newUser.setPassword(Mass.userPassword);
		newUser.clickRegisterButton();
		
		Assert.assertEquals("Usu�rio inserido com sucesso", newUser.getConfirmAlert());		
	}
}
