package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.BasePage;

public class CreateLoginPage extends BasePage {
	
	public void clickNewUserButton() {
		clickButton(By.xpath("//a[.='Novo usuário?']"));
	}

	public void setName(String name) {
		writeText("nome", name);
	}
	
	public void setEmail(String email) {
		writeText("email", email);
	}
	
	public void setPassword(String password) {
		writeText("senha", password);
	}
	
	public void clickRegisterButton() {
		clickButton(By.xpath("//input[@value='Cadastrar']"));
	}
}
