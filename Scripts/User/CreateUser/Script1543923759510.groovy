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

WebUI.setText(findTestObject('Page_Welcome to Athlete Network/input_ONCE AN ATHLETE ALWAYS A'), 'Phu')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_First Name_lastName'), 'Dang')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_Last Name_email'), 'phu2@yopmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_Email_password'), 'lu6hGZoChIZb6EHOfdrPxQ==')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_START'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_ High School'))

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_This will be used as you'), 'runnning')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_NEXT'))

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_We will need to know you'), '10/20/2018')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_Select a country'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_USA'))

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_Select a country_locatio'), 'california')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_California GA'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_AccountingAuditing'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_Ill DO THIS LATER'))

WebUI.click(findTestObject('Object Repository/Page_Feed/a_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Feed/a_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Feed/a_FINISHED'))

WebUI.click(findTestObject('Object Repository/Page_Feed/img'))

WebUI.closeBrowser()

