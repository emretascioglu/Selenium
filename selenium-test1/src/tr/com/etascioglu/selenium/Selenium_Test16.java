package tr.com.etascioglu.selenium;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Test16 {
	@Test
	public void mainn() throws InterruptedException {
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://borajet.com.tr/");
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		Thread.sleep(5000);
		WebElement element = driver.findElement(By.linkText("Kurumsal"));
		action.moveToElement(element).build().perform();
		Thread.sleep(3000);
		WebElement element1 = driver.findElement(By.xpath("/html/body/header/nav/ul/li[2]/ul/li[1]/a"));
		element1.click();
		Thread.sleep(3000);
		driver.quit();
	
	}
	@Test
	public void main() throws InterruptedException {
		/* Ýlgili örnekte gittigidiyora gidip arama yapýp çýkan ürünler farklý özelliklere göre sýralandý.
		 * JUnit kullandým.
		 * Ayný zamanda testin çalýþma durumuna göre geçtiði konsola yazdýrýldý.
		 * */
		System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.gittigidiyor.com/");
		if (true){
		driver.findElement(By.id("search_word")).sendKeys("Ýphone");
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
