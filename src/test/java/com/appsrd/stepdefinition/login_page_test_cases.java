package com.appsrd.stepdefinition;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.appsrd.object.loginpage;
import com.appsrd.resource.base;

public class login_page_test_cases extends base {
	@Parameters({ "Url" })
	@BeforeMethod
	public void browser(String s1) {
		//ubuntuopenbrowser(s1);
		openbrowser(s1);
	}

	@Parameters({ "Username", "invalid_password", "error_message" })
	@Test(priority = 1)
	public void login_with_incorrect_password(String s1, String s2, String s3) {
		loginpage page1 = new loginpage();
		send(s1, page1.getUserid());
		send(s2, page1.getPass());
		click(page1.getLogin());
		errorwait(page1.getError());
		// text(page1.getError());
		Assert.assertTrue(text(page1.getError()).equals(s3), "it shows" + text(page1.getError()));
	}

	@Parameters({ "Username", "password", "dashboard_url" })
	@Test(priority = 2)
	public void login_with_correct__username_password(String s1, String s2, String s3) {
		loginpage page1 = new loginpage();
		send(s1, page1.getUserid());
		send(s2, page1.getPass());
		click(page1.getLogin());
		urlwait("http://qa.appsrdlogistics.com/dashboard/classic");
		Assert.assertTrue(url().equals(s3), "it shows" + url());
	}


	/*@Parameters({ "Username", "password" })
	@Test(priority = 3)
	public void Forget_password(String s1, String s2) {
		//loginpage page1 = new loginpage();

	}
*/
	@AfterMethod
	public void close() {
		browserclose();
	}
	
	
}
