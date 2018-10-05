package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.pages.PageMenu;
import br.felipewisniewski.pages.PageRemoveAccount;

public class TestRemoveAccount extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageRemoveAccount remove = new PageRemoveAccount();

	@Test
	public void testRemoveAccount() {
		menu.openListAccounts();
		remove.removeAccount("Conta para alterar");
		Assert.assertEquals("Conta removida com sucesso!", remove.getConfirmAlert());
	}
	
	
}
