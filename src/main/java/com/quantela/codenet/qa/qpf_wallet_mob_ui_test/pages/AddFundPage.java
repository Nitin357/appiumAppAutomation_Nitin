package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.core.BaseTest;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.AndroidUtil;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.AppUtils;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.IosUtil;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.Sleep;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.webelements.FundManagement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class AddFundPage extends BaseTest {
	private final AppUtils appUtils;
	public AddFundPage(AndroidDriver driver)
	
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
        appUtils = driver instanceof AndroidDriver ? new AndroidUtil(driver) : new IosUtil();
	}

    @AndroidFindBy(className=FundManagement.FUND_MANAGEMENT)
     public WebElement FUND_MANAGEMENT;
    
    @AndroidFindBy(className=FundManagement.ADD_FUND)
    public WebElement ADD_FUND;
    
    @AndroidFindBy(className=FundManagement.ADDFUND_FUNDTYPE_SERVICEFEE)
    public WebElement ADDFUND_FUNDTYPE_SERVICEFEE;
    
    @AndroidFindBy(className=FundManagement.ADDFUND_FUNDTYPE_TREASURYFEE)
    public WebElement ADDFUND_FUNDTYPE_TREASURYFEE;
    
    @AndroidFindBy(className=FundManagement.ADDFUND_AMOUNT)
    public WebElement ADDFUND_AMOUNT;
    
    @AndroidFindBy(className=FundManagement.ADDFUND_PROCEED)
    public WebElement ADDFUND_PROCEED;
    
    @AndroidFindBy(className=FundManagement.ADDFUND_CLEAR)
    public WebElement ADDFUND_CLEAR;
    
    @AndroidFindBy(className=FundManagement.ADDFUND_POPUPTEXT)
    public WebElement ADDFUND_POPUPTEXT;
    
    @AndroidFindBy(className=FundManagement.ADDFUND_CLOSE)
    public WebElement ADDFUND_CLOSE;
    


public void addFundToCitizen(String value) {
	appUtils.click(FUND_MANAGEMENT);
	
	appUtils.click(ADD_FUND);
	appUtils.click(ADDFUND_FUNDTYPE_SERVICEFEE);
	appUtils.click(ADDFUND_AMOUNT);
	appUtils.enterText(ADDFUND_AMOUNT, value);
	appUtils.click(ADDFUND_PROCEED);
	Sleep.waitFor(5000);
	appUtils.click(ADDFUND_CLOSE);
	
}


	
    
    
    
    
    
    
    


}
