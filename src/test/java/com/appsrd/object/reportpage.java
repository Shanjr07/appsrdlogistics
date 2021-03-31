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
	@FindBy(id = "fromDates")
	private WebElement fromdate;
	@FindBy(xpath = "//ngb-typeahead-window[@role='listbox']")
	private WebElement listbox;
	@FindBy(xpath = "//h6[@class='card-title']")
	private WebElement loading;
	@FindBy(id = "searchBtn")
	private WebElement search;
	@FindBy(xpath="//ngb-highlight[text()='All']")
	private WebElement alloption;
    @FindBy(tagName="tr")
    private List<WebElement> tabledata;
	

	public List<WebElement> getTabledata() {
		return tabledata;
	}

	public WebElement getSearch() {
		return search;
	}

	public WebElement getAlloption() {
		return alloption;
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

	@FindBy(id = "toDates")
	private WebElement todate;
	@FindBy(id = "consigneeName")
	private WebElement consigneeName;

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
