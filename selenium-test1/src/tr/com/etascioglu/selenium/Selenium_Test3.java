package tr.com.etascioglu.selenium;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Selenium_Test3 {

	public static void main(String[] args) {
		//Sistem i�in gerekli gecko
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//Firefox browser nesnesi �rettim
		WebDriver driver = new FirefoxDriver();
		//A��lan browser ilgili adrese gitti.
		driver.get("https://www.google.com.tr/");
		//A��lan urlnin ba�l���n� yazd�rd�k
		System.out.print(driver.getTitle());
		// Bu yap�da ilgili sitenin ba�l��� buraya verilen ba�l�kla e�itse do�ru de�ilse yanlu� verdi
		try {
		Assert.assertTrue(driver.getTitle().contains("Google Search"));
		System.out.print("Title do�ru.");
		}
		catch(Error e){
			System.out.print("Title yanl��");
		}
		driver.close();
	}

}
