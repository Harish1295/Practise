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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('https://letcode.in/test')

WebUI.maximizeWindow()

WebUI.click(findTestObject('SelectDropdown/Page_Workspace  LetCode with Koushik/select'))

WebUI.selectOptionByIndex(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/CountryDropdown'), 2)

WebUI.verifyOptionSelectedByIndex(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/CountryDropdown'), 
    2, 0)

WebUI.selectOptionByValue(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/programming language'), 'py', 
    false)

WebUI.verifyOptionSelectedByValue(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/programming language'), 
    'py', false, 0)

WebUI.selectOptionByLabel(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/programming language'), 'Swift', 
    false)

WebUI.verifyOptionSelectedByLabel(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/programming language'), 
    'Swift', false, 0)

WebUI.waitForElementPresent(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/Multioption'), 2)

WebUI.selectAllOption(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/Multioption'))

WebUI.deselectAllOption(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/Multioption'))

WebUI.selectOptionByIndex(findTestObject('SelectDropdown/Page_Dropdowns  LetCode with Koushik/Multioption'), '2-4')

WebUI.closeBrowser()

