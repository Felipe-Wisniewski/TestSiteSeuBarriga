package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.PageBase;

public class PageCreateMovement extends PageBase {
	
	public void selectTypeMovement(String typeMovement) {
		selectDropDownList("tipo", typeMovement);
	}
	
	public void setDateMovement(String date) {
		writeText("data_transacao", date);
	}
	
	public void setDatePayment(String date) {
		writeText("data_pagamento", date);
	}
	
	public void setDescriptionMovement(String description) {
		writeText("descricao", description);
	}
	
	public void setInterested(String interested) {
		writeText("interessado", interested);
	}
	
	public void setValueMovement(String value) {
		writeText("valor", value);
	}
	
	public void selectAccountMovement(String account) {
		selectDropDownList("conta", account);
	}
	
	public void selectSituationMovement(String situation) {
		if(situation.toUpperCase() == "PAGO") clickRadioButton("status_pago");
		if(situation.toUpperCase() == "PENDENTE") clickRadioButton("status_pendente");
	}
	
	public void saveButton() {
		clickButton(By.xpath("//button[@type='submit']"));
	}
	
	public String getAlertSuccess() {
		return getTextField(By.xpath("//div[@class='alert alert-success']"));
	} 
}
