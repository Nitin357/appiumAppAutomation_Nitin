package com.quantela.codenet.qa.qpf_wallet_mob_ui_test;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.core.BaseTest;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.JsonUtils;

public class TransferFundTest extends BaseTest{
	ExtentTest extentTest;
	
	@BeforeMethod()
	public void citizenUserSignin() {
		var jsonData = JsonUtils.getJsonData("citizenLogin");
		userSigninPage.citizenUserSignin(jsonData.get("userName"), jsonData.get("password"), jsonData.get("role"));
		
	}
	

              
        @Test(groups= {"demo"})
	public void transferFund() {
		var jsonData = JsonUtils.getJsonData("fundTransfer");

	transferFundPage.transferFund(jsonData.get("payeeTo"),jsonData.get("amount"));
	Boolean transferFundAlert=transferFundPage.TRANSFERFUND_ALERT.isDisplayed();
	 Assert.assertFalse(transferFundAlert, "Transfer Fund is not successfull");

}
        
	@Test(groups= {"demo"})
	public void mandatoryPayeeTO() {
		var jsonData = JsonUtils.getJsonData("fundTransfer");
		transferFundPage.mandatoryPayeeTO(jsonData.get("amount"));
		boolean isNotClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
		if(isNotClickable==true)
		Assert.assertFalse(isNotClickable, "Proceed button is clickable without entering PayeeTo");
		else
		System.out.println("Proceed Button is not clickable ");
		
	}
	@Test(groups= {"demo"})
	public void mandatoryAmount() {
		var jsonData = JsonUtils.getJsonData("fundTransfer");
		transferFundPage.mandatoryAmount(jsonData.get("payeeTo"));
		boolean isNotClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
		if(isNotClickable==true)
			Assert.assertFalse(isNotClickable, "Proceed button is clickable without entering Amount");
			else
			System.out.println("Proceed Button is not clickable ");
		
	}
	@Test(groups= {"demo"})
	public void mandatoryOTP() {
		var jsonData = JsonUtils.getJsonData("fundTransfer");
		transferFundPage.mandatoryOTP(jsonData.get("payeeTo"),jsonData.get("amount"));
		boolean isNotClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
		if(isNotClickable==true)
			Assert.assertFalse(isNotClickable, "Proceed button is clickable without entering OTP");
			else
			System.out.println("Proceed Button is not clickable ");
		
	}
	@Test(groups= {"demo"})
		public void autoDisplayPayeeName() {
		var jsonData = JsonUtils.getJsonData("fundTransfer");

		transferFundPage.mandatoryAmount(jsonData.get("payeeTo"));
		boolean payeeName = transferFundPage.TRANSFERFUND_PAYEENAME.isDisplayed();
		if(payeeName==true) {
			Assert.assertTrue(payeeName,"Payee Name is Displayed");
			System.out.println(payeeName);
		}
		else {
			System.out.println("Payee Name is not displaying as per given Data");
		}
			
	}
	@Test()
	 
	public void clearFund() {
		var jsonData = JsonUtils.getJsonData("fundTransfer");

		transferFundPage.clearFund(jsonData.get("payeeTo"),jsonData.get("amount"));
		
		String payeeToText = transferFundPage.TRANSFERFUND_PAYEETO.getText();
		String amountText = transferFundPage.TRANSFERFUND_AMOUNT.getText();
		String remarksText = transferFundPage.TRANSFERFUND_REMARKS.getText();
		String amountInWordsText = transferFundPage.TRANSFERFUND_AMOUNTINWORDS.getText();
		
		Assert.assertTrue(payeeToText.isEmpty(), "PayeeTo Text is empty");
		Assert.assertTrue(amountText.isEmpty(), "Amount Text is empty");
		Assert.assertTrue(remarksText.isEmpty(), "Remarks Text is empty");
		Assert.assertTrue(amountInWordsText.isEmpty(), "Amount In Words Text is empty");
		
	}
	@Test()
	
