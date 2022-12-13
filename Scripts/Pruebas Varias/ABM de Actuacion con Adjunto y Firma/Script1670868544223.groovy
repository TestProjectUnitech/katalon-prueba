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

WebUI.verifyElementInViewport(findTestObject('Object Repository/Pruebas varias/button_add_circleCrear'), 50)

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_add_circleCrear'))

WebUI.verifyElementInViewport(findTestObject('Object Repository/Pruebas varias/a_Crear actuacin'), 50)

WebUI.click(findTestObject('Object Repository/Pruebas varias/a_Crear actuacin'))

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/span_CREAR ACTUACIN'), 'CREAR ACTUACIÓN')

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_search'))

WebUI.verifyElementInViewport(findTestObject('Object Repository/Pruebas varias/mat-dialog-container_Buscar Modelos de Actu_78a194'), 
    50, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/h4_Buscar Modelos de Actuaciones'), 'Buscar Modelos de Actuaciones', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_filter_altOcultar filtros'), 0)

WebUI.sendKeys(findTestObject('Object Repository/Pruebas varias/input_filter_alt_codigo'), tipo_actuacion)

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_mab-buscar'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/a_PS103'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/div_LEYENDA_LOGOEXP_ORG_RAD  EXP_SEC_RADEXP_094c14'), 
    0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/Pruebas varias/textarea_Privado_observaciones'), 'Test Automatico - KAT')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Pruebas varias/textarea_Privado_observaciones'), 'Test Automatico - KAT')

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_Siguiente'))

WebUI.uploadFile(findTestObject('Object Repository/Pruebas varias/input_file'), GlobalVariable.ruta_adjunto)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/mat-row_deletePrueba.pdfPblico Privado'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_Guardar y Finalizar'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Guardar y Finalizar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/span_Se ha creado Actuacin 426472022'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Ver'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_Firmar'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Firmar'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/ul_Con token  Sin token'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/a_Con token'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/h4_Firma Digital'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/h4_Firma Digital'), 'Firma Digital')

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/div_EXP J-01-00009241-62021-0'), 'EXP J-01-00009241-6/2021-0')

WebUI.click(findTestObject('Object Repository/Pruebas varias/div_Nestor firma1_mat-select-arrow'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Cayt Rao'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Pruebas varias/button_Firmar_1'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_Firmar_1'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/snack-bar-container_Se ha firmado la Actuac_0f8f2c'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/span_FIRMADA'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/span_FIRMADA'), 'FIRMADA')

