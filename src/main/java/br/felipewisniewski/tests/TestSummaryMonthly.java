package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.core.Mass;
import br.felipewisniewski.pages.PageMenu;
import br.felipewisniewski.pages.PageSummaryMonthly;

public class TestSummaryMonthly extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageSummaryMonthly summary = new PageSummaryMonthly();
		
	@Test
	public void testMovementsCurrentMonth() {
		ExtentTest test = getExtent().createTest("testMovementsCurrentMonth");
		
		menu.openSummaryMonthly();
		summary.selectMonth(Mass.getCurrentMonth());
		summary.selectYear(Mass.getCurrentYear());
		summary.clickSearch();
		
		Assert.assertEquals(Mass.getCurrentMonthPtBr().toUpperCase(), summary.checkMonth().toUpperCase());
		test.log(Status.PASS, "pass");
	}

}
