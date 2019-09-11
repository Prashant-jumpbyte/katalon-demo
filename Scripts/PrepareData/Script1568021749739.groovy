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
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

def info = [('Login') : [('Email') : '', ('Password') : '', ('Status') : '', ('Type') : ''], ('Ecoi') : [('Ecoi') : '']]

def dataLogin = TestDataFactory.findTestData('Sosi1_Login_Data')

info.Login.Email = dataLogin.getValue(1, 1)

info.Login.Password = dataLogin.getValue(2, 1)

info.Login.Status = dataLogin.getValue(3, 1)

info.Login.Type = dataLogin.getValue(3, 1)

def dataEcoi = TestDataFactory.findTestData('Sosi1_Ecoi_Data')

info.Ecoi.Ecoi = dataEcoi.getValue(3, 1)

return info