package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import br.felipewisniewski.core.BaseTest;
import br.felipewisniewski.pages.AddAccountPage;
import br.felipewisniewski.pages.MenuMainPage;

public class TestAddAccount extends BaseTest {
	
	private MenuMainPage menu = new MenuMainPage();
	private AddAccountPage add = new AddAccountPage();
	
	@Test
	public void testAddAccount() {
		menu.clickAddAccount();
		add.setNameNewAccount("Steve");
		add.clickSaveNewAccount();
		
		Assert.assertEquals("Conta adicionada com sucesso!", 
				add.getTextField(By.xpath("//div[@class='alert alert-success']")));
	}

}
