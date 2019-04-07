package testcase;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import base.Configuration;
import locators.ExpediaSearch;
import locvalue.Value;

public class Tc01 extends Configuration {
	ExpediaSearch locator = new ExpediaSearch();
	Value val = new Value();
	@Test (priority = 1)
	public void signIn() {
		clickByXpath(locator.accountLocator);
		clickByXpath(locator.signinLocator);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		typeByXpath(locator.locateID, val.idValue);
		typeByXpath(locator.locatePass,val.passValue);
		appLog.info("End of test");
	}
	/*
	@Test (priority = 3, enabled = false)
	public void update() {
		
	}
	
	//@Test (priority = 2)
	@Test (dependsOnMethods = {"signIn"})
	public void signOut() {
		
	} */
}
