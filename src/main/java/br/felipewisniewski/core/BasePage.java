package br.felipewisniewski.core;

import static br.felipewisniewski.core.DriverFactory.getDriver;

import org.openqa.selenium.By;

public class BasePage {
		
	/** Write **/
	public void writeText(By by, String text) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(text);
	}
	
	public void writeText(String id, String text) {
		writeText(By.id(id), text);
	}
	
	/** Button **/
	public void clickButton(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clickButton(String id) {
		clickButton(By.id(id));
	}
	
	/** Get Text **/
	public String getTextField(By by) {
		return getDriver().findElement(by).getText();
	}

	public String getTextField(String id) {
		return getTextField(By.id(id));
	}
}
