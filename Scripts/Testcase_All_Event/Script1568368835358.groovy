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

def sheetData_ECOI = CustomKeywords.'com.java.utilily.ReadSpreadsheet.getSpreadSheetRecords'('1oEo8aYNFOxjolbeD_ec7JAF1K764o9A-Einppgdz1_A', 
    'Ecoi!A2:Z')

WebUI.callTestCase(findTestCase('Sosi1-Login'), [:], FailureHandling.CONTINUE_ON_FAILURE)

System.out.println('Sheet DATA ECOI >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>' + sheetData_ECOI)

if (WebUI.verifyElementNotVisible(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/button_FINFacility IN'), FailureHandling.CONTINUE_ON_FAILURE)) {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'), 
        0)

    WebUI.delay(3)

    WebUI.verifyElementClickable(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'))

    WebUI.click(findTestObject('Object Repository/Sosi1.Login/Page_SOSI1/Page_SOSI1/span_Dhaval Nagar_caret'))

    WebUI.click(findTestObject('Object Repository/Sosi1-CourtOps/Page_SOSI1/a_Court Operations'))

    WebUI.delay(2)
}

for (int index = 0; index < sheetData_ECOI.size(); index++) {
    if (sheetData_ECOI.get(index).get(1).toString().equals('Testcase_All_Events') && sheetData_ECOI.get(index).get(3).toString().equals(
        'OSI')) {
        //FIN
        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_FINFacility IN'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_ECOI_checkInEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/span_ECOI 6507816 Facility IN successful'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Close'))

        //JIN
        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_JINJudge IN'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_ECOI_judgeInEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_JIN'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/textarea_Comments_form-control ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required'), 
            sheetData_ECOI.get(index).get(4).toString())

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_JIN'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/span_ECOI 6507816 Judge IN successful'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/form_ECOIInterpreterAll InterpretersSubmission of this form confirms the accurate start time with judgeECOI 6507816 Judge IN successfulSubmit Close'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Close_1'))

        //JOUT
        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_JOUTJudge OUT'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_ECOI_judgeOutEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_JOUT1'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/textarea_Comments_form-control ng-untouched ng-dirty ng-valid-parse ng-valid ng-valid-required'), 
            sheetData_ECOI.get(index).get(5).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_JOUT1'))

        WebUI.click(findTestObject('Sosi1_All_Event/Page_SOSI1/span_1'))

        WebUI.click(findTestObject('Sosi1_All_Event/Page_SOSI1/span_2'))

        WebUI.click(findTestObject('Sosi1_All_Event/Page_SOSI1/span_3'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Confirm'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_Password_password_1'), sheetData_ECOI.get(
                index).get(9).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_2'))

        WebUI.click(findTestObject('Sosi1_All_Event/Page_SOSI1/span_ECOI 6507816 Judge OUT successful'))

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Close'))

        //LOUT
        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_LUNCHLunch OUTIN'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_ECOI_lunchOutInEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_3'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/textarea_Comments_form-control ng-untouched ng-valid ng-valid-required ng-dirty ng-valid-parse'), 
            sheetData_ECOI.get(index).get(10).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_3'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/span_ECOI 6507816 Lunch OUT successful'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Close_2'))

        //LIN
        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_LUNCHLunch OUTIN'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_ECOI_lunchOutInEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_4'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/textarea_Comments_form-control ng-untouched ng-valid ng-valid-required ng-dirty ng-valid-parse'), 
            sheetData_ECOI.get(index).get(11).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_4'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/h4_Lunch IN'))

        WebUI.delay(2)

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Confirm_1'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/span_ECOI 6507816 Lunch IN successful'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Close_3'))

        //RELEASE
        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_ROUTRelease'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_ECOI_releaseEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_Release Options_ng-pristine ng-untouched ng-invalid ng-invalid-required'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Confirm_2'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_Password_password_1'), sheetData_ECOI.get(
                index).get(9).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Submit_5'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/span_ECOI 6507816 Release Interpreter successful'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Close'))

        //FOUT
        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_FOUTFacility OUT'))

        WebUI.setText(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/input_ECOI_checkOutEcoiId'), sheetData_ECOI.get(
                index).get(2).toString())

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Facility OUT'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Facility OUT'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/span_ECOI 6507816 Facility OUT successful'))

        WebUI.click(findTestObject('Object Repository/Sosi1_All_Event/Page_SOSI1/button_Close'))
    }
}

WebUI.closeBrowser()

