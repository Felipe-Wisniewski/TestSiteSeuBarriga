package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import br.felipewisniewski.core.Mass;
import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.pages.PageAddAccount;
import br.felipewisniewski.pages.PageMenu;

public class TestAddAccounts extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageAddAccount add = new PageAddAccount();
	
	@Test
	public void testAddAccountOne() {
		menu.openAddAccount();
		
		add.setNameNewAccount(Mass.accountName1);
		
		Mass.accountName2 = Mass.accountName1;
		Mass.accountName1 = "Mr " + System.currentTimeMillis();
		
		add.clickSaveNewAccount();
		
		Assert.assertEquals("Conta adicionada com sucesso!", add.getAlertSuccess());
	}
	
	@Test
	public void testAddAccountTwo() {
		menu.openAddAccount();
		System.out.println("testAddAccountTwo ----> c1: " + Mass.accountName1 + " - c2: " + Mass.accountName2);
		add.setNameNewAccount(Mass.accountName1);		
		add.clickSaveNewAccount();
		
		Assert.assertEquals("Conta adicionada com sucesso!", add.getAlertSuccess());
	}
}
