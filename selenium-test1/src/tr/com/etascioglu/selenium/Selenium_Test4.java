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
		// Browser� y�neterek pencereyi b�y�tt�k.
		driver.manage().window().maximize();
		//Bo�lu�un name e g�re isimini al�p element nesensine ata�m.
		WebElement element = driver.findElement(By.name("q"));
		// Gerekli elemente epia�� aratt�m.
		element.sendKeys("Epia�");
		element.submit();
		// G�rebilmek i�in zaman verdik milisanye cinsinden.
		Thread.sleep(13000);
		driver.quit();
	}
}
