package com.orangehrm.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class homePage {

		@FindBy(id="welcome")
		private WebElement userIcon;
		
		@FindBy(xpath="//a[@href='/index.php/auth/logout']")
		private WebElement logoutlink;
		
		@FindBy(xpath="//b[.='Admin']")
		private WebElement adminDropDown;
		
		@FindBy(xpath="//b[.='Recruitment']")
		private WebElement recruitmentdropdown;
		
		public WebElement getRecruitmentdropdown() {
			return recruitmentdropdown;
		}
		public homePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		public void setLogout() {
			userIcon.click();
			logoutlink.click();
		}
		
		public WebElement getAdminDropDown() {
			return adminDropDown;
		}
}
