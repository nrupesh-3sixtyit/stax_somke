import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.navigateToUrl('https://staxtest.stax-me.com/EnterpriseASPAP/Payments/PaymentsHeaderList.aspx?PType=CHEQUE?PageTitle=Bank+Payment+Voucher')

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Bank Payment Voucher/span_Bank Payment Voucher'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Bank Payment Voucher/input_HO_ctl00_mainContentPaymentsHeaderGri_60ef4c'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Payments/td_Select Payable Transaction'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Payments/input'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Payments/td_File No'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Payments/input_Select Payable Transaction_ctl00_main_6aa122'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Allocation/span_Allocation'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Allocation/input_Total Allocated DebitTotal Allocated _ed6f74'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Payments/td_Cheque Print Name'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Payments/input_Audit Log_ctl00_mainContentbtnCancel'))

WebUI.click(findTestObject('Object Repository/Accountant/Page_LV - Bank Payment Voucher/input_UTA ASSITANACE RECIVED PAYMENT -FT193_4b2217'))

