package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;
import com.generic.Utilities;
import com.pageFactory.DashboardPage;
import com.pageFactory.DashboardReport;
import com.pageFactory.HomePage;
import com.pageFactory.LoginPage;

public class LoginLogoutTest extends BaseTest{
	
	private LoginPage objLoginPage;
	private LoginLogoutFlow objLoginLogoutFlow;
	private Utilities objUtilities;

	public void initilizeWebPages() {
		objLoginPage= new LoginPage(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);
		objUtilities = new Utilities();		
	}
	
	@BeforeClass
	public void initializeOfWebEnvir() {
		this.initilizeWebPages();
		this.initilizeOfWebDriver();
	}

	@AfterClass
	public void tearDownEnv() {
		this.tearDown();
	}
	
	@Test
	public void TC_01_VerifyLoginPage() {
		objLoginLogoutFlow.doLogin();	
		objUtilities.getMobileNumber(7);
		System.out.println("The number :" +objUtilities.getMobileNumber(7));	
	}
	
}
