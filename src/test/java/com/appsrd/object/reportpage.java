package com.appsrd.object;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appsrd.resource.base;

public class reportpage extends base {

	public reportpage() {
		PageFactory.initElements(driv, this);
	}

	@FindBy(xpath = "//a[text()='Reports']")
	private WebElement report;
	@FindBy(xpath = "//a[text()='Hireslip/Invoice']/ancestor::li//a[text()='Cashmemo']")
	private WebElement reportcashmemo;
	@FindBy(xpath = "//a[text()='Memo Less Details ']")
	private WebElement memolessreport;
	@FindBy(xpath = "//a[text()='Cheque Search Details ']")
	private WebElement chequesearch;
	@FindBy(id = "chequeOrReferencNumber")
	private WebElement chequeOrReferencNumber;
	@FindBy(id = "fromDates")
	private WebElement fromdate;
	@FindBy(xpath = "//ngb-typeahead-window[@role='listbox']")
	private WebElement listbox;
	@FindBy(xpath = "//h6[@class='card-title']")
	private WebElement loading;
	@FindBy(id = "searchBtn")
	private WebElement search;
	@FindBy(xpath = "//ngb-typeahead-window//button[1]")
	private WebElement alloption;
	@FindBy(tagName = "tbody")
	private List<WebElement> tabledata;
	@FindBy(tagName = "tr")
	private List<WebElement> memodata;
	@FindBy(xpath = "//ul[@class='collapse sub-menu first-level']//li[@class='sidebar-item']//a[text()='LR']")
	private WebElement lr_report;
	@FindBy(xpath = "//a[text()='G.C. Not Received']")
	private WebElement GC_Not_Received;
	@FindBy(id = "destinationStationId")
	private WebElement Godown;
	@FindBy(id = "toDates")
	private WebElement todate;
	@FindBy(id = "consigneeName")
	private WebElement consigneeName;
	@FindBy(id = "tillDates")
	private WebElement tilldates;

	public WebElement getLr_report() {
		return lr_report;
	}

	public WebElement getGC_Not_Received() {
		return GC_Not_Received;
	}

	public WebElement getGodown() {
		return Godown;
	}

	public WebElement getTilldates() {
		return tilldates;
	}

	public List<WebElement> getMemodata() {
		return memodata;
	}

	public List<WebElement> getTabledata() {
		return tabledata;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAlloption() {
		return alloption;
	}

	public WebElement getChequesearch() {
		return chequesearch;
	}

	public WebElement getChequeOrReferencNumber() {
		return chequeOrReferencNumber;
	}

	public WebElement getLoading() {
		return loading;
	}

	public WebElement getListbox() {
		return listbox;
	}

	public WebElement getFromdate() {
		return fromdate;
	}

	public WebElement getTodate() {
		return todate;
	}

	public WebElement getConsigneeName() {
		return consigneeName;
	}

	public WebElement getReport() {
		return report;
	}

	public WebElement getReportcashmemo() {
		return reportcashmemo;
	}

	public WebElement getMemolessreport() {
		return memolessreport;
	}

}
