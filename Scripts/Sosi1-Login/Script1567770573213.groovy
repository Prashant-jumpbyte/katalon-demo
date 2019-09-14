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

//
//List<List> sheetData_LOGIN = CustomKeywords.'com.java.utilily.ReadSpreadsheet.getSpreadSheetRecords'('1oEo8aYNFOxjolbeD_ec7JAF1K764o9A-Einppgdz1_A', 
//    'Login!A2:Z')
def sheetData_LOGIN = CustomKeywords.'com.java.utilily.ReadSpreadsheet.getSpreadSheetRecords'('1oEo8aYNFOxjolbeD_ec7JAF1K764o9A-Einppgdz1_A', 
    'Login!A2:Z')

System.out.println('Sheet DATA LOGIN >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>' + sheetData_LOGIN)

//def info = WebUI.callTestCase(findTestCase('null'), [:], FailureHandling.STOP_ON_FAILURE)
//
//def Email = info.Email
//
//def Password = info.Password
//
//def Status = info.Status
//
//def Type = info.Type
WebUI.openBrowser('')

WebUI.navigateToUrl('http://ec2-3-214-106-151.compute-1.amazonaws.com/login')

if (WebUI.verifyElementVisible(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/input_Email_email'))) {
    for (int index = 0; index < sheetData_LOGIN.size(); index++) {
        WebUI.clearText(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/input_Email_email'))

        WebUI.setText(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/input_Email_email'), sheetData_LOGIN.get(
                index).get(0).toString())

        WebUI.clearText(findTestObject('Page_SOSI1/input_Password_password'))

        WebUI.setText(findTestObject('Page_SOSI1/input_Password_password'), sheetData_LOGIN.get(index).get(1).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/button_Login'))

        WebUI.verifyElementPresent(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'), 
            0)
    }
}