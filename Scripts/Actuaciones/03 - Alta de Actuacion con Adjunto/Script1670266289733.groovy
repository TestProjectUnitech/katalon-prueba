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

WebUI.click(findTestObject('Object Repository/Page_Actuaciones/button_add_circleCrear'))

WebUI.click(findTestObject('Object Repository/Page_Actuaciones/a_Crear actuacin'))

WebUI.verifyElementClickable(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/em_search'))

WebUI.click(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/em_search'))

WebUI.sendKeys(findTestObject('Object Repository/Page_Actuaciones/input_filter_alt_codigo'), tipo_actuacion)

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Actuaciones/button_mab-buscar'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Actuaciones/button_mab-buscar'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Actuaciones/a_PS103'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Actuaciones/a_PS103'))

WebUI.waitForElementClickable(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_Siguiente'), 
    5)

WebUI.verifyElementClickable(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_Siguiente'))

WebUI.doubleClick(findTestObject('Actuaciones/03 - Alta de Actuaciones/Page_Actuaciones/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/Page_Actuaciones/textarea_Privado_observaciones'), 'Test Automatico - KAT')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Page_Actuaciones/textarea_Privado_observaciones'), 'Test Automatico - KAT')

WebUI.click(findTestObject('Object Repository/Page_Actuaciones/button_Siguiente'))

WebUI.uploadFile(findTestObject('Object Repository/Page_Actuaciones/input_file'), GlobalVariable.ruta_adjunto)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Actuaciones/mat-row_deletePrueba.pdfPblico Privado'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Actuaciones/button_Guardar y Finalizar'), 0)

WebUI.click(findTestObject('Object Repository/Page_Actuaciones/span_Guardar y Finalizar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Actuaciones/span_Se ha creado Actuacin 426472022'), 0)

WebUI.closeBrowser()