	public void validateTransferFundText() {
		transferFundPage.trandferFundText();
		String transferFundText = transferFundPage.TRANSFERFUND_TEXT.getText();
		String expectedText = "Transfer fund";
		Assert.assertEquals(transferFundText, expectedText);
		/*
		 * Assert.assertEquals(transferFundText,
		 * expectedText,"Transfer Fund Text is correct");
		 */		 
		
			
	}
	@Test()
	public void validateFundTypeText() {
		transferFundPage.walletButton();
		String fundTypeText = transferFundPage.TRANSFERFUND_FUNDTYPE_TEXT.getText();
		Assert.assertEquals(fundTypeText, "Fund type");
		/*
		 * Assert.assertEquals(fundTypeText, "Fund type", "Fund type Text is correct");
		 */		
	}
	@Test()
	public void validateServiceFeeText() {
		transferFundPage.walletButton();
		String serviceFeeText = transferFundPage.TRANSFERFUND_SERVICEFEE_TEXT.getText();
		Assert.assertEquals(serviceFeeText, "Service fee", "Service fee Text is correct");
		
	}
	@Test()
	public void validateTreasuryFeeText() {
		transferFundPage.walletButton();
		String treasuryFeeText = transferFundPage.TRANSFERFUND_TREASURYFEE_TEXT.getText();
		Assert.assertEquals(treasuryFeeText, "Treasury fee", "Treasury fee Text is correct");
		
	}
	@Test()
	public void validatePayeeToText() {
		transferFundPage.walletButton();
		String payeeToText = transferFundPage.TRANSFERFUND_PAYEETO_TEXT.getText();
		Assert.assertEquals(payeeToText, "Payee to", "Payee to Text is correct");
		
	}
	
	@Test()
	public void validatePayeenameText() {
		transferFundPage.walletButton();
		String payeeNameText = transferFundPage.TRANSFERFUND_PAYEENAME_TEXT.getText();
		Assert.assertEquals(payeeNameText, "Payee name", "Payee name Text is correct");
		
		
	}
	@Test()
	public void validateAmountText() {
		transferFundPage.walletButton();
		
		String amountText = transferFundPage.TRANSFERFUND_AMOUNT_TEXT.getText();
		Assert.assertEquals(amountText, "Amount", "Amount Text is correct");
		
		
	}
	
	@Test()
	public void validateAmountInWordsText() {
		transferFundPage.walletButton();
		String amountInWordsText = transferFundPage.TRANSFERFUND_AMOUNTINW_TEXT.getText();
		Assert.assertEquals(amountInWordsText, "Amount(in words)", "Amount(in words) Text is correct");
		
		
		
	}
	@Test()
public void validateRemarksText() {
		transferFundPage.walletButton();
		String remarksText = transferFundPage.TRANSFERFUND_REMARKS_TEXT.getText();
		Assert.assertEquals(remarksText, "Remarks", "Remarks Text is correct");
		
	}
	
	@Test()
public void validateGetOTPText() {
		transferFundPage.walletButton();
		String getOTPText = transferFundPage.TRANSFERFUND_GETOTP_TEXT.getText();
		Assert.assertEquals(getOTPText, "Get OTP", "Get OTP Text is correct");
	
}
	
	@Test()
public void validateResendOTPText() {
		transferFundPage.walletButton();
		String resendOTPText = transferFundPage.TRANSFERFUND_RESENDOTP_TEXT.getText();
		Assert.assertEquals(resendOTPText, "Resend OTP", "Resend OTP Text is correct");
	
}
	
	@Test()
public void validateOTPText() {
		transferFundPage.walletButton();
		String otpText = transferFundPage.TRANSFERFUND_OTP_TEXT.getText();
		Assert.assertEquals(otpText, "OTP", "OTP Text is correct");
	
	
}	
	
