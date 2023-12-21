package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentReporterNG {

    private static ExtentReports extent;
 

    public static ExtentReports createInstance() {
        // Get a timestamp for the report filename
    	SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Date date = new Date();
        String timestamp = dateFormat.format(date);

        
        String fileName = getReportName();
        String directory = System.getProperty("user.dir")+"/test-output/ExtentReports/";
        new File(directory).mkdirs();
        String path = directory+fileName;
        // Set up ExtentHtmlReporter with a unique timestamp
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        // Customize the report settings
        reporter.config().setDocumentTitle("Automation Test Results ");
        reporter.config().setReportName("Wallet QA Report");
        reporter.config().setTheme(Theme.STANDARD);

        // Create an ExtentReports instance
        extent = new ExtentReports();
        extent.attachReporter(reporter);
        return extent;
    }
public static String getReportName() {
	Date now = new Date();
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy_MM_dd_hh_mm_ss");
    String formattedDate = dateFormat.format(now);

    String fileName = "ExtentReport_" + formattedDate + ".html";
    return fileName;

}
      

   

    // Add your custom screenshot capture method here
    
}
