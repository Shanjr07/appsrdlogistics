package com.appsrd.stepdefinition;

import java.awt.RenderingHints.Key;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.SendKeysAction;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.appsrd.object.LRpage;
import com.appsrd.object.loginpage;
import com.appsrd.object.reportpage;
import com.appsrd.resource.base;

public class lr_page_test_cases extends base {
	@Parameters({ "Url", "lrUsername", "lrpassword", })
	@BeforeMethod
	public void browser(String s1, String s2, String s3) {
		// ubuntuopenbrowser(s1);
		openbrowser(s1);
		loginpage page1 = new loginpage();
		send(s2, page1.getUserid());
		send(s3, page1.getPass());
		click(page1.getLogin());
	}

	@Test
	public void lr_entry_detail() throws InterruptedException {
		reportpage page2 = new reportpage();
		LRpage p3 = new LRpage();
		waitelement(p3.getLR());
		click(p3.getLR());
		click(p3.getLRentry());
		waitelement(p3.getLRentryform());
		click(p3.getLRentryform());
		waitelement(p3.getOkbutton());
		click(p3.getOkbutton());
		/*
		 * waitelement(p3.getUserGodown()); click(p3.getUserGodown());
		 * waitelement(page2.getListbox()); String text = page2.getListbox().getText();
		 * String[] ss = text.split("\\n"); if (ss.length > 0) {
		 * Assert.assertTrue(true); } else { Assert.assertTrue(false,
		 * "User Godown listbox contains nothing except ALL"); }
		 */
		// waitelement(page2.getListbox());
		Thread.sleep(1000);
		waitelement(p3.getLoadheader());
		click(p3.getLoadheader());
		String text1 = page2.getListbox().getText();
		String[] ss1 = text1.split("\\n");
		if (ss1.length > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "Choudhary Name listbox contains nothing except ALL");
		}
		Thread.sleep(1000);
		waitelement(p3.getAgentname());
		click(p3.getAgentname());
		waitelement(page2.getListbox());
		String text2 = page2.getListbox().getText();
		String[] ss2 = text2.split("\\n");
		if (ss2.length > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "Agent Name listbox contains nothing except ALL");
		}
		Thread.sleep(1000);
		// waitelement(p3.getUserGodown());
		click(p3.getUserGodown());
		waitelement(page2.getListbox());
		String text = page2.getListbox().getText();
		String[] ss = text.split("\\n");
		if (ss.length > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "User Godown listbox contains nothing except ALL");
		}
		Thread.sleep(1000);
		click(p3.getPacknature());
		waitelement(page2.getListbox());
		String text3 = page2.getListbox().getText();
		String[] ss3 = text3.split("\\n");
		if (ss3.length > 0) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "Pack Nature listbox contains nothing except ALL");
		}

		waitelement(p3.getCheck());
		click(p3.getCheck());
		send("Bangalore-Karnataka", p3.getDestination());
		waitelement(p3.getAutoLrNumber());
		Thread.sleep(3000);
		// String val = p3.getAutoLrNumber().getText();
		// String val1 = p3.getAutoLrNumber().getAttribute("text");
		String val2 = p3.getAutoLrNumber().getAttribute("value");
		// String val3 = p3.getAutoLrNumber().getAttribute("textContent");
		System.out.println(val2);
		// Assert.assertTrue(p3.getAutoLrNumber().,
		// message);//click(p3.getAutomatedLR());
		if (!val2.isEmpty()) {
			Assert.assertTrue(true);
			// Assert.assertTrue(false, "AutoLrNumber contain nothing");
		} else {
			// Assert.assertTrue(true);
			Assert.assertTrue(false, "AutoLrNumber contain nothing");
		}
		send("07AFZPK9691P1ZY", p3.getConsignorGSTNumber());
		enterKey(p3.getConsignorGSTNumber());
		Thread.sleep(3000);
		waitelement(p3.getConsignorName());
		String ConsignorName = p3.getConsignorName().getAttribute("value");
		System.out.println(ConsignorName);
		if (!ConsignorName.isEmpty()) {

			Assert.assertTrue(true);
			// Assert.assertTrue(false, "AutoLrNumber contain nothing");
		} else {
			// Assert.assertTrue(true);
			Assert.assertTrue(false, "ConsigneeName text box contain nothing");
		}
		send("29AWCPC3632Q1Z9", p3.getConsigneeGSTNumber());
		enterKey(p3.getConsigneeGSTNumber());
		Thread.sleep(3000);
		waitelement(p3.getConsigneeName());
		String ConsigneeName = p3.getConsigneeName().getAttribute("value");
		System.out.println(ConsigneeName);
		if (!ConsigneeName.isEmpty()) {

			Assert.assertTrue(true);
			// Assert.assertTrue(false, "AutoLrNumber contain nothing");
		} else {
			// Assert.assertTrue(true);
			Assert.assertTrue(false, "ConsigneeName text box contain nothing");
		}
		click(p3.getUserGodown());
		click(page2.getAlloption());
		click(p3.getLoadheader());
		click(page2.getAlloption());
		click(p3.getPacknature());
		click(page2.getAlloption());
		click(p3.getPartyCommodity());
		click(page2.getAlloption());
		click(p3.getSubCommodity());
		send("test", p3.getSubCommodity());
		send("100", p3.getActualWeight());
		send("10", p3.getChargedWeight());
		send("100", p3.getBaseFreight());
		send("50", p3.getHamali());
		//click(p3.getNextBtn());
		
		
		
		
		
	}

}
