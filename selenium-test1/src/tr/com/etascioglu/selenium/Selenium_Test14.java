package tr.com.etascioglu.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Test14 {
	//Combo box dropdown gibi se�enek olan sayfalar i�in select(se�im) �rne�i.
	@Test
	// !! JUnit testleri static olamaz ve parametre alan s�n�f i�eremez buna �a��
	public static void main(String[] args) throws InterruptedException {	
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.turkishairlines.com/tr-tr/");
		driver.findElement(By.cssSelector("#Main-Quick-Search-Ticket > div.box-blue.radius-4px > div.left > div:nth-child(1) > span.search.float-left")).click();
		Select select = new Select(driver.findElement(By.id("ascfrom")));
		select.selectByVisibleText("FRANSA");
		/* Testte istenilen sonu� ger�ekle�iyorsa bi�ey handle etmemiz laz�m yada bi if-else'e d��memiz laz�m bunun
		 * sonucunda istenilen verilen ��kt�ya pass yada failed verebiliriz.	
		*/
		System.out.print("Pass ! ");
		Thread.sleep(5000);
		driver.quit();
		
	
	}

}
