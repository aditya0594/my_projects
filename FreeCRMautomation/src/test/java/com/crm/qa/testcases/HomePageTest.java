package com.crm.qa.testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;

public class HomePageTest extends TestBase {
	HomePage homePage; 
	LoginPage loginPage;
	
	public HomePageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	// TEST Should be separated---independent with each other
	//@before launch the browser every time 
	//@Test --- execute test case 
	//@after each test case browser close
	
	
	@BeforeMethod
	public void setup() throws IOException, InterruptedException {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
	}
	
	@Test(priority=1)
	public void verifyHomePageTitleTest() {
		
	String homePageTitle = homePage.VerfifyHomePAgeTitle();
	Assert.assertEquals(homePageTitle,"Cogmento CRM", "Home page title is not matched");
	
	}
	@Test(priority=2)
	public void verifyUsernameTest() {
		//homePage.verifyCorrectUsername();
		Assert.assertTrue(homePage.verifyCorrectUsername());
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
}
