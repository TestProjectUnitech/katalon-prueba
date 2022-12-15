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
import java.sql.ResultSet as ResultSet

CustomKeywords.'com.unitech.varios.oradatabase.connectDB'(GlobalVariable.DB_server_ip, GlobalVariable.DB_port, GlobalVariable.DB_svname, GlobalVariable.DB_user,
	GlobalVariable.DB_password)

//ResultSet rsl

//rsl = CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'(consulta)

//CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'(consulta)


CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM EVENT_ENTITY ee WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_ADDRESSES ua WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_ATTRIBUTE ua2 WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_BAIDS ub WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_CONSENT_CLIENT_SCOPE WHERE USER_CONSENT_ID IN (SELECT ID FROM USER_CONSENT uc WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%'))")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_CONSENT uc WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_EMAILS ue WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_ROLE_MAPPING urm WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM FEDERATED_IDENTITY fi WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM CREDENTIAL fi WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_REQUIRED_ACTION fi WHERE USER_ID IN (select id from user_entity where document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%')")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("DELETE FROM USER_ENTITY ue WHERE document_number LIKE '%20434473625%' and document_nacionality_id LIKE '%11%'")
CustomKeywords.'com.unitech.varios.oradatabase.executeQuery'("COMMIT")

//if (rsl.next()) {
//	cantidad_rows = rsl.getInt('cantidad')
//}

CustomKeywords.'com.unitech.varios.oradatabase.closeDatabaseConnection'()

//WebUI.verifyGreaterThan(cantidad_rows, 0)



