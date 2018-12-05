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
import java.text.SimpleDateFormat as SimpleDateFormat
import java.util.Date as Date

WebUI.setText(findTestObject('Page_Welcome to Athlete Network/input_ONCE AN ATHLETE ALWAYS A'), firstName + GlobalVariable.nRand)

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_First Name_lastName'), lastName + 
    GlobalVariable.nRand)

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_Last Name_email'), (GlobalVariable.sEmail + 
    GlobalVariable.nRand) + 'school@yopmail.com')

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_Email_password'), GlobalVariable.sPassword)

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_START'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_ High School'))

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_This will be used as you'), 'Badmington')

WebUI.click(findTestObject('Page_Welcome to Athlete Network/button_NEXT'))

SimpleDateFormat formatter = new SimpleDateFormat('dd/MM/yyyy')

Date date = new Date()

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_We will need to know you'), formatter.format(
        date))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_Select a country'), GlobalVariable.nTimeout)

WebUI.delay(GlobalVariable.nShortTimeout, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Welcome to Athlete Network/span_Select a country'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_USA'))

WebUI.setText(findTestObject('Object Repository/Page_Welcome to Athlete Network/input_Select a country_locatio'), 'California')

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_California GA'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/button_NEXT'))

WebUI.waitForElementVisible(findTestObject('Page_Welcome to Athlete Network/inputProfessionalInterests'), 0)

WebUI.delay(GlobalVariable.nShortTimeout, FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_Welcome to Athlete Network/inputProfessionalInterests'))

WebUI.delay(GlobalVariable.nShortTimeout, FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Page_Welcome to Athlete Network/span_ProfessionalInterest'), 0)

WebUI.click(findTestObject('Page_Welcome to Athlete Network/span_ProfessionalInterest'))

WebUI.click(findTestObject('Page_Welcome to Athlete Network/button_NEXT'))

WebUI.click(findTestObject('Object Repository/Page_Welcome to Athlete Network/span_Ill DO THIS LATER'))

WebUI.waitForElementPresent(findTestObject('Page_Feed/a_NEXT'), GlobalVariable.nTimeout)

WebUI.click(findTestObject('Page_Feed/a_NEXT'))

WebUI.click(findTestObject('Page_Feed/a_NEXT2'))

WebUI.click(findTestObject('Object Repository/Page_Feed/a_FINISHED'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Feed/img'), GlobalVariable.nShortTimeout)

