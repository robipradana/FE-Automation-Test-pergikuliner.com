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

WebUI.openBrowser('https://pergikuliner.com')

WebUI.verifyElementText(findTestObject('Feature Rekomendasi Resto Instagramable/a_Tema lain (9)'), 'Tema lain (9)')

WebUI.click(findTestObject('Feature Rekomendasi Resto Instagramable/a_Tema lain (9)'))

WebUI.verifyElementVisible(findTestObject('Feature Rekomendasi Resto Instagramable/div_Instagramable'))

WebUI.click(findTestObject('Feature Rekomendasi Resto Instagramable/div_Instagramable'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/h1_Instagramable'))

WebUI.verifyElementText(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/a_CorkScrew Country Club'), 
    'Cork&Screw Country Club')

WebUI.click(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/a_CorkScrew Country Club'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/img'))

WebUI.click(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/a_Barat_next'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/img_1'))

WebUI.click(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/a_Barat_next_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/img_1_2'))

WebUI.verifyElementText(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/a_Lihat Menu'), 'Lihat Menu »')

WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/a_Lihat Menu'))

WebUI.click(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/a_Lihat Menu'))

WebUI.verifyElementVisible(findTestObject('Feature Rekomendasi Resto Instagramable/img'))

WebUI.click(findTestObject('Feature Rekomendasi Resto Instagramable/img'))

WebUI.verifyElementVisible(findTestObject('Feature Rekomendasi Resto Instagramable/img_1'))

WebUI.click(findTestObject('Feature Rekomendasi Resto Instagramable/img_1'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Feature Rekomendasi Resto Instagramable/img_1_2 (1)'))

WebUI.closeBrowser()

