package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.pages.PageAddAccount;
import br.felipewisniewski.pages.PageMenu;

public class TestAddAccount extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageAddAccount add = new PageAddAccount();
	
	@Test
	public void testAddAccount() {
		menu.openAddAccount();
		
		add.setNameNewAccount("Steve");
		add.clickSaveNewAccount();
		
		Assert.assertEquals("Conta adicionada com sucesso!", add.getAlertSuccess());
	}
}
