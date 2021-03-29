package com.appsrd.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appsrd.resource.base;

public class loginpage extends base {
	public loginpage() {
		PageFactory.initElements(driv, this);
	}

	@FindBy(xpath = "//input[@aria-label='Username']")
	private WebElement userid;
	@FindBy(xpath = "//input[@aria-label='Password']")
	private WebElement pass;
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement login;
	@FindBy(xpath = "//h5[@class='custome_fs14']")
	private WebElement error;
	@FindBy(id = "to-recover")
	private WebElement forgetpassword;

	public WebElement getForgetpassword() {
		return forgetpassword;
	}

	public WebElement getError() {
		return error;
	}

	public WebElement getLogin() {
		return login;
	}

	public WebElement getPass() {
		return pass;
	}

	public WebElement getUserid() {
		return userid;
	}

}
