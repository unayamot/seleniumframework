package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.Configuration;
import locators.ExpediaSearch;
import locvalue.Value;

public class TC02_jfk extends Configuration {
	ExpediaSearch locator = new ExpediaSearch();
	Value val = new Value();
	@Test (priority = 1)
	public void selectJFK() throws InterruptedException {
		typeByXpath(locator.flyingFromLocator, val.flightVal1);
		Thread.sleep(2500);
		clickByXpath(locator.selectJFK);
	}
}
