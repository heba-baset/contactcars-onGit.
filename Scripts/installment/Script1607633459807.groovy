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

WebUI.navigateToUrl('https://www.contactcars.com/')

WebUI.selectOptionByValue(findTestObject('Object Repository/installment/Page_      - ContactCars.com/select_'), '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/installment/Page_      - ContactCars.com/select_ (1)'), '10', 
    true)

WebUI.click(findTestObject('Object Repository/installment/Page_      - ContactCars.com/input__btnnewsearch'))

WebUI.click(findTestObject('Object Repository/installment/Page_   - ContactCars.com/a_1.6 AT HL New Shape Sedan'))

WebUI.click(findTestObject('Object Repository/installment/Page_      2020 - ContactCars.com/a_'))

//println ("Value =  ---> "+webui.getText(findTestObject('Object Repository/installment/Page_ - ContactCars.com/input_ _down_payment_percent'))
println("testttttt"+ WebUI.getAttribute(findTestObject('Object Repository/installment/Page_ - ContactCars.com/input_ _down_payment_percent'), “value”))
