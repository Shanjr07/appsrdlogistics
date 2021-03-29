package com.appsrd.resource;

import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class base {
	public static WebDriver driv;
	public static Wait<WebDriver> Wait;

	public void openbrowser(String url) {
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\EIT-JAGADESHAN\\eclipse-workspace\\appsrd\\driv\\chromedriver.exe");
		HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		chromePrefs.put("credentials_enable_service", false);
		// options.setExperimentalOption("prefs", chromePrefs);
		// driv = new ChromeDriver(options);
		driv = new ChromeDriver();
		driv.get(url);
		driv.manage().window().maximize();
	}
	public void ubuntuopenbrowser(String url) {
		// ChromeOptions options = new ChromeOptions();
		// options.addArguments("--disable-notifications");
		System.setProperty("webdriver.chrome.driver","/usr/bin/google-chrome/");
		//System.setProperty("webdriver.chrome.logfile", "/usr/bin/chromedriver.log");
		//HashMap<String, Object> chromePrefs = new HashMap<String, Object>();
		//chromePrefs.put("credentials_enable_service", false);
		// options.setExperimentalOption("prefs", chromePrefs);
		// driv = new ChromeDriver(options);
		
		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.setBinary("/usr/bin/google-chrome/");
		chromeOptions.setExperimentalOption("useAutomationExtension", false);
        //chromeOptions.addArguments("--headless");
        chromeOptions.addArguments("--no-sandbox");
        chromeOptions.addArguments("--disable-dev-shm-usage");

        driv = new ChromeDriver();
		driv.get(url);
		driv.manage().window().maximize();
	}
	

	public void send(String name, WebElement ele) {
		ele.sendKeys(name);
	}

	public void click(WebElement ele) {
		ele.click();
	}

	public void errorwait(WebElement eleme) {
		Wait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class);
		Wait.until(ExpectedConditions.visibilityOf(eleme));

	}

	public String text(WebElement ele) {
		String text = ele.getText();
		return (text);
	}

	public String url() {
		String text = driv.getCurrentUrl();
		return (text);
	}

	public void urlwait() {
		Wait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class);
		Wait.until(ExpectedConditions.urlToBe("http://qa.appsrdlogistics.com/dashboard/classic"));

	}

	public void browserclose() {
		driv.close();
	}
}
