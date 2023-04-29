package pageAction

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import org.apache.commons.lang.RandomStringUtils
import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

public class RegisterPage {

	@Keyword
	public void enterPersonalDetails() {

		String firstName = "fname-"+RandomStringUtils.randomNumeric(5)

		String lastName = "lname-"+RandomStringUtils.randomNumeric(5)
		
		String email = "xyz"+RandomStringUtils.randomNumeric(3)+"@gmail.com"

		WebUI.sendKeys(findTestObject("Object Repository/RegisterPage/input_firstName"), firstName)

		WebUI.sendKeys(findTestObject("Object Repository/RegisterPage/input_lastName"), lastName)
		
		WebUI.sendKeys(findTestObject("Object Repository/RegisterPage/input_email"), email)
		
		WebUI.sendKeys(findTestObject("Object Repository/RegisterPage/input_telephone"), "123456789")
		
	}
	
	@Keyword
	public void enterPassword() {
		
		WebUI.sendKeys(findTestObject("Object Repository/RegisterPage/input_password"), "qwerty")
		
		WebUI.sendKeys(findTestObject("Object Repository/RegisterPage/input_confirmPassword"), "qwerty")
		
	}
	
	@Keyword
	public void clickLogin() {
		
		WebUI.click(findTestObject("Object Repository/RegisterPage/checkbox_term"))
		
		WebUI.click(findTestObject("Object Repository/RegisterPage/button_continue"))
	}
}
