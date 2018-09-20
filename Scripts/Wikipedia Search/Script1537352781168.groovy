import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebElement as WebElement
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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.wikipedia.org')

WebUI.waitForElementClickable(findTestObject('Wikipedia/Wikipedia_HomePage/Button_EnglishLanguage'), 0)

WebUI.click(findTestObject('Wikipedia/Wikipedia_HomePage/Button_EnglishLanguage'))

WebUI.waitForElementVisible(findTestObject('Wikipedia/Wikipedia_MainPage/Div_FeaturedToday'), 0)

WebUI.setText(findTestObject('Wikipedia/Wikipedia_MainPage/TextField_Search'), Search)

WebUI.click(findTestObject('Wikipedia/Wikipedia_MainPage/Button_Search'))

WebUI.waitForElementVisible(findTestObject('Wikipedia/Wikipedia_Article/Text_HeaderTitle'), 0)

if (ExpectingSuccess) {
    WebUI.verifyElementText(findTestObject('Wikipedia/Wikipedia_Article/Text_HeaderTitle'), ExpectedResult)
} else {
    CustomKeywords.'element.extended.ElementTextIsNot'(findTestObject('Wikipedia/Wikipedia_Article/Text_HeaderTitle'), ExpectedResult)
}

WebUI.closeBrowser()

