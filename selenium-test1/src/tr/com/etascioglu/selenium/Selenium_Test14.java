package tr.com.etascioglu.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Test14 {
	//Combo box dropdown gibi seçenek olan sayfalar için select(seçim) örneði.
	@Test
	// !! JUnit testleri static olamaz ve parametre alan sýnýf içeremez buna çaýþ
	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.turkishairlines.com/tr-tr/");
		driver.findElement(By.cssSelector("#Main-Quick-Search-Ticket > div.box-blue.radius-4px > div.left > div:nth-child(1) > span.search.float-left")).click();
		Select select = new Select(driver.findElement(By.id("ascfrom")));
		select.selectByVisibleText("FRANSA");
		/* Testte istenilen sonuç gerçekleþiyorsa biþey handle etmemiz lazým yada bi if-else'e düþmemiz lazým bunun
		 * sonucunda istenilen verilen çýktýya pass yada failed verebiliriz.	
		*/
		System.out.print("Pass ! ");
		Thread.sleep(5000);
		driver.quit();
		
	
	}

}
