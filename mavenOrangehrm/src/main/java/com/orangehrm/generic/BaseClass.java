package com.orangehrm.generic;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.orangehrm.objectrepository.homePage;
import com.orangehrm.objectrepository.loginPage;


public class BaseClass {	
	static {
		System.setProperty("webdriver.chrome.driver", "./src/main/resources/driver/chromedriver.exe");
	}		
	public static WebDriver driver;
	
	
@BeforeClass
public void openBrowser() {
	 driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
}

@BeforeMethod
public void login() throws IOException {
	FileLib f=new FileLib();
	String un = f.getPropertyValue("username");
	String pw = f.getPropertyValue("password");
	driver.get(f.getPropertyValue("url"));
	loginPage l=new loginPage(driver);
	l.setLogin(un,pw);
}

@AfterMethod 
public void logout() {
	homePage h=new homePage(driver);
	h.setLogout();
}

@AfterClass
public void closeBrowser() {
	driver.close();
}
}
