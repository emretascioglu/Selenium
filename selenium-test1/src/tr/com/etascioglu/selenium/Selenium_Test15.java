package tr.com.etascioglu.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Test15 {
	@Test
	public void main() throws InterruptedException {
		/* �lgili �rnekte gittigidiyora gidip arama yap�p ��kan �r�nler farkl� �zelliklere g�re s�raland�.
		 * JUnit kulland�m.
		 * Ayn� zamanda testin �al��ma durumuna g�re ge�ti�i konsola yazd�r�ld�.
		 * */
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gittigidiyor.com/");
		if (true){
		driver.findElement(By.id("search_word")).sendKeys("�phone");
		driver.findElement(By.id("header_find_button")).click();
		Thread.sleep(3000);
		Select select = new Select(driver.findElement(By.id("order_selectbox")));
		select.selectByVisibleText("Fiyat: Azalan");
		}
		System.out.print("Pass !");
		Thread.sleep(3000);
		driver.quit();
	}

}
