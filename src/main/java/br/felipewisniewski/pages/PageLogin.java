package br.felipewisniewski.pages;

import static br.felipewisniewski.core.Driver.getDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import br.felipewisniewski.core.PageBase;

public class PageLogin extends PageBase {
	
	public void openLoginPage() {
		getDriver().get("https://seubarriga.wcaquino.me");
		getDriver().manage().window().setSize(new Dimension(1200, 765));
	}
	
	public void setEmail(String email) {
		writeText("email", email);
	}
	
	public void setPassword(String password) {
		writeText("senha", password);
	}
	
	public void login() {
		clickButton(By.xpath("//button[@type='submit']"));
	}
	
	public void waitLoadHome() {
		waitForPresenceElement(By.xpath("//div[@class='alert alert-success']"), 30);
	}
	
	public String getConfirmAlert() {
		return getTextField(By.xpath("//div[@class='alert alert-success']"));
	}
}
	
