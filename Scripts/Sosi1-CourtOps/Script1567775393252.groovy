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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-3-214-106-151.compute-1.amazonaws.com/login')

WebUI.setText(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/input_Email_email'), 'dhaval.b.nagar@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/input_Password_password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/button_Login'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'), 
    0)

WebUI.verifyElementClickable(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'))

WebUI.click(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/a_Court Operations'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_FINFacility IN'))

WebUI.setText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_ECOI_checkInEcoiId'), '6503003')

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Submit'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/span_ECOI 6503003 Facility IN successful'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Close'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_FOUTFacility OUT'))

WebUI.setText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_ECOI_checkOutEcoiId'), '6503003')

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Facility OUT'))

WebUI.setText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/textarea_Interpreter was not checked in with Judge Reason required to complete release_form-control ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required'), 
    'TEST NOT USED')

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Facility Out (1)'))

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_1'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_2'), 'lnBUteI2ioQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_3'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_4'), '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_5'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_6'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_7'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Submit_1'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/span_None Selected'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/label_Respondent Did Not Appear'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Release  Facility OUT'))

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_8'), 'HeCM15nHKBI=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_9'), 'lnBUteI2ioQ=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_10'), 'tzH6RvlfSTg=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_11'), '4nvbrPglk7k=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_12'), 'iGDxf8hSRT4=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_13'), 'aeHFOx8jV/A=')

WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_14'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Submit_2'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/span_ECOI 6503003 Facility OUT Successful'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Close'))

WebUI.closeBrowser()

