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

WebUI.click(findTestObject('userexist/Page_      - ContactCars.com/a_addadvirtisment'))

WebUI.click(findTestObject('userexist/Page_  - ContactCars.com/a_addnewcar'))

WebUI.selectOptionByValue(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/select_'), '4', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/select_ 1471564C'), '13', 
    true)

WebUI.selectOptionByValue(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/select_ 4x4MVPSUV'), '7', 
    true)

WebUI.setText(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/input_  ( )_CC'), '100')

WebUI.setText(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/input__KiloMeters'), '10')

WebUI.setText(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/input_ ( )_Price'), '100000')

WebUI.setText(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/textarea_ _NotesAr'), 'test about new car')

WebUI.click(findTestObject('addcarimages/Page_   - ContactCars.com/Page_   - ContactCars.com/pickfilesimg'))

//WebUI.click(findTestObject('Object Repository/userexist/Page_   - ContactCars.com/span_'))
'Uploading the File using Send Keys method by passing the File path'
WebUI.uploadFile(findTestObject('addcarimages/Page_   - ContactCars.com/Page_   - ContactCars.com/pickfilesimg'), 'C:/Users/ahmed/Desktop/sultan-gardens-resort.jpg')

'Capturing the file name after upload and storing it in a variable'

//FilePath = WebUI.getAttribute(findTestObject('Upload File'), 'value')
//WebUI.verifyMatch(FilePath, 'C:\\fakepath\\sultan-gardens-resort.jpg', false)
'Verifying the Actual path and Expected path of file'

