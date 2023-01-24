package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserFactory2 {
	static WebDriver driver;
	static String browser;
	static String url;
	
	public static void readConfig() throws IOException {
		
		FileInputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
		Properties prop = new Properties();
		prop.load(input);
		browser = prop.getProperty("browser");
		url = prop.getProperty("url");
		}
	
	public static WebDriver init() throws IOException {
		readConfig();
		if(browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver","driver109\\chromedriver.exe");
		    driver = new ChromeDriver ();
		}
		else if(browser.equalsIgnoreCase("Firefox")){
			System.setProperty("webdriver.gecko.driver", "drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	    }
	
	public static void tearDown() {
		driver.close();
		driver.quit();
	}

	
	

}
