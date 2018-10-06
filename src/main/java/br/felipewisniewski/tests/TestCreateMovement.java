package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.core.Mass;
import br.felipewisniewski.pages.PageCreateMovement;
import br.felipewisniewski.pages.PageMenu;

public class TestCreateMovement extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageCreateMovement move = new PageCreateMovement();
	
	@Test
	public void testCreateMovementRevenue() {
		ExtentTest test = getExtent().createTest("testCreateMovementRevenue");
		
		menu.openCreateMovement();
		
		move.selectTypeMovement(Mass.movTypeRevenue);
		move.setDateMovement(Mass.getCurrentDate());
		move.setDatePayment(Mass.getFutureDate());
		move.setDescriptionMovement(Mass.movDescription);
		move.setInterested(Mass.movInterested);
		move.setValueMovement(Mass.movValue);
		move.selectAccountMovement(Mass.accountName1);
		move.selectSituationMovement(Mass.movPaid);
		move.saveButton();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", move.getAlertSuccess());
		test.log(Status.PASS, "pass");
	}
	
	@Test
	public void testCreateMovementExpense() {
		ExtentTest test = getExtent().createTest("testCreateMovementExpense");
		
		menu.openCreateMovement();
		
		move.selectTypeMovement(Mass.movTypeExpense);
		move.setDateMovement(Mass.getCurrentDate());
		move.setDatePayment(Mass.getFutureDate());
		move.setDescriptionMovement(Mass.movDescription);
		move.setInterested(Mass.movInterested);
		move.setValueMovement(Mass.movValue);
		move.selectAccountMovement(Mass.accountName1);
		move.selectSituationMovement(Mass.movPendent);
		move.saveButton();
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", move.getAlertSuccess());
		test.log(Status.PASS, "pass");
	}
}
