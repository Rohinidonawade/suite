package com.scripts;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.flows.HomePageFlow;
import com.flows.LoginLogoutFlow;
import com.generic.BaseTest;
import com.pageFactory.HomePage;

public class HomePageTest extends BaseTest{
	
	private LoginLogoutFlow objLoginLogoutFlow;
	private HomePageFlow objHomePageFlow;
	private HomePage objHomePage;

	
	public void initilizeWebPages() {
		objHomePageFlow = new HomePageFlow(this);
		objLoginLogoutFlow = new LoginLogoutFlow(this);				
		objHomePage = new HomePage(this);				
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
	
	@Test(priority = 3, groups={"functional", "smoke"})
	public void TC_02_VerifyHomePage() {
		objLoginLogoutFlow.doLogin();
		objHomePage.verifyHomeTextIsDisplayedInHomePage();
		objHomePageFlow.checkHomePage();
	}

}
