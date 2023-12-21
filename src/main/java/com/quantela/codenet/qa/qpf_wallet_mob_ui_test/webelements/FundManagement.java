package com.quantela.codenet.qa.qpf_wallet_mob_ui_test.webelements;

/**
 * Sample code to demonstrate how to model a screen for provided app, General-Store.apk
 */
public class FundManagement {
	
		
		public static final String FUND_MANAGEMENT="//tagname[contains(text(), 'Fund Management')]";
		public static final String FUND_STATEMENT="//tagname[contains(text(), 'Fund Statement')]";
		public static final String ADD_FUND="//tagname[contains(text(), 'Add Fund')]";
		public static final String TRANSFER_FUND="//tagname[contains(text(), 'Transfer Fund')]";
		public static final String REFUND_FUND="//tagname[contains(text(), 'Fund Management')]";
		public static final String ADD_FUND_TO_SERVICEPROVIDER="//tagname[contains(text(), 'Add Fund To Service Provider')]";
		
		/*Initial dummy Elements*/
		
		public static final String HOME_WALLETSCREEN="//android.widget.Button[contains(@content-desc=\"Wallet Screen\")]";

		
		
		
		/*Locators for Fund Statement Elements */
		public static final String FUNDSTATEMENT_FUNDBALANCE="//tagname[contains(text(), 'Fund Balance')]";
		public static final String FUNDSTATEMENT_BLOCKEDBALANCE="//tagname[contains(text(), 'Blocked Balance')]";
		public static final String FUNDSTATEMENT_FUNDTYPE_SERVICEFEE="//tagname[contains(text(), 'Service Fee')]";
		public static final String FUNDSTATEMENT_FUNDTYPE_TREASURYFEE="//tagname[contains(text(), 'Treasury Fee')]";
		public static final String FUNDSTATEMENT_FUNDTYPE_MINISTATEMENT="//tagname[contains(text(), 'Mini Statement')]";
		public static final String FUNDSTATEMENT_FUNDTYPE_DATEWISE="//tagname[contains(text(), 'Date Wise')]";
		public static final String FUNDSTATEMENT_FROMDATE="//tagname[contains(text(), 'From Date')]";
		public static final String FUNDSTATEMENT_TODATE="//tagname[contains(text(), 'To Date')]";
		public static final String FUNDSTATEMENT_PROCEED="//tagname[contains(text(), 'Proceed')]";
		public static final String FUNDSTATEMENT_CLEAR="//tagname[contains(text(), 'Clear')]";
		public static final String FUNDSTATEMENT_SEARCH="//tagname[contains(text(), 'Search')]";
		public static final String FUNDSTATEMENT_EXCEL="//tagname[contains(text(), 'Excel')]";
		public static final String FUNDSTATEMENT_SNO="//tagname[contains(text(), 'S.No.')]";
		public static final String FUNDSTATEMENT_TRANSACTIONNO="//tagname[contains(text(), 'Transaction No.')]";
		public static final String FUNDSTATEMENT_TRANSACTIONDATE="//tagname[contains(text(), 'Transaction Date')]";
		public static final String FUNDSTATEMENT_DETAILS="//tagname[contains(text(), 'Details')]";
		public static final String FUNDSTATEMENT_DEBITAMOUNT="//tagname[contains(text(), 'Debit Amount')]";
		public static final String FUNDSTATEMENT_BALANCENO="//tagname[contains(text(), 'Balance Amount')]";
		public static final String FUNDSTATEMENT_REFERENCENO="//tagname[contains(text(), 'Reference No')]";
		public static final String FUNDSTATEMENT_PREVIOUS="//tagname[contains(text(), 'Previuos')]";
		public static final String FUNDSTATEMENT_NEXT="//tagname[contains(text(), 'Next')]";
		
		

		
		/*Locators for Add Fund Elements */
		public static final String ADDFUND_FUNDBALANCE="//tagname[contains(text(), 'Fund Balance')]";
		public static final String ADDFUND_BLOCKEDBALANCE="//tagname[contains(text(), 'Blocked Balance')]";
		public static final String ADDFUND_FUNDTYPE_SERVICEFEE="//tagname[contains(text(), 'Service Fee')]";
		public static final String ADDFUND_FUNDTYPE_TREASURYFEE="//tagname[contains(text(), 'Treasury Fee')]";
		public static final String ADDFUND_AMOUNT="//tagname[contains(text(), 'Amount')]";
		public static final String ADDFUND_PROCEED="//tagname[contains(text(), 'Proceed')]";
		public static final String ADDFUND_CLEAR="//tagname[contains(text(), 'Clear')]";
		//public static final String addFundPayementGatewayPaymentPrefferedPaymentMethodXpath="//tagname[contains(text(), 'Preffered Payment Method')]";
		//public static final String addFundPayementGatewayPaymentCardXpath="//tagname[contains(text(), 'Card')]";
		//public static final String addFundPayementGatewayUPIXpath="//tagname[contains(text(), 'UPI')]";
		//public static final String addFundPayementGatewayNetBankingXpath="//tagname[contains(text(), 'NetBanking')]";
		//public static final String addFundalertXpath="//tagname[contains(text(), 'alert')]";
		
