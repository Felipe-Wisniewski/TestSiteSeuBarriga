package br.felipewisniewski.core;

import static br.felipewisniewski.core.DriverFactory.getDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PageBase {
		
	/** Write **/
	public void writeText(By by, String text) {
		getDriver().findElement(by).clear();
		getDriver().findElement(by).sendKeys(text);
	}
	
	public void writeText(String textAreaId, String text) {
		writeText(By.id(textAreaId), text);
	}
	
	/** Button **/
	public void clickButton(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clickButton(String buttonId) {
		clickButton(By.id(buttonId));
	}
	
	/** RadioButton **/
	public void clickRadioButton(By by) {
		getDriver().findElement(by).click();
	}
	
	public void clickRadioButton(String radioId) {
		clickRadioButton(By.id(radioId));
	}
	
	/** Link **/
	public void clickLink(String textLink) {
		getDriver().findElement(By.linkText(textLink)).click();
	}
	
	/** Get Text **/
	public String getTextField(By by) {
		return getDriver().findElement(by).getText();
	}

	public String getTextField(String textFieldId) {
		return getTextField(By.id(textFieldId));
	}
	
	/** Table **/
	public void clickTableSpanDelete(String columnName, String value, String columnAction, String tableId) {
		WebElement cell = getCell(columnName, value, columnAction,tableId);
		cell.findElement(By.xpath(".//span[@class='glyphicon glyphicon-remove-circle']")).click();
	}
	
	public WebElement getCell(String columnName, String value, String columnAction, String tableId) {
		WebElement table = getDriver().findElement(By.xpath("//*[@id='"+ tableId +"']"));
		int columnIndex = getColumnIndex(table, columnName);
		int rowIndex = getRowIndex(table, value, columnIndex);
		int actionIndex = getColumnIndex(table, columnAction);
		
		return table.findElement(By.xpath(".//tr["+ rowIndex +"]/td["+ actionIndex +"]")); 
	}
	
	public int getColumnIndex(WebElement table, String columnName) {
		int index = -1;
		List<WebElement> columns = table.findElements(By.xpath(".//th"));
			for(int i = 0; i < columns.size(); i++) {
				if(columns.get(i).getText().equals(columnName)) {
					index = i + 1;
					break;
				}
			}
		return index;
	}
	
	public int getRowIndex(WebElement table, String value, int columnIndex) {
		int index = -1;
		List<WebElement> rows = table.findElements(By.xpath(".//tbody/tr/td["+ columnIndex +"]"));
			for(int i = 0; i < rows.size(); i++) {
				if(rows.get(i).getText().equals(value)) {
					index = i + 1;
					break;
				}
			}
		return index;		
	}
	
	/** Drop-down **/
	public void selectDropDownList(String dropDownId, String optionValue) {
		WebElement options = getDriver().findElement(By.id(dropDownId));
		options.findElement(By.xpath("./option[@value='"+ optionValue +"']")).click();
	}
	
	
	
	
}
