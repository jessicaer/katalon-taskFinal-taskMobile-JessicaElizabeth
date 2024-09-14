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

Mobile.tap(findTestObject('page_Dashboard/android.widget.button_Add-Task'), 0)

Mobile.verifyElementVisible(findTestObject('page_Add-Task/android.widget.lbl_Add-Task'), 0)

Mobile.setText(findTestObject('Object Repository/page_Add-Task/android.widget.input_Task-Title'), taskTitle, 0)

Mobile.setText(findTestObject('Object Repository/page_Add-Task/android.widget.input_Task-Desc'), enterYourTask, 0)

Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.Set-Date'), 0)

Mobile.tap(findTestObject('page_Add-Task/android.view.View - 15'), 0)

Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.button_Date-OKE'), 0)

Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.Set-Time'), 0)

Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.Time-Picker_Hours'), 0)

Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.Time-Picker_Minute'), 0)

Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.button_Time-OKE'), 0)

Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.Spinner'), 0)

'Memilih Category'
Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.CheckedTextView - Personal'), 0)
//def select_dropdown = category
//switch(select_dropdown) {
//	case select_dropdown = 'Banking':
//		println(select_dropdown)
//		Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.CheckedTextView - Banking'), 0)
//		break
//
//	case select_dropdown = 'Business':
//		println(select_dropdown)
//		Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.CheckedTextView - Business'), 0)
//		break
//
//	case select_dropdown = 'Insurance':
//		println(select_dropdown)
//		Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.CheckedTextView - Insurance'), 0)
//		break
//		
//	case select_dropdown = 'Personal':
//		println(select_radio)
//		Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.CheckedTextView - Personal'), 0)
//		break
//		
//	case select_dropdown = 'Shopping':
//		println(select_radio)
//		Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.CheckedTextView - Shopping'), 0)
//		break
//		
//	default:
//		println(select_dropdown)
//		Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.CheckedTextView - Banking'), 0)
//		break
//}


Mobile.tap(findTestObject('Object Repository/page_Add-Task/android.widget.submitButton'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/page_Add-Task/android.widget.TextView - Katalon Class'), taskTitle)

Mobile.verifyElementText(findTestObject('Object Repository/page_Add-Task/android.widget.TextView - Mobile, API'), enterYourTask)

Mobile.closeApplication()

