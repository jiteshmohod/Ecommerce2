package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import base.BasePage;

public class LoginPage extends BasePage{


	
	public LoginPage(WebDriver driver) {
		super(driver);
		
		
	}
	HomePage homePage;
	// Locators
    private By emailField = By.id("userEmail");
    private By passwordField = By.id("userPassword");
    private By loginButton = By.id("login");

    // Actions
    public void enterUserName(String emailId) {
        driver.findElement(emailField).sendKeys(emailId);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
       // return new  HomePage(driver) ;
    }
    
    public String getToasterMsg() {
    	waitForTaosterToAppear();
    	return driver.findElement(toaster).getText();
    }

	
}
