package tr.com.etascioglu.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Chrome {

	public static void main(String[] args) {
		
		// TODO  1!! ! !!! ! !path yolu bozuk
		
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Emre\\Desktop\\chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.tr/");
		System.out.println(driver.getTitle());
		
	}

}
