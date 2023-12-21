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

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class TransferFundPage extends BaseTest {
	private final AppUtils appUtils;
	public TransferFundPage(AndroidDriver driver)
	
	{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
        appUtils = driver instanceof AndroidDriver ? new AndroidUtil(driver) : new IosUtil();
	}
	
	@AndroidFindBy(xpath=FundManagement.FUND_MANAGEMENT)
    public WebElement FUND_MANAGEMENT;
	
	@AndroidFindBy(xpath=FundManagement.TRANSFER_FUND)
	public WebElement TRANSFER_FUND;
	 
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_FUNDTYPE_SERVICEFEE)
	public WebElement TRANSFERFUND_FUNDTYPE_SERVICEFEE;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_FUNDTYPE_TREASURYFEE)
	public WebElement TRANSFERFUND_FUNDTYPE_TREASURYFEE;

	/*
	 * @AndroidFindBy(className = FundManagement.TRANSFERFUND_PAYEE) public
	 * WebElement TRANSFERFUND_PAYEE;
	 */
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PAYEETO)
	public WebElement TRANSFERFUND_PAYEETO;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PAYEENAME)
	public WebElement TRANSFERFUND_PAYEENAME;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_AMOUNT)
	public WebElement TRANSFERFUND_AMOUNT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_AMOUNTINWORDS)
	public WebElement TRANSFERFUND_AMOUNTINWORDS;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_REMARKS)
	public WebElement TRANSFERFUND_REMARKS;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_GETOTP)
	public WebElement TRANSFERFUND_GETOTP;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_RESENDOTP)
	public WebElement TRANSFERFUND_RESENDOTP;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_ENTEROTP)
	public WebElement TRANSFERFUND_ENTEROTP;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PROCEED)
	public WebElement TRANSFERFUND_PROCEED;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_CLEAR)
	public WebElement TRANSFERFUND_CLEAR;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_ALERT)
	public WebElement TRANSFERFUND_ALERT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_ALERTCLOSE)
	public WebElement TRANSFERFUND_ALERTCLOSE;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_TEXT)
	public WebElement TRANSFERFUND_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_FUNDTYPE_TEXT)
	public WebElement TRANSFERFUND_FUNDTYPE_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_SERVICEFEE_TEXT)
	public WebElement TRANSFERFUND_SERVICEFEE_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_TREASURYFEE_TEXT)
	public WebElement TRANSFERFUND_TREASURYFEE_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PAYEETO_TEXT)
	public WebElement TRANSFERFUND_PAYEETO_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_AMOUNT_TEXT)
	public WebElement TRANSFERFUND_AMOUNT_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PAYEENAME_TEXT)
	public WebElement TRANSFERFUND_PAYEENAME_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_REMARKS_TEXT)
	public WebElement TRANSFERFUND_REMARKS_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_AMOUNTINW_TEXT)
	public WebElement TRANSFERFUND_AMOUNTINW_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_GETOTP_TEXT)
	public WebElement TRANSFERFUND_GETOTP_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_RESENDOTP_TEXT)
	public WebElement TRANSFERFUND_RESENDOTP_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_OTP_TEXT)
	public WebElement TRANSFERFUND_OTP_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_DIDNOTGETOTP_TEXT)
	public WebElement TRANSFERFUND_DIDNOTGETOTP_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PROCEED_TEXT)
	public WebElement TRANSFERFUND_PROCEED_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_CLEAR_TEXT)
	public WebElement TRANSFERFUND_CLEAR_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_ALERT_TEXT)
	public WebElement TRANSFERFUND_ALERT_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_ALERTHEADING_TEXT)
	public WebElement TRANSFERFUND_ALERTHEADING_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_CLOSE_TEXT)
	public WebElement TRANSFERFUND_CLOSE_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_CLOSETP_TEXT)
	public WebElement TRANSFERFUND_CLOSETP_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PAYEETO_PH_TEXT)
	public WebElement TRANSFERFUND_PAYEETO_PH_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_PAYEENAME_PH_TEXT)
	public WebElement TRANSFERFUND_PAYEENAME_PH_TEXT;
	
	@AndroidFindBy(xpath = FundManagement.TRANSFERFUND_OTP_PH_TEXT)
	public WebElement TRANSFERFUND_OTP_PH_TEXT;
	
	@AndroidFindBy(xpath=FundManagement.TRANSFERFUND_WALLETSCREEN)
	public WebElement TRANSFERFUND_WALLETSCREEN;
	
	
	
	
	public void transferFund(String payeeTo,String amount ) {
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		/*
		 * appUtils.click(FUND_MANAGEMENT); appUtils.click(TRANSFER_FUND);
		 */
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		/* appUtils.click(TRANSFERFUND_FUNDTYPE_SERVICEFEE); */
		appUtils.click(TRANSFERFUND_PAYEETO);
		appUtils.enterText(TRANSFERFUND_PAYEETO, payeeTo);
		appUtils.click(TRANSFERFUND_AMOUNT);
		appUtils.enterText(TRANSFERFUND_AMOUNT, amount);
		Sleep.waitFor(2000);
		/*
		 * appUtils.scrollToElement(TRANSFERFUND_PROCEED);
		 * appUtils.click(TRANSFERFUND_REMARKS);
		 * appUtils.enterText(TRANSFERFUND_REMARKS, remarks);
		 */
		appUtils.click(TRANSFERFUND_GETOTP);
		Sleep.waitFor(5000);
		appUtils.click(TRANSFERFUND_PROCEED);
		/*
		 * appUtils.getTextFromElement(TRANSFERFUND_ALERT);
		 */		appUtils.click(TRANSFERFUND_ALERTCLOSE);
		
		
		
	}
	public void mandatoryPayeeTO(String amount) {
		/*
		 * appUtils.click(FUND_MANAGEMENT); appUtils.click(TRANSFER_FUND);
		 */
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		/* appUtils.click(TRANSFERFUND_FUNDTYPE_SERVICEFEE); */
		appUtils.click(TRANSFERFUND_AMOUNT);
		appUtils.enterText(TRANSFERFUND_AMOUNT, amount);
		/*
		 * appUtils.click(TRANSFERFUND_REMARKS);
		 * appUtils.enterText(TRANSFERFUND_REMARKS, remarks);
		 */
		appUtils.click(TRANSFERFUND_GETOTP);
		appUtils.click(TRANSFERFUND_PROCEED);
		/*
		 * appUtils.getTextFromElement(TRANSFERFUND_ALERT);
		 * appUtils.click(TRANSFERFUND_ALERTCLOSE);
		 */
		
	}
	public void mandatoryAmount(String payeeTo) {
		/*
		 * appUtils.click(FUND_MANAGEMENT); appUtils.click(TRANSFER_FUND);
		 */
		
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		/* appUtils.click(TRANSFERFUND_FUNDTYPE_SERVICEFEE); */
		appUtils.click(TRANSFERFUND_PAYEETO);
		appUtils.enterText(TRANSFERFUND_PAYEETO, payeeTo);
		/*
		 * appUtils.click(TRANSFERFUND_REMARKS);
		 * appUtils.enterText(TRANSFERFUND_REMARKS, remarks);
		 */
		/* appUtils.click(TRANSFERFUND_GETOTP); */
		appUtils.waitForElementToBeVisible(TRANSFERFUND_PROCEED, 3000);
		appUtils.click(TRANSFERFUND_PROCEED);
		/*
		 * appUtils.getTextFromElement(TRANSFERFUND_ALERT);
		 * appUtils.click(TRANSFERFUND_ALERTCLOSE);
		 */
		
		
		
	}
	public void mandatoryOTP(String payeeTo,String amount) {
		/*
		 * appUtils.click(FUND_MANAGEMENT); appUtils.click(TRANSFER_FUND);
		 */
		
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		/* appUtils.click(TRANSFERFUND_FUNDTYPE_SERVICEFEE); */
		appUtils.click(TRANSFERFUND_PAYEETO);
		appUtils.enterText(TRANSFERFUND_PAYEETO, payeeTo);
		appUtils.click(TRANSFERFUND_AMOUNT);
		appUtils.enterText(TRANSFERFUND_AMOUNT, amount);
		/*
		 * appUtils.click(TRANSFERFUND_REMARKS);
		 * appUtils.enterText(TRANSFERFUND_REMARKS, remarks);
		 */
		appUtils.waitForElementToBeVisible(TRANSFERFUND_PROCEED, 3000);

		appUtils.click(TRANSFERFUND_PROCEED);
		/*
		 * appUtils.getTextFromElement(TRANSFERFUND_ALERT);
		 * appUtils.click(TRANSFERFUND_ALERTCLOSE);
		 */
	}
	
	
	public void clearFund(String payeeTo,String amount) {
		/*
		 * appUtils.click(FUND_MANAGEMENT); appUtils.click(TRANSFER_FUND);
		 */
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		/* appUtils.click(TRANSFERFUND_FUNDTYPE_SERVICEFEE); */
		appUtils.click(TRANSFERFUND_PAYEETO);
		appUtils.enterText(TRANSFERFUND_PAYEETO, payeeTo);
		appUtils.click(TRANSFERFUND_AMOUNT);
		appUtils.enterText(TRANSFERFUND_AMOUNT, amount);
		/*
		 * appUtils.click(TRANSFERFUND_AMOUNTINWORDS);
		 * appUtils.enterText(TRANSFERFUND_AMOUNTINWORDS, amountInWords);
		 */
		/*
		 * appUtils.click(TRANSFERFUND_REMARKS);
		 * appUtils.enterText(TRANSFERFUND_REMARKS, remarks);
		 */
		appUtils.click(TRANSFERFUND_GETOTP);
		appUtils.click(TRANSFERFUND_CLEAR);
		Sleep.waitFor(5000);
		/*
		 * appUtils.getTextFromElement(TRANSFERFUND_PAYEETO);
		 * appUtils.getTextFromElement(TRANSFERFUND_AMOUNT);
		 * appUtils.getTextFromElement(TRANSFERFUND_REMARKS);
		 * appUtils.getTextFromElement(TRANSFERFUND_AMOUNTINWORDS);
		 */
				
		
		
	}
	public void walletButton() {
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		Sleep.waitFor(5000);
	}
	public void amountValidation(String payeeTo,String amount ) {
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		appUtils.click(TRANSFERFUND_PAYEETO);
		appUtils.enterText(TRANSFERFUND_PAYEETO, payeeTo);
		appUtils.click(TRANSFERFUND_AMOUNT);
		appUtils.enterText(TRANSFERFUND_AMOUNT, amount);
		/* appUtils.click(TRANSFERFUND_GETOTP); */
		Sleep.waitFor(5000);
		appUtils.click(TRANSFERFUND_PROCEED);
		
		}
	public void trandferFundText() {
		appUtils.waitForElementToBeVisible(TRANSFERFUND_WALLETSCREEN, 5000);
		appUtils.click(TRANSFERFUND_WALLETSCREEN);
		/* appUtils.getTextFromElement(TRANSFERFUND_TEXT); */
		
	}
}
