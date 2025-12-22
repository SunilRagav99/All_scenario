package com.omrbranch.pages;

import java.awt.AWTException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.omrbranch.utility.BaseClass;

public class LoginPage extends BaseClass {
	public LoginPage(){
	
	PageFactory.initElements(driver,this);
	
	}
	@FindBy(id="email")
	private WebElement txtUserName;
	
	@FindBy(id="pass")
	private  WebElement textPassword;
	@FindBy(xpath = "//button[@value='login']")
	private WebElement btnLogin;
	@FindBy(id="errorMessage")
	private WebElement errLogin;
	
	public WebElement getErrLogin() {
		return errLogin;
	}
	public void setErrLogin(WebElement errLogin) {
		this.errLogin = errLogin;
	}
	public WebElement getTxtUserName() {
		return txtUserName;
	}
	public WebElement getTextPassword() {
		return textPassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	
	//Login
	public void login(String UserName,String password) {
		elementSendKeys(txtUserName, UserName);
		elementSendKeys(textPassword, password);
		elementClick(btnLogin);
	}
	//login with enter key
	public void loginKey(String UserName,String password) throws AWTException {
		elementSendKeys(txtUserName, UserName);
		elementSendKeysEnter(textPassword, password);
		
		
		
	}
	public String errorMessage() {
		String textLogin=getElementText(errLogin);
		return textLogin;

	}
		
	}
