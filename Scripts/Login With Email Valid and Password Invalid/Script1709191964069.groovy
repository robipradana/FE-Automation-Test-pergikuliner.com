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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://pergikuliner.com/')

WebUI.verifyElementText(findTestObject('Object Repository/Login With Email Valid and Password Invalid/a_PergiKuliner'), 
    'PergiKuliner')

WebUI.verifyElementText(findTestObject('Object Repository/Login With Email Valid and Password Invalid/a_Login'), 
    'Login')

WebUI.click(findTestObject('Object Repository/Login With Email Valid and Password Invalid/a_Login'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Login With Email Valid and Password Invalid/input__useremail'))

'input email\r\n\r\n'
WebUI.setText(findTestObject('Object Repository/Login With Email Valid and Password Invalid/input__useremail'), 
    'robipradana1996@gmail.com')

WebUI.verifyElementVisible(findTestObject('Object Repository/Login With Email Valid and Password Invalid/input__userpassword'))

'input pass @robipm28\r\n'
WebUI.setEncryptedText(findTestObject('Object Repository/Login With Email Valid and Password Invalid/input__userpassword'), 
    'iGDxf8hSRT4=')

WebUI.verifyElementVisible(findTestObject('Object Repository/Login With Email Valid and Password Invalid/input_Lupa password_commit'))

WebUI.click(findTestObject('Object Repository/Login With Email Valid and Password Invalid/input_Lupa password_commit'))

WebUI.verifyElementText(findTestObject('Object Repository/Login With Email Valid and Password Invalid/div_Email atau password yang kamu masukkan salah'), 
    'Email atau password yang kamu masukkan salah.')

WebUI.navigateToUrl('https://pergikuliner.com/users/sign_in')

WebUI.closeBrowser()

