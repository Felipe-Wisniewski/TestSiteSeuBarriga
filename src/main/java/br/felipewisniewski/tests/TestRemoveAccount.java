package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import br.felipewisniewski.core.Mass;
import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.pages.PageMenu;
import br.felipewisniewski.pages.PageRemoveAccount;

public class TestRemoveAccount extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageRemoveAccount remove = new PageRemoveAccount();

	@Test
	public void testRemoveAccount() {
		ExtentTest test = getExtent().createTest("testRemoveAccount");
		
		menu.openListAccounts();
		remove.removeAccount(Mass.accountName2);
		Assert.assertEquals("Conta removida com sucesso!", remove.getConfirmAlert());
		
		test.log(Status.PASS, "pass");
	}
	
	
}
