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
		// Nesne oluşturmadan direk olarak browser nesnesiyle element yerine
		// id leri kulllnarak boşluk ve tuşu kullanmış olduk.
		driver.findElement(By.id("uh-search-box")).sendKeys("epiaş");
		// Gerekli elemente epiaşı arattım. id yerine css bilgisiyle de arama yapılabilir.
		driver.findElement(By.cssSelector("//*[@id='uh-search-box']")).click();
		// Görebilmek için zaman verdik ms cinsinden.
		Thread.sleep(5000);
		// Browserı kapattık.
		driver.quit();
		// Buda xpath ile çağırmak istersek. //*[@id="uh-search-box"] =>> detaylı arama yapmak için 
	}
}
