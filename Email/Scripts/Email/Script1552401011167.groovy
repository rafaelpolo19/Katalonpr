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

WebUI.openBrowser('https://www.mail.com/int')

WebUI.delay(2)

WebUI.click(findTestObject('a_Log in'))

WebUI.delay(2)

WebUI.setText(findTestObject('input_Email_username'), 'katalon@mail.com')

WebUI.delay(2)

WebUI.setText(findTestObject('input_Password_password'), '@Admin123')

WebUI.delay(2)

WebUI.click(findTestObject('span_Log in'))

WebUI.delay(2)

WebUI.click(findTestObject('span_E-mail'))

WebUI.delay(2)

WebUI.click(findTestObject('a_Compose E-mail'))

WebUI.delay(2)

WebUI.setText(findTestObject('input_To'), 'jackson.hernandez@periferiaitgroup.com')

WebUI.delay(2)

WebUI.click(findTestObject('span_Subject_email_rko'))

WebUI.delay(2)

WebUI.click(findTestObject('span_icon'))

WebUI.delay(2)

WebUI.click(findTestObject('span_wellplayed'))

WebUI.delay(2)

WebUI.click(findTestObject('Page_Free Email Addresses Web based and secure Email - mailcom/Page_Free Email Addresses Web based and secure Email - mailcom/button_Send_mole'))

