package com.crm.qa.pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.crm.qa.base.TestBase;

public class HomePage extends TestBase {
	
	public HomePage() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[contains(text(),'adi pawa')]")
	WebElement userNameLabel;
	
	@FindBy(xpath = "//span[contains(text(),'Contacts')]")
	WebElement contactLink;
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	WebElement dealsLink;
	
	@FindBy(xpath = "//span[contains(text(),'Tasks')]")
	WebElement teskLink;
	
	
	 public void Homepage() {
		 PageFactory.initElements(driver, this);
		
	 }

	 public String VerfifyHomePAgeTitle() {
		 return driver.getTitle();
		 
	 }
	 
	 public boolean verifyCorrectUsername() {
		  userNameLabel.isDisplayed();
		return false;
		 
	 }
	 public ContactsPage clickOnContactLink() throws IOException {
		 contactLink.click();
		 return new ContactsPage();
	 }
	 
	 public DealsPage clickOnDealsLink() throws IOException {
		 dealsLink.click();
		 return new DealsPage();
	 }
 
	 public TaskPage clickOnTaskLink() throws IOException {
		 teskLink.click();
		 return new TaskPage();
	 }

}
 