		public static final String ADDFUND_POPUPTEXT="//tagname[contains(text(), 'Clear')]";
		public static final String ADDFUND_CLOSE="//tagname[contains(text(), 'Clear')]";

		
		
		
		
		
		/*Locators for Add Fund to service provider Elements */
		public static final String ADDFUND_SERVICEPROVIDER_PAYEETO="//tagname[contains(text(), 'Payee To')]";
		public static final String ADDFUND_SERVICEPROVIDER_PAYEENAME="//tagname[contains(text(), 'Payee Name')]";
		public static final String ADDFUND_SERVICEPROVIDER_AMOUNT="//tagname[contains(text(), 'Amount')]";
		public static final String ADDFUND_SERVICEPROVIDER_AMOUNTINWORDS="//tagname[contains(text(), 'Amount in Words')]";
		public static final String ADDFUND_SERVICEPROVIDER_REMARKS="//tagname[contains(text(), 'Remarks')]";
		public static final String ADDFUND_SERVICEPROVIDER_GETOTP="//tagname[contains(text(), 'Get OTP')]";
		public static final String ADDFUND_SERVICEPROVIDER_RESENDOTP="//tagname[contains(text(), 'Resent OTP')]";
		public static final String ADDFUND_SERVICEPROVIDER_ENTEROTP="//tagname[contains(text(), 'Enter OTP')]";
		public static final String ADDFUND_SERVICEPROVIDER_PROCEED="//tagname[contains(text(), 'Proceed')]";
		public static final String ADDFUND_SERVICEPROVIDER_CLEAR="//tagname[contains(text(), 'Clear')]";
		public static final String ADDFUND_SERVICEPROVIDER_ALERT="//tagname[contains(text(), 'alert')]";
		public static final String ADDFUND_SERVICEPROVIDER_ALERTCLOSE="//tagname[contains(text(), 'alert')]";
		
		
		/*Locators for transfer Fund Elements */
		
		
		public static final String TRANSFERFUND_WALLETSCREEN="//android.widget.Button[@content-desc=\"Wallet Screen\"]";
		public static final String TRANSFERFUND_FUNDTYPE_SERVICEFEE="//android.view.View[@content-desc=\"Service Fee\"]/android.widget.RadioButton";
		public static final String TRANSFERFUND_FUNDTYPE_TREASURYFEE="//android.view.View[@content-desc=\"Treasury Fee\"]/android.widget.RadioButton";
		public static final String TRANSFERFUND_PAYEETO="(//android.widget.EditText)[1]";
		public static final String TRANSFERFUND_PAYEENAME="//android.view.View[6]";
		public static final String TRANSFERFUND_AMOUNT="(//android.widget.EditText)[2]";
		public static final String TRANSFERFUND_AMOUNTINWORDS="//android.view.View[9]";
		public static final String TRANSFERFUND_REMARKS="//android.view.View[11]";
		public static final String TRANSFERFUND_GETOTP="//android.widget.Button[@content-desc='Get OTP']";
		public static final String TRANSFERFUND_RESENDOTP="//android.widget.Button[@content-desc=\"Resend OTP\"]";
		public static final String TRANSFERFUND_ENTEROTP="(//android.widget.EditText)[1]";
		public static final String TRANSFERFUND_PROCEED="//android.widget.Button[@content-desc='Proceed']";
		public static final String TRANSFERFUND_CLEAR="//android.widget.Button[@content-desc=\"Clear\"]";
		public static final String TRANSFERFUND_ALERT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_ALERTCLOSE="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_TEXT="//android.view.View[@content-desc=\"Transfer fund\"], Transfer fund";
		public static final String TRANSFERFUND_FUNDTYPE_TEXT="//android.view.View[@content-desc=\"Fund Type *\"]";
		public static final String TRANSFERFUND_SERVICEFEE_TEXT="//android.view.View[@content-desc=\"Service Fee\"]";
		public static final String TRANSFERFUND_TREASURYFEE_TEXT="//android.view.View[@content-desc=\"Treasury Fee\"]";
		public static final String TRANSFERFUND_PAYEETO_TEXT="//android.view.View[@content-desc=\"Payee to *\"]";
		public static final String TRANSFERFUND_AMOUNT_TEXT="//android.view.View[@content-desc=\"Amount *\"]";
		public static final String TRANSFERFUND_PAYEENAME_TEXT="//android.view.View[@content-desc=\"Payee name\"]";
		public static final String TRANSFERFUND_AMOUNTINW_TEXT="//android.view.View[@content-desc=\"Amount (in Words)\"]";
		public static final String TRANSFERFUND_GETOTP_TEXT="//android.widget.Button[@content-desc=\"Get OTP\"]";
		public static final String TRANSFERFUND_REMARKS_TEXT="//android.view.View[@content-desc=\"Remarks\"]";
		public static final String TRANSFERFUND_RESENDOTP_TEXT="//android.widget.Button[@content-desc=\"Resend OTP\"]";
		public static final String TRANSFERFUND_OTP_TEXT="//android.view.View[@content-desc=\"OTP *\"]";
		public static final String TRANSFERFUND_DIDNOTGETOTP_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_PROCEED_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_CLEAR_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_ALERT_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_ALERTHEADING_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_CLOSE_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_CLOSETP_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_PAYEETO_PH_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_PAYEENAME_PH_TEXT="//tagname[contains(text(), 'Alert')]";
		public static final String TRANSFERFUND_OTP_PH_TEXT="//tagname[contains(text(), 'Alert')]";









		/*Locators for Refund Fund (Citizen, permitted internal users) Elements */
		
		
		
		
		public static final String REFUNDFUND_MINISTATEMENT="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_DATEWISE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_FROMDATE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_TODATE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_ACTION="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_REFUNDBUTTON="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_VIEWDETAILS="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_SEARCH="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_SHOWRECORDS="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_PREVIOUS="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_NEXT="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_YES="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_NO="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_DOYOUWANTALERT="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_REFUNDAPPNO="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_OK="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_CLOSE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUND_EXCEL="//tagname[contains(text(), 'refund')]";
		
		
		/*Locators for Refund Fund (CLR account user) Elements */

		public static final String REFUNDFUNDCLR_MINISTATEMENT="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_DATEWISE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_FROMDATE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_TODATE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_ACTION="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_APPROVE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_REJECT="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_VIEWDETAILS="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_SEARCH="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_SHOWRECORDS="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_PREVIOUS="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_NEXT="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_YES="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_NO="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_DOYOUWANTALERT="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_REFUNDAPPNO="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_OK="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_CLOSE="//tagname[contains(text(), 'refund')]";
		public static final String REFUNDFUNDCLR_EXCEL="//tagname[contains(text(), 'refund')]";


	}