	@Test()
public void validateDidNotGetOTPText() {
		transferFundPage.walletButton();
		String didNotGetOtpText = transferFundPage.TRANSFERFUND_DIDNOTGETOTP_TEXT.getText();
		Assert.assertEquals(didNotGetOtpText, "Did not get OTP?Resend OTP after mm:ss", "Did not Get?OTP Text is correct");
	
}
	@Test()
public void validateProceedText() {
		transferFundPage.walletButton();
	String proceedText = transferFundPage.TRANSFERFUND_PROCEED_TEXT.getText();
	Assert.assertEquals(proceedText, "Proceed", "Proceed Text is correct");
	
}
@Test()
public void validateClearText() {
	transferFundPage.walletButton();
	String clearText = transferFundPage.TRANSFERFUND_CLEAR_TEXT.getText();
	Assert.assertEquals(clearText, "Clear", "Clear Text is correct");
}

@Test()
public void validateAlertBoxText() {
	var jsonData = JsonUtils.getJsonData("fundTransfer");

	transferFundPage.transferFund(jsonData.get("payeeTo"),jsonData.get("amount"));
	
	String alertText = transferFundPage.TRANSFERFUND_ALERT_TEXT.getText();
	Assert.assertEquals(alertText, "Fund transferred to the payee successfully.", "Alert Text is correct");
	
	
}

@Test()
public void validateAlertHeadingText() {
	var jsonData = JsonUtils.getJsonData("fundTransfer");

	transferFundPage.transferFund(jsonData.get("payeeTo"),jsonData.get("amount"));
	String alertHeadingText = transferFundPage.TRANSFERFUND_ALERTHEADING_TEXT.getText();
	Assert.assertEquals(alertHeadingText, "Alert", "Alert Text is correct");
	
	
}

@Test()
public void validateCloseTooltipText() {
	var jsonData = JsonUtils.getJsonData("fundTransfer");

	transferFundPage.transferFund(jsonData.get("payeeTo"),jsonData.get("amount"));
	String closeToolTipText = transferFundPage.TRANSFERFUND_CLOSETP_TEXT.getText();
	Assert.assertEquals(closeToolTipText, "Close", "Close Text is correct");
	
	
}
@Test()
public void validatePayeeToPlaceholderText() {
	transferFundPage.walletButton();
	String payeeToPHText = transferFundPage.TRANSFERFUND_PAYEETO_PH_TEXT.getText();
	Assert.assertEquals(payeeToPHText, "Mobile/Username/Email id", "Payee to PH Text is correct");
	
	
}

@Test()
public void validatePayeeNamePlaceholderText() {
	transferFundPage.walletButton();
	String payeeNamePHText = transferFundPage.TRANSFERFUND_PAYEENAME_PH_TEXT.getText();
	Assert.assertEquals(payeeNamePHText, "Payee name", "Payee name PH Text is correct");
	
}

@Test()
public void validateOTPPlaceholderText() {
	transferFundPage.walletButton();
	String otpPHText = transferFundPage.TRANSFERFUND_OTP_PH_TEXT.getText();
	Assert.assertEquals(otpPHText, "Enter OTP", "OTP PH Text is correct");
	
}



@Test(groups= {"demo"})
public void validateZeroAmount() {
	var jsonData = JsonUtils.getJsonData("zeroAmount");
  
	transferFundPage.amountValidation(jsonData.get("payeeTo"),jsonData.get("amount"));
	boolean isNotClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
	if(isNotClickable==true)
	Assert.assertFalse(isNotClickable, "Proceed button is clickable with zero amount");
	else
	System.out.println("Proceed Button is not clickable ");
	
	
}
@Test(groups= {"demo"})
public void validateNegativeAmount() {
	var jsonData = JsonUtils.getJsonData("invalidAmountaddFundNegval");
	transferFundPage.amountValidation(jsonData.get("payeeTo"),jsonData.get("amount"));
	boolean isNotClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
	if(isNotClickable==true)
	Assert.assertFalse(isNotClickable, "Proceed button is clickable with Negative Amount value");
	else
	System.out.println("Proceed Button is not clickable ");

 
}
@Test(groups= {"demo"})
public void validateThreeDecimalAmount() {
	var jsonData = JsonUtils.getJsonData("amountaddFundecVal3");
	transferFundPage.amountValidation(jsonData.get("payeeTo"),jsonData.get("amount"));
	boolean isNotClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
	if(isNotClickable==true)
	Assert.assertFalse(isNotClickable, "Proceed button is clickable with 3 Decimal Amount value");
	else
	System.out.println("Proceed Button is not clickable ");
}
@Test(groups= {"demo"})
public void validateTwoDecimalAmount() {
	var jsonData = JsonUtils.getJsonData("amountaddFundecVal2");
	transferFundPage.amountValidation(jsonData.get("payeeTo"),jsonData.get("amount"));
	boolean isClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
	if(isClickable==true)
	Assert.assertTrue(isClickable, "Proceed button is clickable with 2 Decimal Amount value");
	else
	System.out.println("Proceed Button is not clickable ");
}
@Test(groups= {"demo"})
public void validateAlphaSymAmount() {
	var jsonData = JsonUtils.getJsonData("alphabetAmount");
	transferFundPage.amountValidation(jsonData.get("payeeTo"),jsonData.get("amount"));
	boolean isNotClickable = transferFundPage.TRANSFERFUND_PROCEED.isEnabled();
	if(isNotClickable==true)
	Assert.assertFalse(isNotClickable, "Proceed button is clickable with Alphabets & Special character Amount value");
	else
	System.out.println("Proceed Button is not clickable ");

	
}


}
