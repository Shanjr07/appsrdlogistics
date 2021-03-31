package com.appsrd.stepdefinition;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
//import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.appsrd.object.loginpage;
import com.appsrd.object.reportpage;
import com.appsrd.resource.base;

public class report_page_test_cases extends base {

	@Parameters({ "Url", "Username", "password", })
	@BeforeMethod
	public void browser(String s1, String s2, String s3) {
		// ubuntuopenbrowser(s1);
		openbrowser(s1);
		loginpage page1 = new loginpage();
		send(s2, page1.getUserid());
		send(s3, page1.getPass());
		click(page1.getLogin());
	}

	@Parameters({ "fromdate", "todate" })
	@Test(priority = 1)
	public void Memo_less_report(String s1, String s2) throws InterruptedException {

		reportpage page2 = new reportpage();
		waitelement(page2.getReport());
		click(page2.getReport());
		click(page2.getReportcashmemo());
		waitelement(page2.getMemolessreport());
		click(page2.getMemolessreport());
		waitelement(page2.getFromdate());
		send(s1, page2.getFromdate());
		send(s2, page2.getTodate());
		for (int ii = 0; ii < 15; ii++) {
			//System.out.println(ii);
			click(page2.getTodate());
			Thread.sleep(1500);
			click(page2.getConsigneeName());
			Thread.sleep(1500);
		}
		waitelement(page2.getListbox());
		String text = page2.getListbox().getText();
		if (text.length() > 1) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "Consignee listbox contains nothing");
		}
		click(page2.getConsigneeName());
		click(page2.getAlloption());
		click(page2.getSearch());
        //System.out.println(tabledata(page2.getTabledata()));
        if(tabledata(page2.getTabledata())> 9 ) {
        	Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "memo less report contains nothing");
		}

	}
	@AfterMethod
	public void close() {
		browserclose();
	}
	

}