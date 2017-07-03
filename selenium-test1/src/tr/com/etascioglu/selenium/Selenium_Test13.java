package tr.com.etascioglu.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test13 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.dsdamat.com/urun/twn-ayakkabi-402848.html");
		driver.manage().window().maximize();
		driver.findElement(By.cssSelector("#ctl00_u9_ascUrunDetay_dtUrunDetay_ctl00_pnlSepet > div.urunDetay_btnSepeteAt > table > tbody > tr > th > a")).click();		
		
		//Nesneyi birden fazla uyarý seçneceðimiz varsa alýyoruz. Yoksa tekte swtich edilebilir.
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		System.out.print("Basarili.");
		
		Thread.sleep(10000);
		driver.quit();

	}

}
