package br.felipewisniewski.core;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Mass {
	
	public static String userName = "Felipe";
	public static String userEmail = "felipewisniewski@gmail.com";
	public static String userPassword = "1234";
	
	public static String accountName1 = "James Gosling";
	public static String accountName2 = "o";
	
	public static String movTypeRevenue = "REC";
	public static String movTypeExpense = "DESP";
	public static String movDescription = "Test Movement " + System.currentTimeMillis();
	public static String movInterested = "Sr. " + System.currentTimeMillis();
	public static String movValue = getCurrentSeconds();
	public static String movAccount = accountName1;
	public static String movPaid = "pago";
	public static String movPendent = "pendente";	
			
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

	public static String getCurrentSeconds() {
		return new SimpleDateFormat("S").format(System.currentTimeMillis());
	}

	public static String getFutureDate() {
		GregorianCalendar c = new GregorianCalendar();
		c.add(Calendar.DAY_OF_MONTH, 5);
		Date future = c.getTime();
		return new SimpleDateFormat("dd/MM/yyyy").format(future);
	}
}
