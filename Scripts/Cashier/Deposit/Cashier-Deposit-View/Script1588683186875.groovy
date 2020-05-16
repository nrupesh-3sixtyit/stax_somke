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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staxtest.stax-me.com/Login.aspx')

WebUI.maximizeWindow()

WebUI.setText(findTestObject('Object Repository/Cashier/Deposit-View/Page_Smart Travel Accounting System - STAX/input_Username_Login1UserName'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Cashier/Deposit-View/Page_Smart Travel Accounting System - STAX/input_Password_Login1Password'), 
    'o6AErzlQejsZayvsbtp8iA==')

WebUI.setText(findTestObject('Object Repository/Cashier/Deposit-View/Page_Smart Travel Accounting System - STAX/input_Enter number displayed in the Image_L_dc3fc4'), 
    '1@3$5^7*')

WebUI.click(findTestObject('Object Repository/Cashier/Deposit-View/Page_Smart Travel Accounting System - STAX/input_Enter number displayed in the Image_L_79ef99'))

WebUI.click(findTestObject('Object Repository/Cashier/Deposit-View/Page_LV - DashBoard/a_Cashier Transaction'))

WebUI.click(findTestObject('Object Repository/Cashier/Deposit-View/Page_LV - DashBoard/a_DepositTransfer'))

WebUI.click(findTestObject('Object Repository/Cashier/Deposit-View/Page_LV - DepositTransfer/span_DepositTransfer'))

WebUI.click(findTestObject('Object Repository/Cashier/Deposit-View/Page_LV - DepositTransfer/input_Supporting Document List_ctl00_mainCo_731f8f'))

WebUI.closeBrowser()

