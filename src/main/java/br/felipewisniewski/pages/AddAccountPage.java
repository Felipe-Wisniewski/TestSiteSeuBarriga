package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.BasePage;

public class AddAccountPage extends BasePage {
	
	public void setNameNewAccount(String name) {
		writeText("nome", name);
	}
	
	public void clickSaveNewAccount() {
		clickButton(By.xpath("//button[@type='submit']"));
	}
}
