package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.core;

import java.io.IOException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.pages.AddFundPage;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.pages.FundStatementPage;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.pages.UserSigninPage;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.pages.TransferFundPage;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.AppiumConfig;

import io.appium.java_client.android.AndroidDriver;



public class BaseTest {
	
	public AddFundPage addFundPage;
	public FundStatementPage fundStatementPage;
	public TransferFundPage transferFundPage;
	public UserSigninPage userSigninPage;
    private static URL url;

	public static AndroidDriver driver;
    

	
	@BeforeSuite
    public void suiteSetup() throws IOException {
        AppiumConfig.initConfig();
        
        
	}


    @BeforeMethod()
    public void AndroidDriverConfig() throws IOException {
        
        /*AppiumConfig appiumConfig = AppiumConfig.getInstance();

        DesiredCapabilities cap = new DesiredCapabilities();
       //cap.setCapability("deviceName", AppiumConfig.getInstance().getValueForKey("deviceName"));
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", AppiumConfig.getInstance().getValueForKey("platformVersion"));
        // cap.setCapability("noReset", appiumConfig.getInstance().getValueForKey("noReset"));
        cap.setCapability("app",  "com/quantela/codenet/qa/qpf_wallet_mob_ui_test/apk_files/QAapp-debug.apk");

        if (AppiumConfig.getInstance().getValueForKey("appium.server").equalsIgnoreCase("local")) {
            try {
                driver = new AndroidDriver(new URL(AppiumConfig.getInstance().getValueForKey("appium.server.localUrl")), cap);
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("Failed to initialize AndroidDriver. Check the URL.");
            }
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

         */
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("automationName","UIAutomator2");

        capabilities.setCapability("app", "C://Users//ManojKumarA//OneDrive - QUANTELA INC//Desktop//Wallet sqad//qpf_wallet_workspace//qpf_wallet//qpf_wallet_mob_ui_test//src//test//resources//com//quantela//codenet//qa//qpf_wallet_mob_ui_test//apk_files//QAapp-debug.apk");
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723"), capabilities);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        addFundPage = new AddFundPage(driver);
        fundStatementPage = new FundStatementPage(driver);
        transferFundPage = new TransferFundPage(driver);
        userSigninPage = new UserSigninPage(driver);
    }
   
	
       

    @AfterMethod(alwaysRun = true)
    public void driverQuit() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static AndroidDriver getDriver() {
        return driver;
    }
}