package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.pages;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.core.BaseTest;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.AndroidUtil;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.AppUtils;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.IosUtil;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.Sleep;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.webelements.UserSignin;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class UserSigninPage extends BaseTest {
	private final AppUtils appUtils;
	public  UserSigninPage(AndroidDriver driver)
{
		
		PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
        appUtils = driver instanceof AndroidDriver ? new AndroidUtil(driver) : new IosUtil();
	}
	
	@AndroidFindBy(xpath=UserSignin.SIGN_IN_HOME)
	public WebElement SIGN_IN_HOME;
	
	@AndroidFindBy(xpath=UserSignin.INTERNAL_USER_HOME)
	public WebElement INTERNAL_USER_HOME;
	
	@AndroidFindBy(xpath=UserSignin.CITIZEN_USER_HOME)
	public WebElement CITIZEN_USER_HOME;
	
	@AndroidFindBy(xpath=UserSignin.INTERNAL_CHECKBOX)
	public WebElement INTERNAL_CHECKBOX;
	

	@AndroidFindBy(xpath=UserSignin.INTERNAL_OTP)
	public WebElement INTERNAL_OTP;
	
	@AndroidFindBy(xpath=UserSignin.INTERNAL_MOBILENUMBER)
	public WebElement INTERNAL_MOBILENUMBER;
	
	@AndroidFindBy(xpath=UserSignin.INTERNAL_PASSWORD)
	public WebElement INTERNAL_PASSWORD;
	
	@AndroidFindBy(xpath=UserSignin.INTERNAL_SIGN_IN_BUTTON)
	public WebElement INTERNAL_SIGN_IN_BUTTON;
	
	@AndroidFindBy(xpath=UserSignin.INTERNAL_EMAIL)
	public WebElement INTERNAL_EMAIL;
	
	@AndroidFindBy(xpath=UserSignin.CITIZEN_CHECKBOX)
	public WebElement CITIZEN_CHECKBOX;
	
	@AndroidFindBy(xpath=UserSignin.CITIZEN_MOBILENUMBER)
	public WebElement CITIZEN_MOBILENUMBER;
	
	@AndroidFindBy(xpath=UserSignin.CITIZEN_PASSWORD)
	public WebElement CITIZEN_PASSWORD;
	
	@AndroidFindBy(xpath=UserSignin.CITIZEN_SIGN_IN_BUTTON)
	public WebElement CITIZEN_SIGN_IN_BUTTON;
	
	@AndroidFindBy(xpath=UserSignin.CITIZEN_EMAIL)
	public WebElement CITIZEN_EMAIL;
	
	@AndroidFindBy(xpath=UserSignin.CITIZEN_OTP)
	public WebElement CITIZEN_OTP;
	
	
	/*
	 * public void clickOnSignIn(String role) throws InterruptedException {
	 * appUtils.click(signInButton); Sleep.waitFor(1000); if
	 * (role.equalsIgnoreCase("citizen")) { appUtils.click(citizenButton); } else {
	 * appUtils.click(internalButton); } }
	 */
	
	public void internalUserSignin(String userName, String password, String role) throws InterruptedException {
		appUtils.click(INTERNAL_CHECKBOX);
		appUtils.click(INTERNAL_MOBILENUMBER);
		Sleep.waitFor(3000);
		appUtils.enterText(INTERNAL_MOBILENUMBER, userName);
		Sleep.waitFor(3000);
		appUtils.click(INTERNAL_PASSWORD);
		appUtils.enterText(INTERNAL_PASSWORD, password);
		Sleep.waitFor(3000);
		appUtils.click(INTERNAL_SIGN_IN_BUTTON);
		//appUtils.click(INTERNAL_OTP);
		Sleep.waitFor(3000);
		//appUtils.click(INTERNAL_SIGN_IN_BUTTON);
	}
	
	public void citizenUserSignin(String userName, String password, String role) {
		appUtils.click(CITIZEN_CHECKBOX);
		
		  appUtils.click(CITIZEN_MOBILENUMBER); Sleep.waitFor(3000);
		  appUtils.enterText(CITIZEN_MOBILENUMBER, userName); 
		  
		  appUtils.click(CITIZEN_PASSWORD); 
		  appUtils.enterText(CITIZEN_PASSWORD,password);
		 ;
		appUtils.click(CITIZEN_SIGN_IN_BUTTON);
		//appUtils.click(CITIZEN_OTP);
		Sleep.waitFor(3000);
		//appUtils.click(CITIZEN_SIGN_IN_BUTTON);
	}
	
	
	
	
	

}
