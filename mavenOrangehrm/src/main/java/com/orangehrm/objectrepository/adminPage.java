package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class adminPage {

	@FindBy(id="menu_admin_Organization")
	private WebElement OrganizationDropDown;
	
	@FindBy(id="menu_admin_viewOrganizationGeneralInformation")
	private WebElement generalInfo;
	
	@FindBy(id="btnSaveGenInfo")
	private WebElement Editbtn;
	
	@FindBy(id="organization_name")
	private WebElement OrganizationNametbx;
	
	@FindBy(id="organization_email")
	private WebElement EmailTb;
	
	@FindBy(id="btnSaveGenInfo")
	private WebElement Savebtn;

	public adminPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getOrganizationDropDown() {
		return OrganizationDropDown;
	}

	public WebElement getOrganizationNametbx() {
		return OrganizationNametbx;
	}

	public WebElement getGeneralInfo() {
		return generalInfo;
	
	}

	public WebElement getEditbtn() {
		return Editbtn;
	}

	public WebElement getEmailTb() {
		return EmailTb;
	}

	public WebElement getSavebtn() {
		return Savebtn;
	}
	
	
}
