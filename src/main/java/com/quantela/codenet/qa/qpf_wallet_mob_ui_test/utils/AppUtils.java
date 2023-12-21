package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils;

import org.openqa.selenium.WebElement;

public interface AppUtils {

    public void enterText(WebElement element, String text);


    public void click(WebElement element);

    public void verticalSwipe();


	public String getTextFromElement(WebElement element);
	
	public void scrollToElement(WebElement element);
	
	public void waitForElementToBeClickable(WebElement element,int timeoutInSeconds);
	
	public void waitForElementToBeVisible(WebElement element,int timeoutInSeconds);
}
