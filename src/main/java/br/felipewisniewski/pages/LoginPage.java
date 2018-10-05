package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.BasePage;

public class LoginPage extends BasePage {
	
	public void setEmail(String email) {
		writeText("email", email);
	}
	
	public void setPassword(String password) {
		writeText("senha", password);
	}
	
	public void login() {
		clickButton(By.xpath("//button[@type='submit']"));
	}
}
