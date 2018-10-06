package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.PageBase;

public class PageMenu extends PageBase {

	public void openAddAccount() {
		clickButton(By.xpath("//a[@class='dropdown-toggle']"));
		clickButton(By.xpath("//a[contains(text(),'Adicionar')]"));		
	}
	
	public void openListAccounts() {
		clickButton(By.xpath("//a[@class='dropdown-toggle']"));
		clickButton(By.xpath("//a[contains(text(),'Listar')]"));		
	}
	
	public void openCreateMovement() {
		clickLink("Criar Movimentação");
	}
	
	public void openSummaryMonthly() {
		clickLink("Resumo Mensal");
	}	
	
	public void logout() {
		clickLink("Sair");
	}	
}
