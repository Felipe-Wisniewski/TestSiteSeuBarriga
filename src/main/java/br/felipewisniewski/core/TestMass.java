package br.felipewisniewski.core;

import java.text.SimpleDateFormat;
import java.util.Locale;

public class TestMass {
	
	public static String userName = "";
	public static String userEmail = "";
	public static String userPassword = "";
	
	public static String accountName1 = "";
	public static String accountName2 = "";
	
	public static String movTypeRevenue = "";
	public static String movTypeExpense = "";
	public static String movDateCurrent = "";
	public static String movDatePayment = "";
	public static String movDescription = "";
	public static String movInterested = "";
	public static String movValue = "";
	public static String movAccount = accountName1;
	public static String movPaid = "";
	public static String movPendent = "";
	
	
	
	
	public static String getCurrentDate() {
		return new SimpleDateFormat("dd/MM/yyyy").format(System.currentTimeMillis());
	}
	
	public static String getCurrentMonth() {
		return new SimpleDateFormat("M").format(System.currentTimeMillis());
	}
	
	public static String getCurrentMonthPtBr() {
		return new SimpleDateFormat("MMMM", Locale.forLanguageTag("pt-BR")).format(System.currentTimeMillis());
	}
	
	public static String getCurrentYear() {
		return new SimpleDateFormat("yyyy").format(System.currentTimeMillis());
	}
}
