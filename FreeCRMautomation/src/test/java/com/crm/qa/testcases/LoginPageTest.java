package com.crm.qa.testcases;

import java.io.IOException;


import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;



public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	HomePage homePage;

	public LoginPageTest() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	@BeforeMethod
	public void setup() throws IOException {
		initialization();
		loginPage = new LoginPage();
	
	}
	
	@Test(priority=1)
	public void LoginPagetitleTest() {
		
		String title =loginPage.validateLoginPage();
		Assert.assertEquals(title, "Cogmento CRM");
	
	}
	
	
	@Test(priority=2)
	public void LoginTest() throws InterruptedException, IOException {
		
		homePage = loginPage.login(prop.getProperty("email"),prop.getProperty("password"));
		boolean flag = loginPage.validateCRMImage();
		Assert.assertTrue(flag);
	}
//@Test(priority=3)
	
//	public void crmLogoTest(){
	
		
	

	
	

	@AfterMethod
	public void tearDown()
	{
	driver.quit();
	}
	
	

	
	
	

}
