package tr.com.etascioglu.selenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test3 {

	public static void main(String[] args) {
		//Sistem için gerekli gecko
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//Firefox browser nesnesi ürettim
		WebDriver driver = new FirefoxDriver();
		//Açýlan browser ilgili adrese gitti.
		driver.get("https://www.google.com.tr/");
		//Açýlan urlnin baþlýðýný yazdýrdýk
		System.out.print(driver.getTitle());
		// Bu yapýda ilgili sitenin baþlýðý buraya verilen baþlýkla eþitse doðru deðilse yanluþ verdi
		try {
		Assert.assertTrue(driver.getTitle().contains("Google Search"));
		System.out.print("Title doðru.");
		}
		catch(Error e){
			System.out.print("Title yanlýþ");
		}
		driver.close();
	}

}
