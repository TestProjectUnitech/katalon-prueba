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
import com.kms.katalon.core.db.DatabaseConnection as database
import com.kms.katalon.core.db.SqlRunner as sqlrun

WebUI.openBrowser('')

WebUI.navigateToUrl('http://beta-eje.jusbaires.gob.ar/iurix-ui/u/actuacion/expId/2355087')

WebUI.setText(findTestObject('Object Repository/otra prueba/Page_Inicia sesin en Eje/input_Usuario o email_username'), 'iurixqacayt')

WebUI.setEncryptedText(findTestObject('Object Repository/otra prueba/Page_Inicia sesin en Eje/input_Contrasea_password'), 
    '1zwbeAqzpqlGM0TvV6IPtg==')

WebUI.click(findTestObject('Object Repository/otra prueba/Page_Inicia sesin en Eje/input_Contrasea_login'))

//WebUI.verifyElementText(findTestObject('PfindTestObject('Object Repository/Prueba_1/Page_ToolsQA/input_Email_userEmail')rueba_1/Page_ToolsQA/input_Full Name_userName'), 'Error 404')
WebUI.verifyElementText(findTfindTestObject('Object Repository/otra prueba/Page_/h1_Error 404'), 'ssdsadasd')

//--sqlrun.
WebUI.closeBrowser()

WebUI.acceptAlert()

CustomKeywords.'com.kms.katalon.keyword.applitools.BasicKeywords.checkWindow'('')

