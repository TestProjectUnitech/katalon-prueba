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

CustomKeywords.'com.unitech.testcase.basicos.testcase_basicos.abrirNavegador'()

WebUI.click(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_add_circleCrear'))

WebUI.click(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/a_Crear actuacin'))

WebUI.click(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_search'))

WebUI.takeElementScreenshot(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_search'))

WebUI.setText(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/input_filter_alt_codigo'), tipo_actuacion)

WebUI.sendKeys(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/input_filter_alt_codigo'), 
    tipo_actuacion)

WebUI.click(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_mab-buscar'))

WebUI.click(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/a_PS103'))

WebUI.click(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/textarea_Privado_observaciones'), 
    'Test Automatico - KAT')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/textarea_Privado_observaciones'), 
    'Test Automatico - KAT')

WebUI.click(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_Siguiente'))

WebUI.uploadFile(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/input_file'), GlobalVariable.ruta_adjunto)

WebUI.verifyElementPresent(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/mat-row_deletePrueba.pdfPblico Privado'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_Guardar y Finalizar'), 
    0)

WebUI.click(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/span_Guardar y Finalizar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/span_Se ha creado Actuacin 426472022'), 
    0)

WebUI.closeBrowser()

