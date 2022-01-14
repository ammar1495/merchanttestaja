package com.magang.merchant.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magang.merchant.driver.DriverSingleton;

public class LoginPage {

	private WebDriver driver;
	
	public LoginPage() {
		driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
	}
	

	
	@FindBy(css = "#page-container > div > div.right-content > div.login-content > form > div:nth-child(2) > input")
	private WebElement txtUsername;
	
	@FindBy(css = "#page-container > div > div.right-content > div.login-content > form > div:nth-child(4) > input")
	private WebElement txtPassword;
	
	@FindBy(css = "#page-container > div > div.right-content > div.login-content > form > div.login-buttons > button")
	private WebElement btnLogin;
	
	@FindBy(css = "#exampleModal > div > div > div.modal-footer > button")
	private WebElement btnClose;
	
	
	public void goToLoggedIn(String username, String password) {		
		txtUsername.sendKeys(username);
		txtPassword.sendKeys(password);
		btnLogin.click();
	}
	
	public void closePopUp(){
		 btnClose.click();
		}

	}

