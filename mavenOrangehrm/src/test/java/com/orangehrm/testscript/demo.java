package com.orangehrm.testscript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.orangehrm.generic.BaseClass;
import com.orangehrm.generic.FileLib;
import com.orangehrm.generic.WebDriverCommonLib;
import com.orangehrm.objectrepository.adminPage;
import com.orangehrm.objectrepository.homePage;

@Listeners(com.orangehrm.generic.ListenerImplementation.class)
public class demo extends BaseClass {
	@Test
	public void loginToapp() throws EncryptedDocumentException, IOException, InvalidFormatException, InterruptedException {
		Reporter.log("Edit Organization",true);
		homePage h=new homePage(driver);
		adminPage p=new adminPage(driver);
		WebDriverCommonLib wb=new WebDriverCommonLib();
		//mouse hover to admin drop down
		wb.Movetoelement(driver, h.getAdminDropDown());
		//mouse hover to organization dropdown
		wb.Movetoelement(driver, p.getOrganizationDropDown());
		//click on general info button
		p.getGeneralInfo().click();
		//click on edit button
		p.getEditbtn().click();
		//to read data from excel file
		FileLib f=new FileLib();
		String orgname = f.getExcelValue("Generalinfo", 1, 0);
		String email = f.getExcelValue("Generalinfo", 1, 1);
		//clear the text which is present in text box 
		p.getOrganizationNametbx().clear();
		//send input to organization name text box
		p.getOrganizationNametbx().sendKeys(orgname);
		//clear the text box
		p.getEmailTb().clear();
		//send input to email text box
		p.getEmailTb().sendKeys(email);
		p.getSavebtn().click();
		
		//reading the data which is present in organization text box with our excel data
		//String Actualorg=p.getOrganizationNametbx().getAttribute("value");
		//Assert.assertEquals(Actualorg, orgname);
	}

}
