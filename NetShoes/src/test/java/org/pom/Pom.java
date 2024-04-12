package org.pom;

import org.baseclass.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass{
	public Pom() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "(//a[@qa-automation='home-account-button'])[1]")
	private WebElement loginmovelem;
	
	@FindBy(xpath = "(//font[@style='vertical-align: inherit;'])[1]")
	private WebElement login;
	
	@FindBy(xpath = "(//input[@name='username'])")
	private WebElement emailEnter;
	
	@FindBy(xpath = "(//input[@name='password'])")
	private WebElement password;
	
	@FindBy(xpath = "//div[@class='bGGcZJZR7IsEsQjTbspD-html-close-button']")
	private WebElement popupclose;

	

	@FindBy(xpath = "//button[@id='login-button']")
	private WebElement clkLgn;
	
	
	
	@FindBy(xpath = "//input[@id='sign-up-username']")
	private WebElement signupemail;
public WebElement getSignupemail() {
		return signupemail;
	}
	//	
	@FindBy(xpath = "//button[@id='verify-email-button']")
	private WebElement procced;

	public WebElement getProcced() {
		return procced;
	}

	public WebElement getLoginmovelem() {
		return loginmovelem;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getEmailEnter() {
		return emailEnter;
	}

	public WebElement getPassword() {
		return password;
	}
	public WebElement getPopupclose() {
		return popupclose;
	}
	public WebElement getClkLgn() {
		return clkLgn;
	}


}
