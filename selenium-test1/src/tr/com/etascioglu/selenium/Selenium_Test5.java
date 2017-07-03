package tr.com.etascioglu.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test5 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.yahoo.com/");
		driver.manage().window().maximize();
		// Nesne olu�turmadan direk olarak browser nesnesiyle element yerine
		// id leri kulllnarak bo�luk ve tu�u kullanm�� olduk.
		driver.findElement(By.id("uh-search-box")).sendKeys("epia�");
		// Gerekli elemente epia�� aratt�m. id yerine css bilgisiyle de arama yap�labilir.
		driver.findElement(By.cssSelector("//*[@id='uh-search-box']")).click();
		// G�rebilmek i�in zaman verdik ms cinsinden.
		Thread.sleep(5000);
		// Browser� kapatt�k.
		driver.quit();
		// Buda xpath ile �a��rmak istersek. //*[@id="uh-search-box"] =>> detayl� arama yapmak i�in 
	}
}
