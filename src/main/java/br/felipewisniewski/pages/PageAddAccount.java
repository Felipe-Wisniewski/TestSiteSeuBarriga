package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.PageBase;

public class PageAddAccount extends PageBase {
	
	public void setNameNewAccount(String name) {
		writeText("nome", name);
	}
	
	public void clickSaveNewAccount() {
		clickButton(By.xpath("//button[@type='submit']"));
	}
	
	public String getAlertSuccess() {
		return getTextField(By.xpath("//div[@class='alert alert-success']"));
	}
}
