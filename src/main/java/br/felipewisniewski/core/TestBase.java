package br.felipewisniewski.core;

import static br.felipewisniewski.core.Driver.killDriver;
import static br.felipewisniewski.core.Driver.getDriver;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.rules.TestName;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import br.felipewisniewski.pages.PageLogin;
import br.felipewisniewski.pages.PageMenu;

public class TestBase {
	
	private PageLogin login = new PageLogin();
	private PageMenu menu = new PageMenu();
	
	ExtentHtmlReporter report;
	private static ExtentReports extent;
	
	@Rule
	public TestName testName = new TestName();
	
	@Before
	public void startTest() {
		report = new ExtentHtmlReporter("target/extent-reports/testName.getMethodName()" + ".html");
		extent = new ExtentReports();
		extent.attachReporter(report);
		login.openLoginPage();
		login.setEmail(Mass.userEmail);
		login.setPassword(Mass.userPassword);
		login.login();
	}

	@After
	public void endsTest() throws IOException {
		TakesScreenshot ss = (TakesScreenshot) getDriver();
		File file = ss.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("target" + File.separator + "screen-shots" +
				File.separator + testName.getMethodName() + ".jpg"));
	
		extent.flush();
		
		if(Settings.CLOSE_BROWSER) {
			menu.logout();
			killDriver();
		}			
	}	
	
	public static ExtentReports getExtent() {
		return extent;
	}
}
