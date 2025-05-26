package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import base.BasePage;

public class HomePage extends BasePage{
	

	    public HomePage(WebDriver driver) {
	    	super(driver); 
	    }
	    
	    
	  By logout = By.xpath("//button[normalize-space()='Sign Out']");
	    
	    
	    //wait for taoster msg
	    
	   
	    
	    public String getToasterMsg() {
	    	waitForTaosterToAppear();
	    	return driver.findElement(toaster).getText();
	    }

	    
	    public LoginPage clickLogOut() {
	    	driver.findElement(logout).click();
	    	return new LoginPage(driver);
	    }
}
	
	
	
	

