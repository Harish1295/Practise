import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('https://letcode.in/test')

WebUI.click(findTestObject('Alertobjects/Page_Workspace  LetCode with Koushik/Alert_button'))

WebUI.click(findTestObject('Alertobjects/Page_Alert  LetCode with Koushik/SimpleAlertbtn'))

WebUI.acceptAlert()

WebUI.click(findTestObject('Alertobjects/Page_Alert  LetCode with Koushik/Confirmalertbtn'))

WebUI.dismissAlert()

WebUI.click(findTestObject('Alertobjects/Page_Alert  LetCode with Koushik/promptalertbtn'))

WebUI.setAlertText('test')

WebUI.acceptAlert()

WebUI.click(findTestObject('Alertobjects/Page_Alert  LetCode with Koushik/moderalertbtn'))

WebUI.click(findTestObject('Alertobjects/Page_Workspace  LetCode with Koushik/Page_Alert  LetCode with Koushik/button_Modern Alert_modal-close is-large'))

WebUI.closeBrowser()

