package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.pages.PageLogin;

public class TestLogin extends TestBase {
			
	private PageLogin login = new PageLogin();
	
	@Test
	public void testLogin() {
		ExtentTest test = getExtent().createTest("testLogin");
				
		login.waitLoadHome();
		String[] text = login.getConfirmAlert().split(" ");
		String msg = text[0] + " " + text[1];	
		Assert.assertEquals("Bem vindo,", msg);
		
		test.log(Status.PASS, "pass");
	}
}
