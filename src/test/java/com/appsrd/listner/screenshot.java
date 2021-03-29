package com.appsrd.listner;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;
//import org.testng.TestListenerAdapter;

import com.appsrd.resource.base;


public class screenshot implements ITestListener {
		WebDriver driver=null;
		File file = new File("screenshort/new-failed-test-case-/");
		String filePath = file.getAbsolutePath();
	    public void onTestFailure(ITestResult result) {
	    	String methodName=result.getName().toString().trim();
	        ITestContext context = result.getTestContext();
	       WebDriver driver = (WebDriver)context.getAttribute("driver");
	    	try {
				takeScreenShot(methodName, driver);
			} catch (IOException e) {
				e.printStackTrace();
			}
	    }
	    
	    public void takeScreenShot(String methodName, WebDriver driver) throws IOException {
	    	File scrFile = ((TakesScreenshot)base.driv).getScreenshotAs(OutputType.FILE);
	    	String timestamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
	    	try {
	 	      	
	             File screenShotName= new File(filePath+methodName+"["+timestamp+"]"+".png");
	  				FileUtils.copyFile(scrFile, screenShotName, true);
	  				String filePath = screenShotName.toString();
	  				 String path = ("<a href=" + filePath + "> <img width='200' height='100' src=" + filePath + "> </a>");
	  				 Reporter.log("Screenshots");
	  				 Reporter.log(path);
	  			
	    	}
	/*    	String timestamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());

	    	 File scrFile = ((TakesScreenshot) base.driv).getScreenshotAs(OutputType.FILE);
	    	    String encodedBase64 = null;
	    	    FileInputStream fileInputStreamReader = null;
	    	    try {
	    	        fileInputStreamReader = new FileInputStream(scrFile);
	    	        byte[] bytes = new byte[(int)scrFile.length()];
	    	        fileInputStreamReader.read(bytes);
	    	        encodedBase64 = new String(Base64.encodeBase64(bytes));
	    	        String path="data:image/png;base64,"+encodedBase64;
	    	        Base64 decoder = new Base64(); 
	    	        byte[] imgBytes = decoder.decode(path);
	    	        FileOutputStream osf = new FileOutputStream(new File(filePath+methodName+"["+timestamp+"]"+".png"));
	    	        osf.write(imgBytes);
	    	        osf.flush();
	    	        String filePath = osf.toString();
	 				 String paths = ("<a href=" + filePath + "> <img width='200' height='100' src=" + filePath + "> </a>");
	 				 Reporter.log("Screenshots");
	 				 Reporter.log(paths);    	        
	    	    } 
	 */  	    
	    	    
	    	    catch (FileNotFoundException e) 
	    	    {
	    	        e.printStackTrace();
	    	    } catch (IOException e) 
	    	    {
	    	        e.printStackTrace();
	    	    }
	    	
	      }
	    /*	
	    	String dateName=new SimpleDateFormat("YYYY_MM_DD_HH_MM_SS").format(new Date());
	        TakesScreenshot ts=(TakesScreenshot)base.driv;
	        File source=ts.getScreenshotAs(OutputType.FILE);
	        String destination=System.getProperty("user.dir")+"/FailedScreenshots/"+methodName+dateName+".png";
	        File finalDestination=new File(destination);
	        FileUtils.copyFile(source, finalDestination);

	        String Imagepath="E:\\Eit_track\\FailedScreenshots\\"+methodName+dateName+".png";
	        String path = ("<a href=" + Imagepath + "> <img width='200' height='100' src=" + Imagepath + "> </a>");
			 Reporter.log("Screenshots");
			 Reporter.log(path); 
	        
	    	
	    } */
	    	// String scrBase64 = ((TakesScreenshot) base.driv).getScreenshotAs(OutputType.BASE64);
	 		
	 	//File file = OutputType.FILE.convertFromBase64Png(scrBase64);
	    	 
	    	// String Base64StringofScreenshot="";
	    //	File scrFile = ((TakesScreenshot)base.driv).getScreenshotAs(OutputType.FILE);
	    	    //byte[] fileContent = FileUtils.readFileToByteArray(scrFile);
	    	    //Base64StringofScreenshot = "data:image/png;base64,"+Base64.getEncoder().encodeToString(fileContent);
	    	    
	    	//htmlReport.config().setAutoCreateRelativePathMedia(true);
	    	// String timestamp = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss").format(new Date());
	    	 
	    	  
	          /* */
	    public void onFinish(ITestContext context) {}
	  
	    public void onTestStart(ITestResult result) {   }
	  
	    public void onTestSuccess(ITestResult result) {   }

	    public void onTestSkipped(ITestResult result) {   }

	    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {   }

	    public void onStart(ITestContext context) {   }
	}