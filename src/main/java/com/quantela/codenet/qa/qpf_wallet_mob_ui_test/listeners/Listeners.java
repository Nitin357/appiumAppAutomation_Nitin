package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.listeners;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.core.BaseTest;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.ExtentReporterNG;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Listeners extends BaseTest implements ITestListener{
	
	private static ExtentReports extent = ExtentReporterNG.createInstance();
	public static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<ExtentTest>();
	
 ExtentTest test;
 
	
	 
	@Override
	
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		  test= extent.createTest(result.getMethod().getMethodName());
		  extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		String logText = "<b>Test Method"+result.getMethod().getMethodName()+"Successfull<b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
		extentTest.get().log(Status.PASS,m);
		
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		 if (result.getThrowable() instanceof AssertionError) {
		        String assertionErrorMessage = result.getThrowable().getMessage();
		        extentTest.get().log(Status.FAIL, "Assertion Failed: " + assertionErrorMessage);
		    } else {
		        extentTest.get().fail(result.getThrowable());
		    }
		
			
		
			String path;
			try {
				path = takeScreenshot(driver, result.getMethod().getMethodName());
				
		
		extentTest.get().fail("<b><font color=red>"+"Screenshot of failure" +
		"</font></b>",MediaEntityBuilder.createScreenCaptureFromPath(path).build());
		
		
			}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		String logText = "<b>Test Method"+result.getMethod().getMethodName()+"Skipped<b>";
		Markup m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
		extentTest.get().log(Status.SKIP ,m);
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onFinish(ITestContext context) {
		if(extent!=null) {
		extent.flush();
		}
	}
		 public String takeScreenshot(AndroidDriver driver, String methodName) throws IOException {
				String fileName = getScreenshotName(methodName);
				String directory = System.getProperty("user.dir")+"/test-output/Screenshots";
			    new File(directory).mkdirs();
			   
			    String path = directory + "/"+fileName;
			    
			    File screenshot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			    FileUtils.copyFile(screenshot,new File(path));
			    System.out.println("Screenshot stored at: "+path);
			    
			    
			
			return path;
		    }

			  public static String getScreenshotName(String methodName) 
			  {
			  Date now = new Date();
		    SimpleDateFormat dateFormat = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		    String formattedDate = dateFormat.format(now);

		    String fileName = methodName + "_" + formattedDate + ".png";
		    return fileName;
			 
			
			  }

	
	
	
	
	
	
  
}

