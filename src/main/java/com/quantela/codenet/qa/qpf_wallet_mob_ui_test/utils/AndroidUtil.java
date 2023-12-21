package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.collect.ImmutableMap;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.core.BaseTest;

import static io.appium.java_client.touch.WaitOptions.waitOptions;
import static io.appium.java_client.touch.offset.PointOption.point;
import static java.time.Duration.ofSeconds;

import java.io.File;
import java.time.Duration;



public  class AndroidUtil  implements AppUtils{
	
	AndroidDriver driver;
	
	public AndroidUtil(AndroidDriver driver) {
	this.driver = driver;
	}
	
    @Override
    public void enterText(WebElement element, String text) {
        Sleep.waitFor(1000);
    	element.clear();
        element.sendKeys(text);
    }
    
   

    @Override
    public void click(WebElement element) {
    	Sleep.waitFor(1000);
        element.click();
    }

    @Override
    public void verticalSwipe() {
        Dimension size = null;
		try {
			size = BaseTest.getDriver().manage().window().getSize();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        int endY = (int) (size.height * 0.70);
        int startY = (int) (size.height * 0.30);
        int startX = size.width / 2;
        (new TouchAction((PerformsTouchActions) BaseTest.getDriver())).press(point(startX, endY)).waitAction(waitOptions(ofSeconds(2))).moveTo(point(startX, startY)).release().perform();
    }
    
    public AppiumDriverLocalService startAppiumServer(String ipAddress,int port)
	{
		 AppiumDriverLocalService service = new AppiumServiceBuilder().withAppiumJS(new File("C://Users//Thejaswini Bhuma//AppData//Roaming//npm//node_modules//appium//build//lib//main.js"))
					.withIPAddress(ipAddress).usingPort(port).build();
				service.start();
				return service;
	}
    
    
   
    public void longPressAction(WebElement ele)
	{
		((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
				ImmutableMap.of("elementId",((RemoteWebElement)ele).getId(),
						"duration",2000));
	}
	

	public void scrollToEndAction()
	{
		boolean canScrollMore;
		do
		{
		 canScrollMore = (Boolean) ((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    
			));
		}while(canScrollMore);
	}
	
	public void scrollToElement(WebElement element) {
	    // Scroll to the WebElement
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);", element);
	}
	
	
	public void swipeAction(WebElement ele,String direction)
	{
		((JavascriptExecutor) driver).executeScript("mobile: swipeGesture", ImmutableMap.of(
			));
		
		
	}
	 public void waitForElementToBeClickable(WebElement element, int timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	        wait.until(ExpectedConditions.elementToBeClickable(element));
	        
	    }
	 public void waitForElementToBeVisible(WebElement element, int timeoutInSeconds) {
	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(timeoutInSeconds));
	        wait.until(ExpectedConditions.visibilityOf(element));
	    }

	@Override
	public String getTextFromElement(WebElement element) {
		// TODO Auto-generated method stub
		return null;
	}

		
	
	
	


	
	

}
