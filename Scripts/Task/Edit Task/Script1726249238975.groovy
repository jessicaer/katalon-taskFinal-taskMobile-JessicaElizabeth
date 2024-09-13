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

Mobile.startApplication(GlobalVariable.apk, true)

Mobile.tap(findTestObject('page_Dashboard/android.widget.TextView - Skip'), 0)

WebUI.callTestCase(findTestCase('Blocks/Add Task'), [('taskTitle') : 'Katalon Class', ('enterYourTask') : 'Mobile, API'], 
    FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Object Repository/page_Dashboard/android.widget.button_kebab-menu'), 0)

Mobile.tap(findTestObject('Object Repository/page_Dashboard/android.widget.button_Edit'), 0)

'Masih Error'
Mobile.setText(findTestObject('Object Repository/page_Edit-Task/android.widget.input_updateTitleTask'), updateTitleTask, 
    0)

Mobile.setText(findTestObject('Object Repository/page_Edit-Task/android.widget.input_updateTitleDesc'), updateTaskDesc, 
    0)

Mobile.tap(findTestObject('page_Add-Task/android.widget.submitButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/page_Edit-Task/android.widget.TextView - Katalon Final Task'), 
    updateTitleTask)

Mobile.verifyElementText(findTestObject('Object Repository/page_Edit-Task/android.widget.TextView - Mobile, Web, API'), 
    updateTaskDesc)

Mobile.verifyElementText(findTestObject('Object Repository/page_Edit-Task/android.widget.TextView - Banking'), 'Banking')

Mobile.closeApplication()

