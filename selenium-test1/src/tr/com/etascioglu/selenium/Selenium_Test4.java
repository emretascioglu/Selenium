package tr.com.etascioglu.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.tr/");
		// Browserý yöneterek pencereyi büyüttük.
		driver.manage().window().maximize();
		//Boþluðun name e göre isimini alýp element nesensine ataým.
		WebElement element = driver.findElement(By.name("q"));
		// Gerekli elemente epiaþý arattým.
		element.sendKeys("Epiaþ");
		element.submit();
		// Görebilmek için zaman verdik milisanye cinsinden.
		Thread.sleep(13000);
		driver.quit();
	}
}
