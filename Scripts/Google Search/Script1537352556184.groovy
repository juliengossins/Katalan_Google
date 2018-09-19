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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com')

WebUI.setText(findTestObject('Google/Google_HomePage/TextField_Search'), Search)

WebUI.waitForElementVisible(findTestObject('Google/Google_HomePage/Button_Embbeded_Search'), 5)

WebUI.click(findTestObject('Google/Google_HomePage/Button_Embbeded_Search'))

WebUI.waitForElementClickable(findTestObject('Google/Google_SearchResults/Link_FirstResult'), 5)

WebUI.click(findTestObject('Google/Google_SearchResults/Link_FirstResult'))

WebUI.waitForElementPresent(findTestObject('Wikipedia/Wikipedia_Article/Text_HeaderTitle'), 5)

WebUI.verifyElementText(findTestObject('Wikipedia/Wikipedia_Article/Text_HeaderTitle'), ExpectedResult)

WebUI.closeBrowser()

