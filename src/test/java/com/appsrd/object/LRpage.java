package com.appsrd.object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.appsrd.resource.base;

public class LRpage extends base {
	public LRpage() {
		PageFactory.initElements(driv, this);
	}
 
	@FindBy(xpath = "//a[@class='sidebar-link waves-effect waves-dark'][text()='LR']")
	private WebElement LR;
	@FindBy(xpath ="//a[text()='Entry']")
	private WebElement LRentry;
	@FindBy(xpath = "//a[text()='LR Entry Form']")
	private WebElement LRentryform;
	@FindBy(id="userGodown")
	private WebElement UserGodown;
	@FindBy(id="loaderHead")
	private WebElement loadheader;
	@FindBy(id="agentName")
	private WebElement agentname;
	@FindBy(id="destination")
	private WebElement destination;
	@FindBy(id="packNature")
	private WebElement packnature;
	@FindBy(id = "automatedLR")
	private WebElement automatedLR;
	@FindBy(id= "consignorGSTNumber")
	private WebElement consignorGSTNumber;
	@FindBy(id = "autoLrNumber")
	private WebElement autoLrNumber;
	@FindBy(xpath="//label[@for='automatedLR']")
	private WebElement check;
	@FindBy(id = "noOfArticles")
	private WebElement noofarticles;
	@FindBy(xpath ="//div[@role='dialog]")
    private WebElement dialogbox;
	@FindBy(xpath = "//div[@class='swal-button-container']")
	private WebElement okbutton;
	@FindBy(id = "consignorName")
	private WebElement consignorName;
	@FindBy(id = "consignorAddress")
	private WebElement consignorAddress;
	@FindBy(id = "consigneeGSTNumber")
	private WebElement consigneeGSTNumber;
	@FindBy(id = "consigneeName")
	private WebElement consigneeName;
	@FindBy(id = "consigneeAddress")
	private WebElement consigneeAddress;
	@FindBy(id= "partyCommodity")
	private WebElement partyCommodity;
	@FindBy(id="subCommodity")
	private WebElement subCommodity;
	@FindBy(id="actualWeight")
	private WebElement actualWeight;
	@FindBy(id="chargedWeight")
	private WebElement chargedWeight;
	@FindBy(id="baseFreight")
	private WebElement baseFreight;
	@FindBy(id = "hamali")
	private WebElement hamali;
	@FindBy(id="nextBtn")
	private WebElement nextBtn;
	
	public WebElement getNextBtn() {
		return nextBtn;
	}
	public WebElement getCheck() {
		return check;
	}
	public WebElement getPartyCommodity() {
		return partyCommodity;
	}
	public WebElement getSubCommodity() {
		return subCommodity;
	}
	public WebElement getActualWeight() {
		return actualWeight;
	}
	public WebElement getChargedWeight() {
		return chargedWeight;
	}
	public WebElement getBaseFreight() {
		return baseFreight;
	}
	public WebElement getHamali() {
		return hamali;
	}
    public WebElement getConsignorName() {
		return consignorName;
	}
	public WebElement getConsignorAddress() {
		return consignorAddress;
	}
	public WebElement getConsigneeGSTNumber() {
		return consigneeGSTNumber;
	}
	public WebElement getConsigneeName() {
		return consigneeName;
	}
	public WebElement getConsigneeAddress() {
		return consigneeAddress;
	}
	public WebElement getOkbutton() {
		return okbutton;
	}
	public WebElement getLR() {
		return LR;
	}
	public WebElement getLRentry() {
		return LRentry;
	}
	public WebElement getLRentryform() {
		return LRentryform;
	}
	public WebElement getUserGodown() {
		return UserGodown;
	}
	public WebElement getLoadheader() {
		return loadheader;
	}
	public WebElement getAgentname() {
		return agentname;
	}
	public WebElement getDestination() {
		return destination;
	}
	public WebElement getPacknature() {
		return packnature;
	}
	public WebElement getAutomatedLR() {
		return automatedLR;
	}
	public WebElement getConsignorGSTNumber() {
		return consignorGSTNumber;
	}
	public WebElement getAutoLrNumber() {
		return autoLrNumber;
	}
	public WebElement getNoofarticles() {
		return noofarticles;
	}
	public WebElement getDialogbox() {
		return dialogbox;
	}


}
