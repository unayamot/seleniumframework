package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.By;

public class Function {
	
	public static WebDriver driver;
	public static Logger appLog = Logger.getLogger("devpinoyLogger");
	//public static Logger appLog = LogManager.getRootLogger();
	public void typeByXpath(String locators, String values) {
		try {
			driver.findElement(By.xpath(locators)).clear();
			driver.findElement(By.xpath(locators)).sendKeys(values);
			appLog.error("Xpath located");
		}
		catch (Exception e) {
		}
	}
	public void typeName(String locators, String values) {
		driver.findElement(By.name(locators)).clear();
		driver.findElement(By.name(locators)).sendKeys(values);
	}
	public void typeId(String locators, String values) {
		driver.findElement(By.name(locators)).clear();
		driver.findElement(By.name(locators)).sendKeys(values);
	}
	public void clickByXpath(String locators) {
		try {
			driver.findElement(By.xpath(locators)).click();
		}
		catch (Exception e) {
		}
	}
	public void dropdownByXpath(String locators, String values) {
		WebElement dd = driver.findElement(By.xpath(locators));
		Select ddSelect = new Select(dd);
		ddSelectByIndex(ddSelect);
	}
	public void dropdownById(String locators, String values) {
		WebElement dd = driver.findElement(By.xpath(locators));
		Select ddSelect = new Select(dd);
		ddSelectByIndex(ddSelect, values);
	}
	public void ddSelectByIndex(Select sValue) {
		sValue.selectByIndex(5);
	}
	public void ddSelectByIndex(Select sValue, String value) {
		sValue.selectByValue(value);
	}
	public void radioButtonByXpath(String locatorF, String locatorM) {
		boolean isSelectedGender = driver.findElement(By.xpath(locatorF)).isSelected();
		if(isSelectedGender) {
			driver.findElement(By.xpath(locatorM)).click();
		}
		else
			driver.findElement(By.xpath(locatorF)).click();
	}
	public void maxPage () {
		driver.manage().window().maximize();
	}
}
