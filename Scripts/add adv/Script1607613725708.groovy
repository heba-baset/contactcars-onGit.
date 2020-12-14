import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://www.contactcars.com/')
 
'Maximize current window'
WebUI.maximizeWindow() 

//WebUI.navigateToUrl('https://www.contactcars.com/')
WebUI.verifyElementText(findTestObject('Page_      - ContactCars.com/registertext'), 'تسجيل الدخول', FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Page_      - ContactCars.com/registertext'))
   
WebUI.click(findTestObject('userexist/Page_      - ContactCars.com/userlogin'))

WebUI.navigateToUrl('https://www.contactcars.com/user/login')

WebUI.setText(findTestObject('Object Repository/userexist/Page_ - ContactCars.com/input_    _Email'), 'heba.bibo92@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/userexist/Page_ - ContactCars.com/input_ _Password'), 'iFGeFYmXIrUhQZHvW7P22w==')

WebUI.click(findTestObject('Object Repository/userexist/Page_ - ContactCars.com/input_ _btnlogin'))

WebUI.callTestCase(findTestCase('add new car'), [:], FailureHandling.STOP_ON_FAILURE)

