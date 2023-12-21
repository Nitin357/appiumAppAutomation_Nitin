package com.quantela.codenet.qa.qpf_wallet_mob_ui_test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.core.BaseTest;
import com.quantela.codenet.qa.qpf_wallet_mob_ui_test.utils.JsonUtils;

public class AddFundTest extends BaseTest{
	
	
	@Test()
	
	public void addFund() {
		var jsonData = JsonUtils.getJsonData("addFund");
		addFundPage.addFundToCitizen(jsonData.get("amount"));
		Assert.assertEquals(addFundPage.ADDFUND_POPUPTEXT.getAttribute("null"),"Able to Add Fund to the Citizen user" );
		
	}
	@Test()
	public void addFundInvalidAmount() {
		var jsonData = JsonUtils.getJsonData("invalidAmountaddFundLessThan10");
		addFundPage.addFundToCitizen(jsonData.get("amount"));
		boolean isNotClickable = addFundPage.ADDFUND_PROCEED.isEnabled();
		Assert.assertFalse(isNotClickable, "Proceed is Clickable but it should not be");
		}
	@Test()
	public void invalidAmountaddFundGreThan10k() {
		var jsonData = JsonUtils.getJsonData("invalidAmountaddFundGreThan10k");
		addFundPage.addFundToCitizen(jsonData.get("amount"));
		boolean isNotClickable = addFundPage.ADDFUND_PROCEED.isEnabled();
		Assert.assertFalse(isNotClickable, "Proceed is Clickable but it should not be");
		
	}
	@Test()
	public void invalidAmountaddFundNegval() {
		var jsonData = JsonUtils.getJsonData("invalidAmountaddFundNegval");
		addFundPage.addFundToCitizen(jsonData.get("amount"));
		boolean isNotClickable = addFundPage.ADDFUND_PROCEED.isEnabled();
		Assert.assertFalse(isNotClickable, "Proceed is Clickable but it should not be");
		
	}
	@Test()
	
	public void amountaddFundecVal() {
		var jsonData = JsonUtils.getJsonData("amountaddFundecVal");
		addFundPage.addFundToCitizen(jsonData.get("amount"));
		boolean isNotClickable = addFundPage.ADDFUND_PROCEED.isEnabled();
		Assert.assertFalse(isNotClickable, "Proceed is Clickable but it should not be");
		
	}
	
	

}
