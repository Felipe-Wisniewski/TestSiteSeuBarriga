package br.felipewisniewski.tests;

import static br.felipewisniewski.core.DriverFactory.getDriver;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import br.felipewisniewski.core.BaseTest;

public class TestLogin extends BaseTest {
			
	@Test
	public void testLogin() {
		WebDriverWait wait = new WebDriverWait(getDriver(), 30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-success']")));
		String[] text = getDriver().findElement(By.xpath("//div[@class='alert alert-success']")).getText().split(" ");
		String msg = text[0] + " " + text[1];
	
		Assert.assertEquals("Bem vindo,", msg);
	}
	
	

}
