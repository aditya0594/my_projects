package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class LoginPage extends TestBase{

		//PageFactory -OR(object repository);
	
	@FindBy(name="email")
	WebElement username;
	
	@FindBy(name="password")
	WebElement password;
	
	@FindBy(xpath="//div[@class='ui fluid large blue submit button']")
	WebElement loginBtn;
	
	@FindBy(xpath="//a[contains(text(),\"Sign Up\")]")
	WebElement signUpbtn;
		
		
	@FindBy(xpath="//div[@class='header item']")
	WebElement crmLogo;
	
	//Intializing the Page object	
	public LoginPage() throws IOException {
		PageFactory.initElements(driver, this);
	
	}

	//Actions
	public String validateLoginPage() {
		return driver.getTitle();
		
	}
	public boolean validateCRMImage() {
		return crmLogo.isDisplayed();
	}
	
	public HomePage login(String un,String pwd) throws InterruptedException, IOException {
		username.sendKeys(un);
		password.sendKeys(pwd);
		loginBtn.click();
		Thread.sleep(3000);
		
		return new HomePage();
	}


	
		
		
		
		
	}




