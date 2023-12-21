package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.webelements;

public class UserSignin {
	
	/*Locators for Signin*/
	public static final String SIGN_IN_HOME="//android.widget.Button[@content-desc=\"Login\"]";
	public static final String CITIZEN_USER_HOME="//android.view.View[@content-desc=\"Citizen\"]";
	public static final String INTERNAL_USER_HOME="//android.view.View[@content-desc=\"Internal\"]";

	
	/*Locators for Internal User signin*/
	
	public static final String INTERNAL_CHECKBOX="//android.view.View[@content-desc=\"internal\"]";
	public static final String INTERNAL_MOBILENUMBER="//android.view.View[contains(@content-desc=\"QPF WALLET\r\n"
			+ "Mobile Number *\r\n"
			+ "Password *\")]/android.widget.EditText[1])";
	public static final String INTERNAL_PASSWORD="//android.view.View[contains(@content-desc=\"QPF WALLET\r\n"
			+ "Mobile Number *\r\n"
			+ "Password *\")]/android.widget.EditText[2]";
	public static final String INTERNAL_SIGN_IN_BUTTON="//android.widget.Button[@content-desc=\"Login\"]";
	public static final String INTERNAL_EMAIL="//span[contains(text(),'Sign in')]";
	public static final String INTERNAL_OTP="//span[contains(text(),'Sign in')]";
	
	/*Locators for Citizen User signin*/
	
	public static final String SIGN_IN_CITIZEN_USER="//a[contains(text(),'Sign in as Internal User')]";
	public static final String CITIZEN_CHECKBOX="//android.view.View[@content-desc=\"citizen\"]";
	public static final String CITIZEN_MOBILENUMBER="//android.view.View[contains(@content-desc,'QPF WALLET')]/android.widget.EditText[1]";
	public static final String CITIZEN_PASSWORD="//android.view.View[contains(@content-desc, 'QPF WALLET')]/android.widget.EditText[2]";
	public static final String CITIZEN_SIGN_IN_BUTTON="//android.widget.Button[@content-desc=\"Login\"]";
	public static final String CITIZEN_EMAIL="//span[contains(text(),'Sign in')]";
	public static final String CITIZEN_OTP="//span[contains(text(),'Sign in')]";


}
