package br.felipewisniewski.pages;

import org.openqa.selenium.By;

import br.felipewisniewski.core.PageBase;

public class PageSummaryMonthly extends PageBase {
	
	public void selectMonth(String month) {
		selectDropDownList("mes", month);
	}
	
	public void selectYear(String year) {
		selectDropDownList("ano", year);
	}
	
	public void clickSearch() {
		clickButton(By.xpath("//input[@value='Buscar']"));
	}
	
	public String checkMonth() {
		return getTextField(By.xpath("//*[@id='mes']/option[@selected='']"));
	}
}
