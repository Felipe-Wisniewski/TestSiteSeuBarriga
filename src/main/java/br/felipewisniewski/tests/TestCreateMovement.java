package br.felipewisniewski.tests;

import org.junit.Assert;
import org.junit.Test;

import br.felipewisniewski.core.TestBase;
import br.felipewisniewski.core.TestMass;
import br.felipewisniewski.pages.PageCreateMovement;
import br.felipewisniewski.pages.PageMenu;

public class TestCreateMovement extends TestBase {
	
	private PageMenu menu = new PageMenu();
	private PageCreateMovement move = new PageCreateMovement();
	
	@Test
	public void testCreateMovementRevenue() {
		menu.openCreateMovement();
		move.selectTypeMovement("REC");  //REC or DESP
		move.setDateMovement(TestMass.getCurrentDate());
		move.setDatePayment("");
		move.setDescriptionMovement("");
		move.setInterested("");
		move.setValueMovement("");
		move.selectAccountMovement("");
		move.selectSituationMovement("");
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", move.getAlertSuccess());
		
		System.out.println(TestMass.getCurrentMonth());
	}
	
	@Test
	public void testCreateMovementExpense() {
		menu.openCreateMovement();
		move.selectTypeMovement("DESP");  //REC or DESP
		move.setDateMovement(TestMass.getCurrentDate());
		move.setDatePayment("");
		move.setDescriptionMovement("");
		move.setInterested("");
		move.setValueMovement("");
		move.selectAccountMovement("");
		move.selectSituationMovement("");
		
		Assert.assertEquals("Movimentação adicionada com sucesso!", move.getAlertSuccess());
	}
}
