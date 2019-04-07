package base;

import utils.Function;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class Configuration extends Function {
	@Parameters({"url" ,"browser"})
	@BeforeTest
	public void browserInitializer(String url, String browser) {
		if(browser.equalsIgnoreCase("firefox")) {
		System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\Framework\\DRIVER\\geckodriver.exe");
		
		driver = new FirefoxDriver();

		driver.get(url);
		
		appLog.info("Browser launched.");
		}
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Framework\\DRIVER\\chromedriver.exe");
			
			driver = new ChromeDriver();

			driver.get(url);
			appLog.info("Browser launched.");
			}
		
	}
	/*
	@AfterTest
	public void afterTest() throws Exception {
		Thread.sleep(5000);
		driver.close();
		appLog.info("Browser clossed.");
	}
	*/
}
