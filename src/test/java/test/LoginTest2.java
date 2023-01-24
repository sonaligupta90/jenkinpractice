package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.DashboardPage2;
import page.LoginPage2;
import util.BrowserFactory2;

public class LoginTest2 {
	
	WebDriver driver;
	
	@Test
	public void validUserAbleToLogin() throws IOException {
		
		driver = BrowserFactory2.init();
		
		LoginPage2 loginPage = PageFactory.initElements(driver, LoginPage2.class);
		loginPage.enterUsername("demo@techfios.com");
		loginPage.enterPassword("abc123");
		loginPage.clickOnLoginButton();
		
		DashboardPage2 dashboard = PageFactory.initElements(driver,DashboardPage2.class);
		dashboard.verifyDashBoardPage("Dashboard");
		
		BrowserFactory2.tearDown();
		
	}
	
	

}
