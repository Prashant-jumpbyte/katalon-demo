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

def sheetData_LOGIN = CustomKeywords.'com.java.utilily.ReadSpreadsheet.getSpreadSheetRecords'('1oEo8aYNFOxjolbeD_ec7JAF1K764o9A-Einppgdz1_A', 
    'Login!A2:Z')

System.out.println('Sheet DATA LOGIN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>' + sheetData_LOGIN)

def sheetData_ECOI = CustomKeywords.'com.java.utilily.ReadSpreadsheet.getSpreadSheetRecords'('1oEo8aYNFOxjolbeD_ec7JAF1K764o9A-Einppgdz1_A', 
    'Ecoi!A2:Z')

System.out.println('Sheet DATA ECOI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>' + sheetData_ECOI)

//def info = WebUI.callTestCase(findTestCase('PrepareData'), [:], FailureHandling.STOP_ON_FAILURE)
//
//def Email = info.Login.Email
//
//def Password = info.Login.Password
//
//def Status = info.Login.Status
//
//def Type = info.Login.Type
//
//def Ecoi = info.Ecoi.Ecoi
//WebUI.openBrowser('')
//WebUI.navigateToUrl('http://ec2-3-214-106-151.compute-1.amazonaws.com/login')
//WebUI.clearText(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/input_Email_email'))
//
//WebUI.setText(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/input_Email_email'), Email)
//
//WebUI.clearText(findTestObject('Page_SOSI1/input_Password_password'))
//
//WebUI.setText(findTestObject('Page_SOSI1/input_Password_password'), Password)
//
//WebUI.click(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/button_Login'))
WebUI.verifyElementPresent(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'), 
    0)

WebUI.delay(3)

WebUI.verifyElementClickable(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'))

WebUI.click(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'))

WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/a_Court Operations'))

WebUI.delay(2)

for (int index = 0; index < sheetData_ECOI.size(); index++) {
    if (sheetData_ECOI.get(index).get(1).toString().equals('Valid') && sheetData_ECOI.get(index).get(3).toString().equals(
        'OSI')) {
        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_FINFacility IN'))

        WebUI.setText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_ECOI_checkInEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Submit'))

        WebUI.verifyElementPresent(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/span_ECOI 6503003 Facility IN successful'), 
            0)

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Close'))

        WebUI.delay(3)

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_FOUTFacility OUT'))

        WebUI.setText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_ECOI_checkOutEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Facility OUT'))

        WebUI.setText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/textarea_Interpreter was not checked in with Judge Reason required to complete release_form-control ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required'), 
            'TEST NOT USED')

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Facility Out (1)'))

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_1'), 
            'HeCM15nHKBI=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_2'), 
            'lnBUteI2ioQ=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_3'), 
            'tzH6RvlfSTg=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_4'), 
            '4nvbrPglk7k=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_5'), 
            'iGDxf8hSRT4=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_6'), 
            'aeHFOx8jV/A=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_7'), 
            'aeHFOx8jV/A=')

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Submit_1'))

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/span_None Selected'))

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/label_Respondent Did Not Appear'))

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Release  Facility OUT'))

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_8'), 
            'HeCM15nHKBI=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_9'), 
            'lnBUteI2ioQ=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_10'), 
            'tzH6RvlfSTg=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_11'), 
            '4nvbrPglk7k=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_12'), 
            'iGDxf8hSRT4=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_13'), 
            'aeHFOx8jV/A=')

        WebUI.setEncryptedText(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/input_Password_password_14'), 
            'aeHFOx8jV/A=')

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_Submit_2'))

        assert WebUI.verifyElementPresent(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/span_ECOI 6503003 Facility OUT Successful'), 
            0) == true

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/FUT_Button_Close'))
    }
}

WebUI.closeBrowser()