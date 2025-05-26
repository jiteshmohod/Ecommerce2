package testcases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;

public class LoginTest extends TestBase {

	HomePage homepage;

	@Test
	public void LoginToSiteTest() throws InterruptedException {
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterUserName(prop.getProperty("email"));

		loginPage.enterPassword(prop.getProperty("password"));
		loginPage.clickLoginButton();
		homepage = new HomePage(driver);

		System.out.println("Site opened");//1
		System.out.println(driver.getTitle());//2
		Assert.assertEquals(driver.getTitle(), "Let's Shop");
		String msg =homepage.getToasterMsg();
		System.out.println("This is msg " + msg);//3
		
		Thread.sleep(Duration.ofSeconds(4));
		
		loginPage =homepage.clickLogOut();
		
		String msg1 =loginPage.getToasterMsg();
		System.out.println(msg1);
		
	
		
	}

}
