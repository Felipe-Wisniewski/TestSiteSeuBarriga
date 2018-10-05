package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.PageBase;

public class PageRemoveAccount extends PageBase {
	
	public void removeAccount(String account) {
		clickTableSpanDelete("Conta", account, "A��es", "tabelaContas");
	}
	
	public String getConfirmAlert() {
		return getTextField(By.xpath("//div[@class='alert alert-success']"));
	}

}
