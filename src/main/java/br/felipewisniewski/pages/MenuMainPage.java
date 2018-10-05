package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.BasePage;

public class MenuMainPage extends BasePage {

	public void clickAddAccount() {
		clickButton(By.xpath("//a[@class='dropdown-toggle']"));
		clickButton(By.xpath("//a[contains(text(),'Adicionar')]"));		
	}
	
	public void clickListAccounts() {
		clickButton(By.xpath("//a[@class='dropdown-toggle']"));
		clickButton(By.xpath("//a[contains(text(),'Listar')]"));		
	}

}
