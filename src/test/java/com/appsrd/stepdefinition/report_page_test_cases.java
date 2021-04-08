package com.appsrd.stepdefinition;

import java.text.SimpleDateFormat;
import java.util.Date;

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
		click(page2.getTodate());
		loaderwait();
		click(page2.getConsigneeName());
		/*
		 * for (int ii = 0; ii < 15; ii++) { // System.out.println(ii);
		 * click(page2.getTodate()); Thread.sleep(1500);
		 * click(page2.getConsigneeName()); Thread.sleep(1500); }
		 */
		waitelement(page2.getListbox());
		// page2.getListbox().getText();
		String text = page2.getListbox().getText();
		String[] ss = text.split("\\n");
		/*
		 * for(int a = 0; a < ss.length ; a++) {
		 * 
		 * System.out.println(ss[a]+"  ===  "+a); }
		 */
		// System.out.println(s.length+"&&&&&&&&"+ss.length);
		if (ss.length > 1) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "Consignee listbox contains nothing");
		}
		click(page2.getConsigneeName());
		click(page2.getAlloption());
		click(page2.getSearch());
		System.out.println(memotable(page2.getMemodata()));
		if (memotable(page2.getMemodata()) > 8) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "memo less report contains nothing");
		}

	}

	@Parameters({ "Cheque/Referenc Number" })
	@Test(priority = 2)
	public void Cheque_search_report(String s1) throws InterruptedException {
		reportpage page2 = new reportpage();
		waitelement(page2.getReport());
		click(page2.getReport());
		click(page2.getReportcashmemo());
		waitelement(page2.getChequesearch());
		click(page2.getChequesearch());
		waitelement(page2.getChequeOrReferencNumber());
		// waitelement(page2.getTabledata());
		send(s1, page2.getChequeOrReferencNumber());
		click(page2.getSearch());
		loaderwait();
		tabledata(page2.getTabledata());
		System.out.println(tabledata(page2.getTabledata()));
		Assert.assertFalse(tabledata(page2.getTabledata()).contains("No data available in table"));
	}

	@Test(priority = 2)
	public void GC_Not_ReceivedReport() throws InterruptedException {
		reportpage page2 = new reportpage();
		waitelement(page2.getReport());
		click(page2.getReport());
		click(page2.getLr_report());
		waitelement(page2.getGC_Not_Received());
		click(page2.getGC_Not_Received());
		loaderwait();
		waitelement(page2.getGodown());
		click(page2.getGodown());
		// waitelement(page2.getTabledata());
		String text = page2.getListbox().getText();
		String[] ss = text.split("\\n");
		if (ss.length > 1) {
			Assert.assertTrue(true);
		} else {
			Assert.assertTrue(false, "Godown listbox contains nothing except ALL");
		}
		click(page2.getAlloption());
		String date = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
		send(date, page2.getTilldates());
		click(page2.getSearch());
		loaderwait();
		Assert.assertFalse(tabledata(page2.getTabledata()).contains("No data available in table"));
		/*
		 * for(int a = 0; a < ss.length ; a++) {
		 * 
		 * System.out.println(ss[a]+"  ===  "+a); }
		 */
	}

	@AfterMethod
	public void close() {
		browserclose();
	}
}