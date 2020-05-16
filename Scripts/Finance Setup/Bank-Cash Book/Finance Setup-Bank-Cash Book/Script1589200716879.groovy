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

//WebUI.openBrowser('')
//WebUI.navigateToUrl('https://staxtest.stax-me.com/Login.aspx')
//WebUI.setText(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_Smart Travel Accounting System - STAX/input_Username_Login1UserName'), 
//    'admin')
//WebUI.setEncryptedText(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_Smart Travel Accounting System - STAX/input_Password_Login1Password'), 
//    'o6AErzlQejsZayvsbtp8iA==')
//WebUI.setText(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_Smart Travel Accounting System - STAX/input_Enter number displayed in the Image_L_dc3fc4'), 
//    '1@3$5^7*')
//WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_Smart Travel Accounting System - STAX/input_Enter number displayed in the Image_L_79ef99'))
//WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - DashBoard/a_System Setup'))

//WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - DashBoard/a_Finance Setup'))

WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - DashBoard/a_Bank-Cash Book'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - Bank Accounts List/span_Bank-Cash Book'))

WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - Bank Accounts List/input_Branch_ctl00_mainContentBankAccountsG_bfadf0'))

WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - Bank Accounts/span_Bank Accounts'))

WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - Bank Accounts/input_HO_ctl00_mainContentActionPanel1btn__Reject'))

WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - Bank Accounts List/span_Main'))

WebUI.click(findTestObject('Object Repository/System Setup/Finance Setup-Bank-Cash Book/Page_LV - Bank Accounts List/input_Gassim_ctl00_mainContentActionPanel1b_764e69'))

