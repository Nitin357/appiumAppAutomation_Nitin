package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.AndroidUtil;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.AppUtils;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.IosUtil;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.Sleep;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.webelements.FundManagement;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class FundStatementPage {
	private final AppUtils appUtils;

	public FundStatementPage(AppiumDriver driver)
	
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
        appUtils = driver instanceof AndroidDriver ? new AndroidUtil(null) : new IosUtil();
	}
	
	
	@AndroidFindBy(className=FundManagement.FUND_MANAGEMENT)
	public WebElement FUND_MANAGEMENT;
	
	@AndroidFindBy(xpath = FundManagement.FUND_STATEMENT)
	public WebElement FUND_STATEMENT;
	
	@AndroidFindBy(className = FundManagement.FUNDSTATEMENT_FUNDBALANCE)
	public WebElement FUNDSTATEMENT_FUNDBALANCE;
	
	@AndroidFindBy(className = FundManagement.FUNDSTATEMENT_BLOCKEDBALANCE)
	public WebElement FUNDSTATEMENT_BLOCKEDBALANCE;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_FUNDTYPE_SERVICEFEE )
	public WebElement FUNDSTATEMENT_FUNDTYPE_SERVICEFEE;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_FUNDTYPE_TREASURYFEE )
	public WebElement FUNDSTATEMENT_FUNDTYPE_TREASURYFEE;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_FUNDTYPE_MINISTATEMENT )
	public WebElement FUNDSTATEMENT_FUNDTYPE_MINISTATEMENT;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_FUNDTYPE_DATEWISE )
	public WebElement FUNDSTATEMENT_FUNDTYPE_DATEWISE;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_FROMDATE )
	public WebElement FUNDSTATEMENT_FROMDATE;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_TODATE )
	public WebElement FUNDSTATEMENT_TODATE;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_PROCEED)
	public WebElement FUNDSTATEMENT_PROCEED;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_CLEAR)
	public WebElement FUNDSTATEMENT_CLEAR;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_SEARCH)
	public WebElement FUNDSTATEMENT_SEARCH;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_EXCEL)
	public WebElement FUNDSTATEMENT_EXCEL;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_SNO)
	public WebElement FUNDSTATEMENT_SNO;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_TRANSACTIONNO)
	public WebElement FUNDSTATEMENT_TRANSACTIONNO;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_TRANSACTIONDATE)
	public WebElement FUNDSTATEMENT_TRANSACTIONDATE;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_DETAILS)
	public WebElement FUNDSTATEMENT_DETAILS;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_DEBITAMOUNT)
	public WebElement FUNDSTATEMENT_DEBITAMOUNT;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_BALANCENO)
	public WebElement FUNDSTATEMENT_BALANCENO;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_REFERENCENO)
	public WebElement FUNDSTATEMENT_REFERENCENO;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_PREVIOUS)
	public WebElement FUNDSTATEMENT_PREVIOUS;
	
	@AndroidFindBy(className =FundManagement.FUNDSTATEMENT_NEXT)
	public WebElement FUNDSTATEMENT_NEXT;

	public void miniStatementView(String value) {
				
		appUtils.click(FUND_MANAGEMENT);
		appUtils.click(FUND_STATEMENT);
		appUtils.click(FUNDSTATEMENT_FUNDTYPE_MINISTATEMENT);
		Sleep.waitFor(5000);
		appUtils.click(FUNDSTATEMENT_DETAILS);
				
	}
	
	
	

	
		
		


	
	
	
	
	
	
	

}
