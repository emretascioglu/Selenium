package tr.com.etascioglu.selenium;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test17 {
	
	@Test
	public void loadtest() {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.epias.com.tr/");
		System.out.println(driver.getTitle());
		driver.quit();

	}

}
