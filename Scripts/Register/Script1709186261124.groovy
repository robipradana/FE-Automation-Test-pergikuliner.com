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

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/a_PergiKuliner'))

WebUI.verifyElementText(findTestObject('Object Repository/Register/a_Daftar'), 
    'Daftar')

WebUI.click(findTestObject('Object Repository/Register/a_Daftar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/inpt_username'))

WebUI.setText(findTestObject('Object Repository/Register/inpt_username'), 
    'robi28')

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/inpt_email'))

WebUI.setText(findTestObject('Object Repository/Register/inpt_email'), 
    'robipradana1996@gmail.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/inpt_password'))

'@robipm28\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Register/inpt_password'), 
    'unTQ/yXUlYbaXPVxOKpyFQ==')

WebUI.verifyElementVisible(findTestObject('Object Repository/Register/inpt_password_confirmation'))

'@robipm28\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Register/inpt_password_confirmation'), 
    'unTQ/yXUlYbaXPVxOKpyFQ==')

WebUI.verifyElementClickable(findTestObject('Object Repository/Register/select_Tanggal12345678910111213141516171819_8bbfe8'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/select_Tanggal12345678910111213141516171819_8bbfe8'), 
    '2', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Register/select_BulanJanFebMarAprMeiJunJulAgsSepOktNovDes'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/select_BulanJanFebMarAprMeiJunJulAgsSepOktNovDes'), 
    '7', true)

WebUI.verifyElementClickable(findTestObject('Object Repository/Register/select_Tahun2014201320122011201020092008200_4e00f4'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Register/select_Tahun2014201320122011201020092008200_4e00f4'), 
    '1996', true)

WebUI.verifyElementClickable(findTestObject('Register/inpt_checkbox'))

WebUI.click(findTestObject('Object Repository/Register/inpt_checkbox'))

WebUI.verifyElementClickable(findTestObject('Register/btn-signup'))

WebUI.click(findTestObject('Object Repository/Register/btn-signup'))

WebUI.closeBrowser()

