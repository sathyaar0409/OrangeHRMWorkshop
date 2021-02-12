package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
	@FindBy(id="txtUsername")
	private WebElement untbx;
	
	@FindBy(id="txtPassword")
	private WebElement pwtbx;
	
	@FindBy(id="btnLogin")
	private WebElement lgbtn;

	
	public loginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setLogin(String un,String pw) {
		untbx.sendKeys(un);
		pwtbx.sendKeys(pw);
		lgbtn.click();
	}

}
