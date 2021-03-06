package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.PageBase;

public class PageCreateLogin extends PageBase {
	
	public void clickNewUserButton() {
		clickButton(By.xpath("//a[.='Novo usu�rio?']"));
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
	
	public String getConfirmAlert() {
		return getTextField(By.xpath("//div[@class='alert alert-success']"));
	}
}
