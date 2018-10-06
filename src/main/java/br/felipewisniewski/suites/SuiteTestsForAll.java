package br.felipewisniewski.suites;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import br.felipewisniewski.tests.TestAddAccounts;
import br.felipewisniewski.tests.TestCreateMovement;
import br.felipewisniewski.tests.TestRemoveAccount;
import br.felipewisniewski.tests.TestSummaryMonthly;

@RunWith(Suite.class)
@SuiteClasses({
	TestAddAccounts.class,
	TestRemoveAccount.class,
	TestCreateMovement.class,
	TestSummaryMonthly.class
})
public class SuiteTestsForAll {

	@BeforeClass
	public static void start(){		
		
	}
		
}