package page;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class DashboardPage2 {
	WebDriver driver;
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement DASHBOARD_HEADER_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/a/span[1]") WebElement CUSTOMER_MENU_ELEMENT;
	@FindBy(how = How.XPATH, using = "//*[@id=\"side-menu\"]/li[3]/ul/li[1]/a") WebElement ADD_CUSTOMER_MENU_ELEMENT;

	
	
	
	public void verifyDashBoardPage(String dashboardtext) {
		Assert.assertEquals(DASHBOARD_HEADER_ELEMENT.getText(), dashboardtext, "Wrong page!");
		}
	
	public void clickOnCustomer() {
		CUSTOMER_MENU_ELEMENT.click();
		} 
	
	public void clickOnAddCustomer() {
		ADD_CUSTOMER_MENU_ELEMENT.click();
		} 

}
