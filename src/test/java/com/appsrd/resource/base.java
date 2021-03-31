package com.appsrd.resource;

import java.time.Duration;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

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
	
	public  void actions (WebElement ele) {
		Actions a= new Actions (driv);
		a.moveToElement(ele);
		a.build();
		a.perform();
		a.click();
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

	public void urlwait(String s1) {
		Wait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(60)).pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class);
		Wait.until(ExpectedConditions.urlToBe(s1));

	}
	public void waitelement(WebElement ele) {
		Wait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(120)).pollingEvery(Duration.ofMillis(500))
				.ignoring(Exception.class);
		Wait.until(ExpectedConditions.elementToBeClickable(ele));

	}
	public void loaderwait() {
		Wait = new FluentWait<WebDriver>(driv).withTimeout(Duration.ofSeconds(120)).pollingEvery(Duration.ofMillis(100))
				.ignoring(Exception.class);
		Wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h6[@class='card-title']")));

	}
	public void browserclose() {
		driv.close();
	}
	 public int tabledata(List<WebElement> ele) throws InterruptedException {
		 Thread.sleep(10000);
		 //String text1 = null;
			List<WebElement> trow = ele;
			int tr11 = trow.size();
			//System.out.println(tr11);
			for (int i = 0; i < trow.size(); i++) {
				WebElement tr = trow.get(i);
				List<WebElement> tdata = tr.findElements(By.tagName("td"));
				int tr12 = tdata.size();
				//System.out.println(tr12);
				for (int j = 0; j < tdata.size(); j++) {
					WebElement td = tdata.get(j);
					//String text1 = td.getText();
					//System.out.println(text1);

				}
			}

		 return (tr11);
	 }
			
		
	
	
	public void select(WebElement ele) {
		Select s = new Select(ele);
		
	}
	
}
