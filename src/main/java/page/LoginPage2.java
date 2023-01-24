package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage2 {
	
	
	@FindBy(how = How.XPATH,using = "//input[@id ='username']")WebElement USER_NAME_ELEMENT;
	@FindBy (how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_ELEMENT;
	@FindBy (how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_BUTTON_ELEMENT;

	
	public void enterUsername(String username) {
		USER_NAME_ELEMENT.sendKeys(username);
	
	}
	public void enterPassword(String password) {
		PASSWORD_ELEMENT.sendKeys(password);
		
	}
	public void clickOnLoginButton() {
		SIGNIN_BUTTON_ELEMENT.click();
		
	}
	
	
}
