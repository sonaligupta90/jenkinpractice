package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class AddCustomer2 extends BasePage2  {
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[3]/div[1]/div/div/div/div[1]/h5") WebElement ADD_CONTACT_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"phone\"]") WebElement PHONE_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"country\"]") WebElement COUNTRY_ELEMENT;
	@FindBy(how = How.XPATH, using= "//button[@id = 'submit']")WebElement SUBMIT_BUTTON_ELEMENT;
	
	public AddCustomer2(WebDriver driver) {
		this.driver = driver;
	}
	
	public void verifyAddContactHeader(String AddContactHeader) {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfAllElements(ADD_CONTACT_HEADER_ELEMENT));
		Assert.assertEquals(ADD_CONTACT_HEADER_ELEMENT.getText(), AddContactHeader, "Wrong page!");
		
	}
	
	public void insertFullName(String fullname) {
		FULL_NAME_ELEMENT.sendKeys(fullname + generatedRndNum(999));
	}

	public void selectCompanyName(String company) {
		selectFrmDropDown(COMPANY_ELEMENT,company);
	}
	
	public void insertEmail(String email) {
		EMAIL_ELEMENT.sendKeys(generatedRndNum(9999) + email);
	}
	
	public void insertPhone(String phoneNum) {
		PHONE_ELEMENT.sendKeys(phoneNum + generatedRndNum(999));
	}
	
	public void selectCountry(String country) {
		selectFrmDropDown(COUNTRY_ELEMENT, country);
	}
	
	public void submit() {
		SUBMIT_BUTTON_ELEMENT.click();
	}
}
