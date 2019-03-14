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

WebUI.openBrowser('https://accounts.zoho.com/signin?servicename=VirtualOffice&signupurl=https://www.zoho.com//workplace/pricing.html?src=zmail-signup&serviceurl=https%3A%2F%2Fmail.zoho.com%2Fzm%2F')

WebUI.setEncryptedText(findTestObject('input_username'), '/qFNx0rqStfBBglodI/1Aw==')

WebUI.setEncryptedText(findTestObject('input_pwd'), 'wvKuO/7+M90urnQVYSbITw==')

WebUI.click(findTestObject('div_Iniciar sesin'))

WebUI.delay(5)

not_run: WebUI.click(findTestObject('a_Yes I Understand'))

WebUI.delay(15)

WebUI.click(findTestObject('span_Correo nuevo'))

WebUI.delay(5)

WebUI.setEncryptedText(findTestObject('input_Para'), 'NQIXcwPPhAm3awOpzJEpfCYlpvXdc2WAglBth6gA/CKm8OCyrtgI6w==')

WebUI.setText(findTestObject('input_Asunto'), 'Prueba')

WebUI.delay(5)

WebUI.click(findTestObject('span_Enviar'))

