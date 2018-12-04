import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://172.16.164.14/')

WebUI.click(findTestObject('Page_Welcome to Athlete Network/a_Sign In'))

WebUI.click(findTestObject('Page_Welcome to Athlete Network/div_Password'))

WebUI.setText(findTestObject('Page_Welcome to Athlete Network/input_SIGN IN_mat-input-4'), 'tai.lshie@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Welcome to Athlete Network/input_Email_mat-input-5'), 'fJfSCPMMNStOFxmDHq2mgQ==')

WebUI.click(findTestObject('Page_Welcome to Athlete Network/button_SIGN IN'))

WebUI.waitForElementPresent(findTestObject('Page_Welcome to Athlete Network/a_USER  MANAGEMENT'), 0)

