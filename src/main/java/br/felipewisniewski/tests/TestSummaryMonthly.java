package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.core.TestMass;
import br.felipewisniewski.pages.PageMenu;
import br.felipewisniewski.pages.PageSummaryMonthly;

public class TestSummaryMonthly extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageSummaryMonthly summary = new PageSummaryMonthly();
	
	@Test
	public void testMovementsCurrentMonth() {
		menu.openSummaryMonthly();
		summary.selectMonth(TestMass.getCurrentMonth());
		summary.selectYear(TestMass.getCurrentYear());
		summary.clickSearch();
		
		Assert.assertEquals(TestMass.getCurrentMonthPtBr().toUpperCase(), summary.checkMonth().toUpperCase());
	}

}
