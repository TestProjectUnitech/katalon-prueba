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

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/a_Crear actuacin'), 'Crear actuación')

WebUI.click(findTestObject('Object Repository/Pruebas varias/a_Crear actuacin'))

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/span_CREAR ACTUACIN'), 'CREAR ACTUACIÓN')

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/h5_Elegir Modelo'), 'Elegir Modelo')

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/input_Importar Actuacin_sa-fileInput'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_search'))

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/h4_Buscar Modelos de Actuaciones'), 'Buscar Modelos de Actuaciones', 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_filter_altOcultar filtros'), 0)

WebUI.sendKeys(findTestObject('Object Repository/Pruebas varias/input_filter_alt_codigo'), tipo_actuacion)

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_mab-buscar'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/a_PS103'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/div_LEYENDA_LOGOEXP_ORG_RAD  EXP_SEC_RADEXP_094c14'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_Siguiente'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_Siguiente'))

WebUI.setText(findTestObject('Object Repository/Pruebas varias/textarea_Privado_observaciones'), 'Test Automatico - KAT')

not_run: WebUI.sendKeys(findTestObject('Object Repository/Pruebas varias/textarea_Privado_observaciones'), 'Test Automatico - KAT')

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_Siguiente'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_Siguiente'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/input_Subir Adjunto_sa-fileInput'), 0)

WebUI.uploadFile(findTestObject('Object Repository/Pruebas varias/input_file'), GlobalVariable.ruta_adjunto)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/mat-row_deletePrueba.pdfPblico Privado'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/em_delete'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/em_delete'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Pruebas varias/mat-row_deletePrueba.pdfPblico Privado'), 
    0)

WebUI.uploadFile(findTestObject('Object Repository/Pruebas varias/input_file'), GlobalVariable.ruta_adjunto)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/mat-row_deletePrueba.pdfPblico Privado'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/em_delete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_Cancelar'), 0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/button_Guardar y Finalizar'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Guardar y Finalizar'))

WebUI.delay(5)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/snack-bar-container_Se ha firmado la Actuac_0f8f2c'), 
    0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Ver'))

WebUI.switchToWindowIndex(1)

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/span_BORRADOR'))

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/span_BORRADOR'), 'BORRADOR')

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/em_attach_file'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/em_attach_file'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/h4_Adjuntos de la actuacin 436402022'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/strong_Nombre'), 'Nombre')

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/strong_Usuario'), 'Usuario')

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/strong_Fecha'), 'Fecha')

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/strong_Nivel Acceso'), 'Nivel Acceso')

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/strong_Firma Digital'), 'Firma Digital')

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_get_appDescargar todo'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/span_remove_red_eye'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/button_shareCompartir'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/button_shareCompartir'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/span_get_app'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/span_clear'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Prueba.pdf'))

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/label_Nombre del adjunto'), 'Nombre del adjunto')

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/label_Nivel de Acceso'), 'Nivel de Acceso')

WebUI.setText(findTestObject('Object Repository/Pruebas varias/input_Nombre del adjunto_adj-nombre'), 'Prueba.pdf1')

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/button_Actualizar'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Actualizar'))

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/snack-bar-container_Eliminacin de adjunto p_541b0a'), 
    FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('Object Repository/Pruebas varias/snack-bar-container_Eliminacin de adjunto p_541b0a'), 
    'Edición de adjunto procesada', FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/em_attach_file'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/em_attach_file'))

WebUI.click(findTestObject('Object Repository/Pruebas varias/span_Prueba.pdf'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/em_delete'), 0)

WebUI.click(findTestObject('Object Repository/Pruebas varias/em_delete'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/snack-bar-container_Eliminacin de adjunto p_541b0a'), 
    0)

WebUI.verifyElementText(findTestObject('Pruebas varias/snack-bar-container_Eliminacin de adjunto p_541b0a'), 'Eliminación de adjunto procesada')

WebUI.refresh()

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Pruebas varias/em_attach_file'), 0)

WebUI.waitForElementVisible(findTestObject('Object Repository/Pruebas varias/button_Explore Archivos'), 0)

WebUI.uploadFile(findTestObject('Pruebas varias/button_Explore Archivos'), GlobalVariable.ruta_adjunto)

WebUI.verifyElementPresent(findTestObject('Object Repository/Pruebas varias/snack-bar-container_Eliminacin de adjunto p_541b0a'), 
    0)

WebUI.verifyElementVisible(findTestObject('Object Repository/Pruebas varias/em_attach_file'))

WebUI.verifyElementNotPresent(findTestObject('Object Repository/Pruebas varias/button_Explore Archivos'), 0)

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

